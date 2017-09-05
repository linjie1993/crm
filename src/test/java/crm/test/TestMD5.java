package crm.test;

import org.junit.Test;

import com.util.md5.MD5Util;


public class TestMD5 {
	
	@Test
	public void test() {
		String string = MD5Util.MD5EncodeUtf8("123");
		System.out.println(string);
	}
}
