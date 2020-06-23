package com.adufeitian.servicesystem.mybatis.mapper;

import com.adufeitian.servicesystem.mybatis.domain.ServiceSmallCategory;
import com.adufeitian.servicesystem.mybatis.domain.ServiceSmallCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceSmallCategoryMapper {
    long countByExample(ServiceSmallCategoryExample example);

    int deleteByExample(ServiceSmallCategoryExample example);

    int deleteByPrimaryKey(Integer scId);

    int insert(ServiceSmallCategory record);

    int insertSelective(ServiceSmallCategory record);

    List<ServiceSmallCategory> selectByExample(ServiceSmallCategoryExample example);

    ServiceSmallCategory selectByPrimaryKey(Integer scId);

    int updateByExampleSelective(@Param("record") ServiceSmallCategory record, @Param("example") ServiceSmallCategoryExample example);

    int updateByExample(@Param("record") ServiceSmallCategory record, @Param("example") ServiceSmallCategoryExample example);

    int updateByPrimaryKeySelective(ServiceSmallCategory record);

    int updateByPrimaryKey(ServiceSmallCategory record);
}