package com.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.customer.CustomerMapper;
import com.entity.customer.Customer;
import com.service.CoustomerService;

@Service("coustomerService")
public class CoustomerServiceImpl implements CoustomerService {

	@Resource(name = "customerMapper")
	private CustomerMapper customerMapper;

	@Override
	public int getCountPage(Map<String, Object> map) {
		return customerMapper.countPage(map);
	}

	@Override
	public List<Customer> getCustByPage(Map<String, Object> map) {
		Integer pageSize = (Integer) map.get("pageSize");
		Integer currentPage = (Integer) map.get("currentPage");
		Integer from=(currentPage-1)*pageSize;
		map.put("from", from);
		return customerMapper.getCustmerByPaging(map);
	}

}
