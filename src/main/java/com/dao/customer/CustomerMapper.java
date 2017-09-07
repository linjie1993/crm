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
	 * ��ҳ��ѯ
	 * 
	 * @param map
	 * @return
	 */
	List<Customer> getCustmerByPaging(Map<String, Object> map);

	/**
	 * ��ѯ�ܼ�¼��
	 * 
	 * @param map
	 * @return
	 */
	int countPage(Map<String, Object> map);
}