package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.customer.Customer;
import com.service.CoustomerService;
import com.util.tools.PagingUtil;

@Controller
@RequestMapping("customManage")
public class CustomerController {
	
	@Resource(name = "coustomerService")
	private CoustomerService coustomerService;

	@RequestMapping("/customerInfo.html")
	public String customerInfo(PagingUtil page, Customer customer, Model model) {
		System.out.println("------------");
		Integer cId = null;
		String cName = null;
		Integer cAId = null;
		String cContactName = null;
		Integer cClId = null;
		if (customer != null) {
			cId = customer.getcId();
			cName = customer.getcName();
			cAId = customer.getcAId();
			cContactName = customer.getcContactName();
			cClId = customer.getcClId();
		}
		Map<String, Object> map = new HashMap<>();
		map.put("cId", cId);
		map.put("cName", cName);
		map.put("cAId", cAId);
		map.put("cContactName", cContactName);
		map.put("cClId", cClId);
		//获取总记录数
		Integer countPage = coustomerService.getCountPage(map);
		//页面控制
		int pageSize = 5;// 页面大小
		int currentPage = 1;// 当前页面
		if (page != null) {
			pageSize = page.getPageSize();
			currentPage = page.getCurrentPage();
		}
		page.setAllCount(countPage);
		Integer maxPage = page.getMaxPage();//最大页面
		map.put("pageSize", pageSize);
		map.put("currentPage", currentPage);
		List<Customer> list = coustomerService.getCustByPage(map);
		model.addAttribute(cId);
		model.addAttribute(cName);
		model.addAttribute(cAId);
		model.addAttribute(cContactName);
		model.addAttribute(cClId);
		model.addAttribute(pageSize);
		model.addAttribute(currentPage);
		model.addAttribute(maxPage);
		model.addAttribute(list);
		return "customManage/cust/list";
	}

}
