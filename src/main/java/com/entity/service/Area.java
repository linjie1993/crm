package com.entity.service;

import java.io.Serializable;

public class Area implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer aId;

    private String aName;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Area(Integer aId, String aName) {
		super();
		this.aId = aId;
		this.aName = aName;
	}

	@Override
	public String toString() {
		return "Area [aId=" + aId + ", aName=" + aName + "]";
	}
    
}