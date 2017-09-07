package crm.test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.dao.customer.CustomerMapper;
import com.entity.customer.Customer;

import testUtil.SpringUtil;

public class Testjava {
	@Test
	public void test() {
		/*
		 * Customer c=new Customer(); c.setcAddress("3212325");
		 * System.out.println(c.getcAddress());
		 */
		
		
		
		CustomerMapper customerMapper = SpringUtil.getBean("customerMapper");
		Map<String, Object> map = new HashMap<>();
		map.put("cName", "±±");
		map.put("from", 1);
		map.put("pageSize", 3);
		// System.out.println(customerMapper.selectByPrimaryKey(1));
		List<Customer> list = customerMapper.getCustmerByPaging(map);
		for (Customer customer : list) {
			System.out.print(customer);
			System.out.println(customer.getArea().getaName());
		}

	}
}
