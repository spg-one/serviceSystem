package com.adufeitian.servicesystem.mybatis.mapper;

import com.adufeitian.servicesystem.mybatis.domain.ServicerInfor;
import com.adufeitian.servicesystem.mybatis.domain.ServicerInforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicerInforMapper {
    long countByExample(ServicerInforExample example);

    int deleteByExample(ServicerInforExample example);

    int deleteByPrimaryKey(Integer servicerId);

    int insert(ServicerInfor record);

    int insertSelective(ServicerInfor record);

    List<ServicerInfor> selectByExample(ServicerInforExample example);

    ServicerInfor selectByPrimaryKey(Integer servicerId);

    int updateByExampleSelective(@Param("record") ServicerInfor record, @Param("example") ServicerInforExample example);

    int updateByExample(@Param("record") ServicerInfor record, @Param("example") ServicerInforExample example);

    int updateByPrimaryKeySelective(ServicerInfor record);

    int updateByPrimaryKey(ServicerInfor record);
}