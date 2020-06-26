package com.adufeitian.servicesystem.service;

import com.adufeitian.servicesystem.config.MySessionContext;
import com.adufeitian.servicesystem.config.argumentResolver.HttpDomain;
import com.adufeitian.servicesystem.mybatis.domain.PersonalInfor;
import com.adufeitian.servicesystem.mybatis.domain.PersonalInforExample;
import com.adufeitian.servicesystem.mybatis.mapper.PendingOrderMapper;
import com.adufeitian.servicesystem.mybatis.mapper.PersonalInforMapper;
import com.adufeitian.servicesystem.security.PasswordCipher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomePageService {
    @Autowired
    private PersonalInforMapper personalInforMapper;
    @Autowired
    private PendingOrderMapper pendingOrderMapper;
    
}