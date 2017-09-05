package crm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dao.role.UserMapper;
import com.entity.role.User;

import testUtil.SpringUtil;

public class Dbtest {

	@Test
	public void test() {
		UserMapper userMapper = SpringUtil.getBean("userMapper");
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user);
	}

}
