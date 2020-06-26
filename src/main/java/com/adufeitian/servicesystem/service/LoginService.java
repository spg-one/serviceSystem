package com.adufeitian.servicesystem.service;

import com.adufeitian.servicesystem.config.MySessionContext;
import com.adufeitian.servicesystem.config.argumentResolver.HttpDomain;
import com.adufeitian.servicesystem.mybatis.domain.PersonalInfor;
import com.adufeitian.servicesystem.mybatis.domain.PersonalInforExample;
import com.adufeitian.servicesystem.mybatis.mapper.PersonalInforMapper;
import com.adufeitian.servicesystem.security.PasswordCipher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    private PersonalInforMapper personalInforMapper;
    public boolean loginActor(HttpDomain httpd, Integer personId) {
        boolean loginCheck = MySessionContext.getInstance().addSession(personId,httpd.session);
        if (!loginCheck) {
            httpd.setStatus(400);
            httpd.put("error","登录失败，该用户在不同设备上登录数量达到上限");
            return false;
        }
        httpd.session.setAttribute("personId",personId);
        return true;
    }
    public boolean logoutActor(HttpDomain httpd, Integer personId) {
        boolean logoutCheck = MySessionContext.getInstance().delSession(personId,httpd.session.getId());
        return logoutCheck;
    }
    public boolean login(HttpDomain httpd) {
        Integer personId = (Integer) httpd.session.getAttribute("personId");
        if (personId != null) {
            httpd.setStatus(400);
            httpd.put("error","请勿重复登录");
            return false;
        }
        String username = httpd.request.getParameter("username");
        String password = httpd.request.getParameter("password");
        PersonalInforExample personalInforExample = new PersonalInforExample();
        personalInforExample.createCriteria().andUserNameEqualTo(username);
        List<PersonalInfor> personalInfors = personalInforMapper.selectByExample(personalInforExample);
        //存在该用户名
        if(personalInfors.size() != 0) {
            PersonalInfor personalInfor = personalInfors.get(0);
            String encryptPassword = PasswordCipher.getEncryptPassword(password);
            //密码正确
            if(encryptPassword.equals(personalInfor.getPassword())) {
                //防止多点登录
                if (!loginActor(httpd, personalInfor.getPersonId())) {
                    return false;
                } else {
                    httpd.put("success","登录成功");
                    return true;
                }
            }
            //密码不正确
            else {
                httpd.setStatus(400);
                httpd.put("error","用户名或者密码不正确");
                return false;
            }
        }
        //不存在该用户名-判断邮箱
        else {
            personalInforExample.clear();
            personalInforExample.createCriteria().andEmailEqualTo(username);
            personalInfors = personalInforMapper.selectByExample(personalInforExample);
            if(personalInfors.size() != 0) {
                PersonalInfor personalInfor = personalInfors.get(0);
                String encryptPassword = PasswordCipher.getEncryptPassword(password);
                //密码正确
                if(encryptPassword.equals(personalInfor.getPassword())) {
                    //防止多点登录
                    if (!loginActor(httpd, personalInfor.getPersonId())) {
                        return false;
                    } else {
                        httpd.put("success","登录成功");
                        return true;
                    }
                } else {
                    httpd.setStatus(400);
                    httpd.put("error","用户名或者密码不正确");
                    return false;
                }
            } else {
                httpd.setStatus(400);
                httpd.put("error","用户名或者密码不正确");
                return false;
            }
        }
    }

    public boolean logout(HttpDomain httpd) {
        Integer personId = (Integer) httpd.session.getAttribute("personId");
        if (personId != null) {
            logoutActor(httpd, personId);
            httpd.put("success","登出成功");
            return true;
        } else {
            httpd.setStatus(400);
            httpd.put("error","请先登录");
            return false;
        }
    }
}
