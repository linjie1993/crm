package com.dao.customer;

import com.entity.customer.ContactRecord;

public interface ContactRecordMapper {
    int deleteByPrimaryKey(Integer crId);

    int insert(ContactRecord record);

    int insertSelective(ContactRecord record);

    ContactRecord selectByPrimaryKey(Integer crId);

    int updateByPrimaryKeySelective(ContactRecord record);

    int updateByPrimaryKey(ContactRecord record);
}