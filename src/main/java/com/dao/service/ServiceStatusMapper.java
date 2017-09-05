package com.dao.service;

import com.entity.service.ServiceStatus;

public interface ServiceStatusMapper {
    int deleteByPrimaryKey(Integer ssId);

    int insert(ServiceStatus record);

    int insertSelective(ServiceStatus record);

    ServiceStatus selectByPrimaryKey(Integer ssId);

    int updateByPrimaryKeySelective(ServiceStatus record);

    int updateByPrimaryKey(ServiceStatus record);
}