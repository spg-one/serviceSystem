package com.adufeitian.servicesystem.mybatis.mapper;

import com.adufeitian.servicesystem.mybatis.domain.ComplainInfor;
import com.adufeitian.servicesystem.mybatis.domain.ComplainInforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplainInforMapper {
    long countByExample(ComplainInforExample example);

    int deleteByExample(ComplainInforExample example);

    int deleteByPrimaryKey(Integer complainId);

    int insert(ComplainInfor record);

    int insertSelective(ComplainInfor record);

    List<ComplainInfor> selectByExample(ComplainInforExample example);

    ComplainInfor selectByPrimaryKey(Integer complainId);

    int updateByExampleSelective(@Param("record") ComplainInfor record, @Param("example") ComplainInforExample example);

    int updateByExample(@Param("record") ComplainInfor record, @Param("example") ComplainInforExample example);

    int updateByPrimaryKeySelective(ComplainInfor record);

    int updateByPrimaryKey(ComplainInfor record);
}