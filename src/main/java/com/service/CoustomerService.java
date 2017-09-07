package com.service;

import java.util.List;
import java.util.Map;

import com.entity.customer.Customer;

public interface CoustomerService {
	
	public int getCountPage(Map<String, Object> map);
	
	public List<Customer> getCustByPage(Map<String, Object> map) ;
}
