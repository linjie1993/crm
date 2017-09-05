package crm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.util.redis.RedisAPI;

import testUtil.SpringUtil;


public class TestRedisAPI {

	@Test
	public void test() {
		RedisAPI RedisAPI = SpringUtil.getBean("redisAPI");
		String string = RedisAPI.get("list");
		System.out.println(string);
		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		RedisAPI redisAPI = (RedisAPI) context.getBean("redisAPI");
		String list = redisAPI.get("list");*/
		//System.out.println(list);
		
		/*List<User> userList = JSON.parseArray(list, User.class);
		for (User user : userList) {
			System.out.println(user);
		}*/
	}

}
