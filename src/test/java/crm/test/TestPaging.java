package crm.test;

import org.junit.Test;

import com.util.tools.PagingUtil;



public class TestPaging {
	@Test
	public void test() {
		/*PagingUtil p=new PagingUtil();
		p.setAllCount(11);
		p.setPageSize(5);
		System.out.println(p.getMaxPage());*/
		
	/*	Integer i1=100;
		Integer i2=100;
		System.out.println(i1==i2);
		
		Integer i3=1000;
		Integer i4=1000;
		System.out.println(i3==i4);*/
		
		String str = "a,b,c,,";
		String[] ary = str.split(",");
		//预期大于 3，结果是 3
		System.out.println(ary.length);
	}
}
