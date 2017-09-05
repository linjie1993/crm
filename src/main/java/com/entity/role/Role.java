package com.entity.role;

import java.io.Serializable;

public class Role implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer rId;

    private String rName;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(Integer rId, String rName) {
		super();
		this.rId = rId;
		this.rName = rName;
	}

	@Override
	public String toString() {
		return "Role [rId=" + rId + ", rName=" + rName + "]";
	}
    
}