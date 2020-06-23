package com.adufeitian.servicesystem.mybatis.mapper;

import com.adufeitian.servicesystem.mybatis.domain.PendingOrder;
import com.adufeitian.servicesystem.mybatis.domain.PendingOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PendingOrderMapper {
    long countByExample(PendingOrderExample example);

    int deleteByExample(PendingOrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(PendingOrder record);

    int insertSelective(PendingOrder record);

    List<PendingOrder> selectByExample(PendingOrderExample example);

    PendingOrder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") PendingOrder record, @Param("example") PendingOrderExample example);

    int updateByExample(@Param("record") PendingOrder record, @Param("example") PendingOrderExample example);

    int updateByPrimaryKeySelective(PendingOrder record);

    int updateByPrimaryKey(PendingOrder record);
}