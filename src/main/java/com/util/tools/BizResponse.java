package com.util.tools;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * 业务层高复用数据封装类
 * 
 * @author Jie 保证json序列化时，如果value是null的对象，key也会消失
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class BizResponse<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int status;
	private String message;
	private T data;

	/**
	 * 构造器1
	 * 
	 * @param status
	 */
	private BizResponse(int status) {
		this.status = status;
	}

	/**
	 * 构造器2
	 * 
	 * @param status
	 * @param data
	 */
	private BizResponse(int status, T data) {
		this.status = status;
		this.data = data;
	}

	/**
	 * 构造器3
	 * 
	 * @param status
	 * @param message
	 * @param data
	 */
	public BizResponse(int status, String message, T data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

	/**
	 * 构造器4
	 * 
	 * @param status
	 * @param message
	 */
	private BizResponse(int status, String message) {
		this.status = status;
		this.message = message;
	}

	/**
	 * 是否成功 处理让其在序列化时不显示在json结构当中里
	 * 
	 * @return
	 */
	@JsonIgnore
	public boolean isSuccess() {
		return this.status == ResponseCode.SUCCESS.getCode();
	}

	public int getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public T getData() {
		return data;
	}

	/**
	 * 对外提供构造器1，表示成功状态 int status
	 * 
	 * @return
	 */
	public static <T> BizResponse<T> createBySuccess() {
		return new BizResponse<T>(ResponseCode.SUCCESS.getCode());
	}

	/**
	 * 对外提供构造器4，表示成功并且提升成功的信息String message
	 * 
	 * @param message
	 * @return
	 */
	public static <T> BizResponse<T> createBySuccessMessage(String message) {
		return new BizResponse<T>(ResponseCode.SUCCESS.getCode(), message);
	}

	/**
	 * 对外提供构造器2，表示成功并且数据封装
	 * 
	 * @param data
	 * @return
	 */
	public static <T> BizResponse<T> createBySuccessData(T data) {
		return new BizResponse<T>(ResponseCode.SUCCESS.getCode(), data);
	}

	/**
	 * 对外提供构造器3，表示成功信息，并且封装数据
	 * 
	 * @param message
	 * @param data
	 * @return
	 */
	public static <T> BizResponse<T> createBySuccessMessageAndData(String message, T data) {
		return new BizResponse<T>(ResponseCode.SUCCESS.getCode(), message, data);
	}

	/**
	 * 返回通用的错误及描述
	 * 
	 * @return
	 */
	public static <T> BizResponse<T> createByError() {
		return new BizResponse<T>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getDesc());
	}

	/**
	 * 构造器4返回错误消息
	 * 
	 * @param errorMessage
	 * @return
	 */
	public static <T> BizResponse<T> createByErrorMessage(String errorMessage) {
		return new BizResponse<T>(ResponseCode.ERROR.getCode(), errorMessage);
	}

	/**
	 * code变量的方法以便更改错误提示，提示其他错误
	 * 
	 * @param errorCode
	 * @param errorMessage
	 * @return
	 */
	public static <T> BizResponse<T> createByErrorCodeMessage(int errorCode, String errorMessage) {
		return new BizResponse<T>(errorCode, errorMessage);
	}

}
