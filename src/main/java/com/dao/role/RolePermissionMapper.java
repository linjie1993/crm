package com.dao.role;

import com.entity.role.RolePermission;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(Integer rpRId);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    RolePermission selectByPrimaryKey(Integer rpRId);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}