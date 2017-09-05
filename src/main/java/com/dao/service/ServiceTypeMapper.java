package com.dao.service;

import com.entity.service.ServiceType;

public interface ServiceTypeMapper {
    int deleteByPrimaryKey(Integer stId);

    int insert(ServiceType record);

    int insertSelective(ServiceType record);

    ServiceType selectByPrimaryKey(Integer stId);

    int updateByPrimaryKeySelective(ServiceType record);

    int updateByPrimaryKey(ServiceType record);
}