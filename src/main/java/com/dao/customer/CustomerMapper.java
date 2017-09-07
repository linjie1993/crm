package com.dao.customer;

import java.util.List;
import java.util.Map;

import com.entity.customer.Customer;

public interface CustomerMapper {
	int deleteByPrimaryKey(Integer cId);

	int insert(Customer customer);

	int insertSelective(Customer crecord);

	Customer selectByPrimaryKey(Integer cId);

	int updateByPrimaryKeySelective(Customer crecord);

	int updateByPrimaryKey(Customer crecord);

	/**
	 * 分页查询
	 * 
	 * @param map
	 * @return
	 */
	List<Customer> getCustmerByPaging(Map<String, Object> map);

	/**
	 * 查询总记录数
	 * 
	 * @param map
	 * @return
	 */
	int countPage(Map<String, Object> map);
}