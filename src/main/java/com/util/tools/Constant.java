package com.util.tools;
/**
 * 常量类
 * @author Jie
 *
 */
public class Constant {
	//sessionUser
	public static final String CURRENT_USER = "loginUser";
	
	
	
	
	//分组内部借口常量分组，没有枚举类那么重
	public interface Role {
		int ROLE_CUSTOMER=0;//普通用户
		int ROLE_ADMIN=1;//管理员
	}
	//
	public static final String USERNAME="username";
	public static final String EMAIL="email";
}
