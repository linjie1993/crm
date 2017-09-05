package com.dao.sales;

import com.entity.sales.SaleOpportunities;

public interface SaleOpportunitiesMapper {
    int deleteByPrimaryKey(Integer soId);

    int insert(SaleOpportunities record);

    int insertSelective(SaleOpportunities record);

    SaleOpportunities selectByPrimaryKey(Integer soId);

    int updateByPrimaryKeySelective(SaleOpportunities record);

    int updateByPrimaryKey(SaleOpportunities record);
}