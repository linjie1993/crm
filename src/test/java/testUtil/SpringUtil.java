package testUtil;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 加载配置文件测试用传入beanId返回相应的对象
 * @author Jie
 *
 */
public final class SpringUtil {

	static ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	public static <T> T getBean(String beanId){
		return (T) ac.getBean(beanId);
	}
}
