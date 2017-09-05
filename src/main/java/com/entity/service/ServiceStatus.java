package com.entity.service;

import java.io.Serializable;

public class ServiceStatus implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer ssId;

    private String ssName;

    public Integer getSsId() {
        return ssId;
    }

    public void setSsId(Integer ssId) {
        this.ssId = ssId;
    }

    public String getSsName() {
        return ssName;
    }

    public void setSsName(String ssName) {
        this.ssName = ssName == null ? null : ssName.trim();
    }

	public ServiceStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceStatus(Integer ssId, String ssName) {
		super();
		this.ssId = ssId;
		this.ssName = ssName;
	}

	@Override
	public String toString() {
		return "ServiceStatus [ssId=" + ssId + ", ssName=" + ssName + "]";
	}
    
}