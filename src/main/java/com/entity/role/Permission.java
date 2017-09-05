package com.entity.role;

import java.io.Serializable;

public class Permission implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer pPeId;

    private String pPeContent;

    public Integer getpPeId() {
        return pPeId;
    }

    public void setpPeId(Integer pPeId) {
        this.pPeId = pPeId;
    }

    public String getpPeContent() {
        return pPeContent;
    }

    public void setpPeContent(String pPeContent) {
        this.pPeContent = pPeContent == null ? null : pPeContent.trim();
    }

	public Permission() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Permission(Integer pPeId, String pPeContent) {
		super();
		this.pPeId = pPeId;
		this.pPeContent = pPeContent;
	}

	@Override
	public String toString() {
		return "Permission [pPeId=" + pPeId + ", pPeContent=" + pPeContent + "]";
	}
    
}