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
public class HelloService{
    @Autowired
    private PersonalInforMapper personalInforMapper;
    public String hello(){
        final PersonalInforExample personalInforExample = new PersonalInforExample();
        personalInforExample.createCriteria().andUserNameEqualTo("dxw");
        final List<PersonalInfor> personalInfors = personalInforMapper.selectByExample(personalInforExample);
        final PersonalInfor personalInfor = personalInfors.get(0);
        System.out.println(personalInfor.getEmail());
    
        final String encryptPassword = PasswordCipher.getEncryptPassword("123456");
        final PersonalInfor xyb = new PersonalInfor();
        xyb.setPassword(encryptPassword);
        xyb.setPersonId(2);
        personalInforMapper.updateByPrimaryKeySelective(xyb);
        
        
        return encryptPassword;
    }

}