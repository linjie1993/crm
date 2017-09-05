package com.entity.service;

import java.io.Serializable;

public class ServiceType implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer stId;

    private String stType;

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public String getStType() {
        return stType;
    }

    public void setStType(String stType) {
        this.stType = stType == null ? null : stType.trim();
    }

	public ServiceType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceType(Integer stId, String stType) {
		super();
		this.stId = stId;
		this.stType = stType;
	}

	@Override
	public String toString() {
		return "ServiceType [stId=" + stId + ", stType=" + stType + "]";
	}
    
}