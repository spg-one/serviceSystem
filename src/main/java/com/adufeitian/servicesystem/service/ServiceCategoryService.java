package com.adufeitian.servicesystem.service;

import com.adufeitian.servicesystem.mybatis.domain.*;
import com.adufeitian.servicesystem.mybatis.mapper.ServiceInforMapper;
import com.adufeitian.servicesystem.mybatis.mapper.ServiceLargeCategoryMapper;
import com.adufeitian.servicesystem.mybatis.mapper.ServiceSmallCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ServiceCategoryService {

    @Autowired
    ServiceLargeCategoryMapper serviceLargeCategoryMapper;
    @Autowired
    ServiceSmallCategoryMapper serviceSmallCategoryMapper;
    @Autowired
    ServiceInforMapper serviceInforMapper;

    ServiceLargeCategoryExample serviceLargeCategoryExample = new ServiceLargeCategoryExample();
    ServiceSmallCategoryExample serviceSmallCategoryExample = new ServiceSmallCategoryExample();
    ServiceInforExample serviceInforExample = new ServiceInforExample();

    //大类查询
    public List<ServiceLargeCategory> getServiceLargeCategory(String SystemId, String name){
        ServiceLargeCategoryExample.Criteria criteria = serviceLargeCategoryExample.createCriteria();
        criteria.andSystemIdEqualTo(SystemId);
        criteria.andServiceNameEqualTo(name);
        List<ServiceLargeCategory> list = serviceLargeCategoryMapper.selectByExample(serviceLargeCategoryExample);
        serviceLargeCategoryExample.clear();
        return list;
    }

    //小类查询
    public List<ServiceSmallCategory> getServiceSmallCategory(String SystemId, String name){
        ServiceSmallCategoryExample.Criteria criteria = serviceSmallCategoryExample.createCriteria();
        criteria.andSystemIdEqualTo(SystemId);
        criteria.andSystemScNameEqualTo(name);
        List<ServiceSmallCategory> list = serviceSmallCategoryMapper.selectByExample(serviceSmallCategoryExample);
        serviceSmallCategoryExample.clear();
        return list;
    }

    //服务项目查询
    public List<ServiceInfor> getServiceInfor(String LC_name, String SC_name){
        ServiceInforExample.Criteria criteria = serviceInforExample.createCriteria();
        criteria.andSystemLcNameEqualTo(LC_name);
        criteria.andSystemScNameEqualTo(SC_name);
        List<ServiceInfor> list = serviceInforMapper.selectByExample(serviceInforExample);
        serviceInforExample.clear();
        return list;
    }

    //服务项目的输出框查询
    public Map<String,List<String>> getLcSc(){
        ServiceInforExample.Criteria criteria = serviceInforExample.createCriteria();

        serviceInforExample.setOrderByClause("system_lc_name");
        List<ServiceInfor> list = serviceInforMapper.selectByExample(serviceInforExample);
        Map<String,List<String>> map = new HashMap<>();
        List<String> list1 = new ArrayList<String>();
        for(int i =0;i<list.size();i++){
            if(i == 0){
                list1.add(list.get(i).getSystemScName());
                map.put(list.get(i).getSystemLcName(),list1);
                if((list.get(i).getSystemLcName()).equals(list.get(i+1).getSystemLcName())){

                }
                else{
                    list1=new ArrayList<String>();
                }
            }
            else{
                if(i+1<list.size()){
                    if((list.get(i).getSystemLcName()).equals(list.get(i+1).getSystemLcName())) {
                        if(!(list1.contains(list.get(i).getSystemScName()))){
                            list1.add(list.get(i).getSystemScName());
                            map.put(list.get(i).getSystemLcName(), list1);
                        }
                    }
                    else if((list.get(i-1).getSystemLcName()).equals(list.get(i).getSystemLcName())){
                        if(!(list1.contains(list.get(i).getSystemScName()))){
                            list1.add(list.get(i).getSystemScName());
                            map.put(list.get(i).getSystemLcName(), list1);
                        }
                        list1 = new ArrayList<String>();
                    }
                    else {
                        if(!(list1.contains(list.get(i).getSystemScName()))){
                            list1.add(list.get(i).getSystemScName());
                            map.put(list.get(i).getSystemLcName(), list1);
                        }
                        list1 = new ArrayList<String>();
                    }
                }
                if(i+1==list.size()){
                    if((list.get(i-1).getSystemLcName()).equals(list.get(i).getSystemLcName())){
                        if(!(list1.contains(list.get(i).getSystemScName()))){
                            list1.add(list.get(i).getSystemScName());
                            map.put(list.get(i).getSystemLcName(), list1);
                        }
                    }
                    else {
                        if(!(list1.contains(list.get(i).getSystemScName()))){
                            list1.add(list.get(i).getSystemScName());
                            map.put(list.get(i).getSystemLcName(), list1);
                        }
                    }
                }
            }
        }
        serviceInforExample.clear();
        return map;
    }

    //服务项目删除
    public int  deleteByLcAc(int id){
        ServiceInforExample.Criteria criteria = serviceInforExample.createCriteria();
        criteria.andServiceIdEqualTo(id);
        int if_true = serviceInforMapper.deleteByExample(serviceInforExample);
        serviceInforExample.clear();
        return if_true;
    }

    //服务项目更新
    public int updateByInfor(ServiceInfor serviceInfor){
        int if_true = serviceInforMapper.updateByPrimaryKey(serviceInfor);
        return if_true;
    }

    //服务项目新增
    public int insertByInfor(ServiceInfor serviceInfor){
        ServiceInfor serviceInfor1 = new ServiceInfor();
        serviceInfor1.setCharge(serviceInfor.getCharge());
        serviceInfor1.setSimpleInfo(serviceInfor.getSimpleInfo());
        serviceInfor1.setSystemLcName(serviceInfor.getSystemLcName());
        serviceInfor1.setSystemScName(serviceInfor.getSystemScName());
        int if_true = serviceInforMapper.insert(serviceInfor1);
        return if_true;
    }



    //大类查询所有
    public List<ServiceLargeCategory> getServiceLCall(){
        List<ServiceLargeCategory> list = serviceLargeCategoryMapper.selectByExample(serviceLargeCategoryExample);
        serviceLargeCategoryExample.clear();
        return list;
    }

    //小类查询所有
    public List<ServiceSmallCategory> getServiceSCall(){
        List<ServiceSmallCategory> list = serviceSmallCategoryMapper.selectByExample(serviceSmallCategoryExample);
        serviceSmallCategoryExample.clear();
        return list;
    }

    //服务项目查询所有
    public List<ServiceInfor> getServiceInforAll(){
        List<ServiceInfor> list =  serviceInforMapper.selectByExample(serviceInforExample);
        serviceInforExample.clear();
        return list;
    }

}
