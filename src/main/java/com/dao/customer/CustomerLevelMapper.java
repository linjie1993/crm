package com.dao.customer;

import com.entity.customer.CustomerLevel;

public interface CustomerLevelMapper {
    int deleteByPrimaryKey(Integer cLeId);

    int insert(CustomerLevel record);

    int insertSelective(CustomerLevel record);

    CustomerLevel selectByPrimaryKey(Integer cLeId);

    int updateByPrimaryKeySelective(CustomerLevel record);

    int updateByPrimaryKey(CustomerLevel record);
}