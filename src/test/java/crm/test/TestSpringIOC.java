package crm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.controller.CustomerController;
import com.service.CoustomerService;

import testUtil.SpringUtil;

public class TestSpringIOC {

	@Test
	public void test() {
		CoustomerService coustomerService = SpringUtil.getBean("coustomerService");
		System.out.println(coustomerService);
		//CustomerController customerController = SpringUtil.getBean("customerController");
		//System.out.println(customerController);
	}

}
