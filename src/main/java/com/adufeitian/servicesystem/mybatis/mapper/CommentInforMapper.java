package com.adufeitian.servicesystem.mybatis.mapper;

import com.adufeitian.servicesystem.mybatis.domain.CommentInfor;
import com.adufeitian.servicesystem.mybatis.domain.CommentInforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentInforMapper {
    long countByExample(CommentInforExample example);

    int deleteByExample(CommentInforExample example);

    int deleteByPrimaryKey(String orderNumber);

    int insert(CommentInfor record);

    int insertSelective(CommentInfor record);

    List<CommentInfor> selectByExample(CommentInforExample example);

    CommentInfor selectByPrimaryKey(String orderNumber);

    int updateByExampleSelective(@Param("record") CommentInfor record, @Param("example") CommentInforExample example);

    int updateByExample(@Param("record") CommentInfor record, @Param("example") CommentInforExample example);

    int updateByPrimaryKeySelective(CommentInfor record);

    int updateByPrimaryKey(CommentInfor record);
}