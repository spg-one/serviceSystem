package com.adufeitian.servicesystem.controller;

import com.adufeitian.servicesystem.mybatis.domain.ServiceInfor;
import com.adufeitian.servicesystem.mybatis.domain.ServiceLargeCategory;
import com.adufeitian.servicesystem.mybatis.domain.ServiceSmallCategory;
import com.adufeitian.servicesystem.service.ServiceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.reflect.generics.scope.Scope;

import java.util.List;
import java.util.Map;

@Controller
public class ServiceCategoryController {

    @Autowired
    ServiceCategoryService serviceCategoryService;


    @ResponseBody
    @RequestMapping(value = "/get_LC_infor")
    public List<ServiceLargeCategory>  getServiceLargeCategory(String SystemId,String name) {
        return serviceCategoryService.getServiceLargeCategory(SystemId,name);
    }


    @ResponseBody
    @RequestMapping("/get_SC_infor")
    public List<ServiceSmallCategory> getServiceSmallCategory(String SystemId, String name){
        return serviceCategoryService.getServiceSmallCategory(SystemId,name);
    }

    @ResponseBody
    @RequestMapping("/get_infor")
    public List<ServiceInfor> getServiceInfor(String LC_name, String SC_name){
        return serviceCategoryService.getServiceInfor(LC_name,SC_name);
    }

    @ResponseBody
    @RequestMapping("/getLcSc")
    public Map<String,List<String>> getLcSc(String LCname){
        Map<String,List<String>> map = serviceCategoryService.getLcSc();
        return map;
    }

    @ResponseBody
    @RequestMapping("/getLCall")
    public List<ServiceLargeCategory> getServiceLCall(){
        return serviceCategoryService.getServiceLCall();
    }

    @ResponseBody
    @RequestMapping("/getSCall")
    public List<ServiceSmallCategory> getServiceSCall(){
        return serviceCategoryService.getServiceSCall();
    }


    @ResponseBody
    @RequestMapping("/getInforAll")
    public List<ServiceInfor> getServiceInforAll(){
        return serviceCategoryService.getServiceInforAll();
    }

    @ResponseBody
    @RequestMapping("/deleteByLcSc")
    public String deleteByLcSc(int id){
        String if_sucess;
        int i = serviceCategoryService.deleteByLcAc(id);
        if(i==1){
            if_sucess="删除成功！";
        }else{
            if_sucess="删除失败！";
        }
        return if_sucess;
    }


    @ResponseBody
    @RequestMapping("/updateInfor")
    public String updateInfor(@RequestBody ServiceInfor serviceInfor){
        String if_sucess;
        int i = serviceCategoryService.updateByInfor(serviceInfor);
        if(i==1){
            if_sucess="更新成功！";
        }else{
            if_sucess="更新失败！";
        }
        return if_sucess;
    }

    @ResponseBody
    @RequestMapping("/insertInfor")
    public String insertInfor(@RequestBody ServiceInfor serviceInfor){
        String if_sucess;
        ServiceInfor serviceInfor1 = new ServiceInfor();
        int i = serviceCategoryService.insertByInfor(serviceInfor);
        if(i==1){
            if_sucess="添加成功！";
        }else{
            if_sucess="添加失败！";
        }
        System.out.println(if_sucess);
        return if_sucess;
    }

}
