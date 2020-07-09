package com.adufeitian.servicesystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adufeitian.servicesystem.mybatis.mapper.ServicerInforMapper;
import com.adufeitian.servicesystem.mybatis.mapper.PersonalInforMapper;
import com.adufeitian.servicesystem.config.argumentResolver.HttpDomain;
import com.adufeitian.servicesystem.mybatis.domain.ServicerInfor;

@Service
public class ServicerInforService {
    @Autowired
    private ServicerInforMapper servicerInforMapper;
    @Autowired
    private PersonalInforMapper personalInforMapper;

    public boolean getServicerInfo(HttpDomain httpd){
        System.out.println(httpd.session.getAttribute("servicerId"));
        ServicerInfor servicerInfor = servicerInforMapper.selectByPrimaryKey((int)httpd.session.getAttribute("servicerId"));
        httpd.put("servicerInfor", servicerInfor);
        return true;
    }

    public ServicerInfor getDetail(int id){
        return servicerInforMapper.selectByPrimaryKey(id);
    }

    public int getServicerId(int person_id){
        return personalInforMapper.selectByPrimaryKey(person_id).getServicerId();
    }

    public boolean saveInfo(HttpDomain httpd){
        ServicerInfor servicerInfor = new ServicerInfor();
        servicerInfor.setServicerId((Integer)httpd.session.getAttribute("servicerId"));
        servicerInfor.setServicerPhone(httpd.request.getParameter("servicerPhone"));
        servicerInforMapper.updateByPrimaryKeySelective(servicerInfor);
        return true;
    }
}
