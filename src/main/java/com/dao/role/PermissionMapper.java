package com.dao.role;

import com.entity.role.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer pPeId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer pPeId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}