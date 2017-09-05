package com.dao.product;

import com.entity.product.Store;

public interface StoreMapper {
    int deleteByPrimaryKey(Integer sStId);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Integer sStId);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}