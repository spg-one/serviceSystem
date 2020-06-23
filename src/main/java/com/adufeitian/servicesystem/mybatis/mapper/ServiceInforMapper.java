package com.adufeitian.servicesystem.mybatis.mapper;

import com.adufeitian.servicesystem.mybatis.domain.ServiceInfor;
import com.adufeitian.servicesystem.mybatis.domain.ServiceInforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceInforMapper {
    long countByExample(ServiceInforExample example);

    int deleteByExample(ServiceInforExample example);

    int deleteByPrimaryKey(Integer serviceId);

    int insert(ServiceInfor record);

    int insertSelective(ServiceInfor record);

    List<ServiceInfor> selectByExample(ServiceInforExample example);

    ServiceInfor selectByPrimaryKey(Integer serviceId);

    int updateByExampleSelective(@Param("record") ServiceInfor record, @Param("example") ServiceInforExample example);

    int updateByExample(@Param("record") ServiceInfor record, @Param("example") ServiceInforExample example);

    int updateByPrimaryKeySelective(ServiceInfor record);

    int updateByPrimaryKey(ServiceInfor record);
}