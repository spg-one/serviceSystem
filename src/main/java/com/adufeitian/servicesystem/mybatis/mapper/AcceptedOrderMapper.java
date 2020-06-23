package com.adufeitian.servicesystem.mybatis.mapper;

import com.adufeitian.servicesystem.mybatis.domain.AcceptedOrder;
import com.adufeitian.servicesystem.mybatis.domain.AcceptedOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcceptedOrderMapper {
    long countByExample(AcceptedOrderExample example);

    int deleteByExample(AcceptedOrderExample example);

    int deleteByPrimaryKey(String orderNumber);

    int insert(AcceptedOrder record);

    int insertSelective(AcceptedOrder record);

    List<AcceptedOrder> selectByExample(AcceptedOrderExample example);

    AcceptedOrder selectByPrimaryKey(String orderNumber);

    int updateByExampleSelective(@Param("record") AcceptedOrder record, @Param("example") AcceptedOrderExample example);

    int updateByExample(@Param("record") AcceptedOrder record, @Param("example") AcceptedOrderExample example);

    int updateByPrimaryKeySelective(AcceptedOrder record);

    int updateByPrimaryKey(AcceptedOrder record);
}