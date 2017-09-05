package com.dao.order;

import com.entity.order.OrderItems;

public interface OrderItemsMapper {
    int deleteByPrimaryKey(Integer oiId);

    int insert(OrderItems record);

    int insertSelective(OrderItems record);

    OrderItems selectByPrimaryKey(Integer oiId);

    int updateByPrimaryKeySelective(OrderItems record);

    int updateByPrimaryKey(OrderItems record);
}