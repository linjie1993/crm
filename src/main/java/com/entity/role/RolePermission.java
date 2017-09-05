package com.entity.role;

import java.io.Serializable;

public class RolePermission implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer rpRId;

    private Integer rpPId;

    public Integer getRpRId() {
        return rpRId;
    }

    public void setRpRId(Integer rpRId) {
        this.rpRId = rpRId;
    }

    public Integer getRpPId() {
        return rpPId;
    }

    public void setRpPId(Integer rpPId) {
        this.rpPId = rpPId;
    }

	public RolePermission() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RolePermission(Integer rpRId, Integer rpPId) {
		super();
		this.rpRId = rpRId;
		this.rpPId = rpPId;
	}

	@Override
	public String toString() {
		return "RolePermission [rpRId=" + rpRId + ", rpPId=" + rpPId + "]";
	}
    
}