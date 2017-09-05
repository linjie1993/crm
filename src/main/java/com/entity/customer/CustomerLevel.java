package com.entity.customer;

import java.io.Serializable;

public class CustomerLevel implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer cLeId;

    private String cLeName;

    public Integer getcLeId() {
        return cLeId;
    }

    public void setcLeId(Integer cLeId) {
        this.cLeId = cLeId;
    }

    public String getcLeName() {
        return cLeName;
    }

    public void setcLeName(String cLeName) {
        this.cLeName = cLeName == null ? null : cLeName.trim();
    }

	public CustomerLevel() {
		super();
		// 
	}

	public CustomerLevel(String cLeName) {
		super();
		this.cLeName = cLeName;
	}

	@Override
	public String toString() {
		return "CustomerLevel [cLeId=" + cLeId + ", cLeName=" + cLeName + "]";
	}
    
}