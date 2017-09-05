package com.dao.customer;

import com.entity.customer.CustomerContact;

public interface CustomerContactMapper {
    int deleteByPrimaryKey(Integer ccId);

    int insert(CustomerContact record);

    int insertSelective(CustomerContact record);

    CustomerContact selectByPrimaryKey(Integer ccId);

    int updateByPrimaryKeySelective(CustomerContact record);

    int updateByPrimaryKey(CustomerContact record);
}