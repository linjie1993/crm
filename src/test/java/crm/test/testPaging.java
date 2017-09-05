package crm.test;

import org.junit.Test;

import com.util.tools.PagingUtil;



public class testPaging {
	@Test
	public void test() {
		PagingUtil p=new PagingUtil();
		p.setAllCount(11);
		p.setPageSize(5);
		System.out.println(p.getMaxPage());
	}
}
