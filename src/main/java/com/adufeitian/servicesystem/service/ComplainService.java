package com.adufeitian.servicesystem.service;

import com.adufeitian.servicesystem.mybatis.domain.ComplainInfor;
import com.adufeitian.servicesystem.mybatis.domain.ComplainInforExample;
import com.adufeitian.servicesystem.mybatis.domain.ComplainInforTime;
import com.adufeitian.servicesystem.mybatis.mapper.ComplainInforMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


@Service
public class ComplainService {

    @Autowired
    ComplainInforMapper complainInforMapper;

    ComplainInforExample complainInforExample = new ComplainInforExample();

    public List<ComplainInforTime> getComplainInforById(int id, String business, String dealState){
        ComplainInforExample.Criteria criteria = complainInforExample.createCriteria();
        criteria.andComBusinessEqualTo(business);
        criteria.andComplainIdEqualTo(id);
        criteria.andDealStateEqualTo(dealState);
        List<ComplainInfor> list = complainInforMapper.selectByExample(complainInforExample);
        complainInforExample.clear();
        return dateToTime(list);

    }

    public List<ComplainInforTime> getComplainInforByPerson(String person, String business, String dealState){
        ComplainInforExample.Criteria criteria = complainInforExample.createCriteria();
        criteria.andComBusinessEqualTo(business);
        criteria.andComPersonEqualTo(person);
        criteria.andDealStateEqualTo(dealState);
        List<ComplainInfor> list = complainInforMapper.selectByExample(complainInforExample);
        complainInforExample.clear();
        return dateToTime(list);
    }

    public List<ComplainInforTime> getComInforAll(){
        List<ComplainInfor> list = complainInforMapper.selectByExample(complainInforExample);
        return dateToTime(list);
    }

    public List<ComplainInforTime> dateToTime(List<ComplainInfor> list){
        List<ComplainInforTime> list1 = new ArrayList<ComplainInforTime>();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        ComplainInforTime complainInforTime = new ComplainInforTime();
        for(int i = 0;i<list.size();i++){
            complainInforTime.setBusiPhone(list.get(i).getBusiPhone());
            complainInforTime.setComBusiness(list.get(i).getComBusiness());
            complainInforTime.setComInfo(list.get(i).getComInfo());
            complainInforTime.setComPerson(list.get(i).getComPerson());
            complainInforTime.setComplainId(list.get(i).getComplainId());
            complainInforTime.setComWork(list.get(i).getComWork());
            complainInforTime.setDealDate(dateFormat.format(list.get(i).getDealDate()));
            complainInforTime.setDealEnding(list.get(i).getDealEnding());
            complainInforTime.setDealPerson(list.get(i).getDealPerson());
            complainInforTime.setDealState(list.get(i).getDealState());
            complainInforTime.setPersonPhone(list.get(i).getPersonPhone());
            complainInforTime.setServicerId(list.get(i).getServicerId());
            list1.add(complainInforTime);
            complainInforTime = new ComplainInforTime();
        }
        return list1;
    }

}
