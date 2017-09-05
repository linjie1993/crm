package com.dao.customer;

import com.entity.customer.CustomerLoss;

public interface CustomerLossMapper {
    int deleteByPrimaryKey(Integer clId);

    int insert(CustomerLoss record);

    int insertSelective(CustomerLoss record);

    CustomerLoss selectByPrimaryKey(Integer clId);

    int updateByPrimaryKeySelective(CustomerLoss record);

    int updateByPrimaryKey(CustomerLoss record);
}