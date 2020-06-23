package com.adufeitian.servicesystem.mybatis.mapper;

import com.adufeitian.servicesystem.mybatis.domain.ServiceLargeCategory;
import com.adufeitian.servicesystem.mybatis.domain.ServiceLargeCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceLargeCategoryMapper {
    long countByExample(ServiceLargeCategoryExample example);

    int deleteByExample(ServiceLargeCategoryExample example);

    int deleteByPrimaryKey(Integer lcId);

    int insert(ServiceLargeCategory record);

    int insertSelective(ServiceLargeCategory record);

    List<ServiceLargeCategory> selectByExample(ServiceLargeCategoryExample example);

    ServiceLargeCategory selectByPrimaryKey(Integer lcId);

    int updateByExampleSelective(@Param("record") ServiceLargeCategory record, @Param("example") ServiceLargeCategoryExample example);

    int updateByExample(@Param("record") ServiceLargeCategory record, @Param("example") ServiceLargeCategoryExample example);

    int updateByPrimaryKeySelective(ServiceLargeCategory record);

    int updateByPrimaryKey(ServiceLargeCategory record);
}