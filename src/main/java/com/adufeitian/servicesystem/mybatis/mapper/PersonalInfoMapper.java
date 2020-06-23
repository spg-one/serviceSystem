package com.adufeitian.servicesystem.mybatis.mapper;

import com.adufeitian.servicesystem.mybatis.domain.PersonalInfo;
import com.adufeitian.servicesystem.mybatis.domain.PersonalInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonalInfoMapper {
    long countByExample(PersonalInfoExample example);

    int deleteByExample(PersonalInfoExample example);

    int deleteByPrimaryKey(Integer personId);

    int insert(PersonalInfo record);

    int insertSelective(PersonalInfo record);

    List<PersonalInfo> selectByExample(PersonalInfoExample example);

    PersonalInfo selectByPrimaryKey(Integer personId);

    int updateByExampleSelective(@Param("record") PersonalInfo record, @Param("example") PersonalInfoExample example);

    int updateByExample(@Param("record") PersonalInfo record, @Param("example") PersonalInfoExample example);

    int updateByPrimaryKeySelective(PersonalInfo record);

    int updateByPrimaryKey(PersonalInfo record);
}