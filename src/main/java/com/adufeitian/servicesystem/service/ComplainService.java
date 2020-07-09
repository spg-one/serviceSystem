package com.adufeitian.servicesystem.service;

import com.adufeitian.servicesystem.mybatis.domain.ComplainInfor;
import com.adufeitian.servicesystem.mybatis.domain.ComplainInforExample;
import com.adufeitian.servicesystem.mybatis.mapper.ComplainInforMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class ComplainService {

    @Autowired
    ComplainInforMapper complainInforMapper;

    ComplainInforExample complainInforExample = new ComplainInforExample();

    public List<ComplainInfor> getComplainInforById(int id, String business, String dealState){
        ComplainInforExample.Criteria criteria = complainInforExample.createCriteria();
        criteria.andComBusinessEqualTo(business);
        criteria.andComplainIdEqualTo(id);
        criteria.andDealStateEqualTo(dealState);
        List<ComplainInfor> list = complainInforMapper.selectByExample(complainInforExample);
        complainInforExample.clear();
        return list;

    }

    public List<ComplainInfor> getComplainInforByPerson(String person, String business, String dealState){
        ComplainInforExample.Criteria criteria = complainInforExample.createCriteria();
        criteria.andComBusinessEqualTo(business);
        criteria.andComPersonEqualTo(person);
        criteria.andDealStateEqualTo(dealState);
        List<ComplainInfor> list = complainInforMapper.selectByExample(complainInforExample);
        complainInforExample.clear();
        return list;
    }

    public List<ComplainInfor> getComInforAll(){
        List<ComplainInfor> list = complainInforMapper.selectByExample(complainInforExample);
        return list;
    }

}
