package com.adufeitian.servicesystem.mybatis.mapper;

import com.adufeitian.servicesystem.mybatis.domain.PersonalInfor;
import com.adufeitian.servicesystem.mybatis.domain.PersonalInforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonalInforMapper {
    long countByExample(PersonalInforExample example);

    int deleteByExample(PersonalInforExample example);

    int deleteByPrimaryKey(Integer personId);

    int insert(PersonalInfor record);

    int insertSelective(PersonalInfor record);

    List<PersonalInfor> selectByExample(PersonalInforExample example);

    PersonalInfor selectByPrimaryKey(Integer personId);

    int updateByExampleSelective(@Param("record") PersonalInfor record, @Param("example") PersonalInforExample example);

    int updateByExample(@Param("record") PersonalInfor record, @Param("example") PersonalInforExample example);

    int updateByPrimaryKeySelective(PersonalInfor record);

    int updateByPrimaryKey(PersonalInfor record);
}