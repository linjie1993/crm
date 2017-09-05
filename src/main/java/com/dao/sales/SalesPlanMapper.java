package com.dao.sales;

import com.entity.sales.SalesPlan;

public interface SalesPlanMapper {
    int deleteByPrimaryKey(Integer sopId);

    int insert(SalesPlan record);

    int insertSelective(SalesPlan record);

    SalesPlan selectByPrimaryKey(Integer sopId);

    int updateByPrimaryKeySelective(SalesPlan record);

    int updateByPrimaryKey(SalesPlan record);
}