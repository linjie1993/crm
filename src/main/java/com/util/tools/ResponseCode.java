package com.util.tools;
/**
 * 响应状态的枚举类
 * @author Jie
 *
 */
public enum ResponseCode {
	SUCCESS(0, "SUCCSS"), 
	ERROR(1, "ERROR"), 
	NEED_LOGIN(10, "NEED_LOGIN"),//需要登录
	ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT");//需要提升参数错误

	private final int code;
	private final String desc;
	
	
	private ResponseCode(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

}
