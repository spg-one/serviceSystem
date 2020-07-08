package com.adufeitian.servicesystem.service;

import com.adufeitian.servicesystem.mybatis.domain.ComplainInfor;
import com.adufeitian.servicesystem.mybatis.domain.ComplainInforExample;
import com.adufeitian.servicesystem.mybatis.mapper.ComplainInforMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ComplainService {

    @Autowired
    ComplainInforMapper complainInforMapper;

    ComplainInforExample complainInforExample = new ComplainInforExample();

    public Map<String,Object> getComplainInforById(int id,String business){
        ComplainInforExample.Criteria criteria = complainInforExample.createCriteria();
        criteria.andComBusinessEqualTo(business);
        criteria.andComplainIdEqualTo(id);
        List<ComplainInfor> list = complainInforMapper.selectByExample(complainInforExample);
        Map<String,Object> map = new HashMap<>();
        for(int i = 0;i<list.size();i++){
            String num = String.valueOf(i+1);
            map.put(num,list.get(i));
        }
        return map;

    }

    public Map<String,Object> getComplainInforByPerson(String person,String business){
        ComplainInforExample.Criteria criteria = complainInforExample.createCriteria();
        criteria.andComBusinessEqualTo(business);
        criteria.andComPersonEqualTo(person);
        List<ComplainInfor> list = complainInforMapper.selectByExample(complainInforExample);
        Map<String,Object> map = new HashMap<>();
        for(int i = 0;i<list.size();i++){
            String num = String.valueOf(i+1);
            map.put(num,list.get(i));
        }
        return map;
    }

}
