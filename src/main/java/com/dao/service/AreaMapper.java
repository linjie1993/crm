package com.dao.service;

import com.entity.service.Area;

public interface AreaMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}