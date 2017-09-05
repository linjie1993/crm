package com.entity.product;

import java.io.Serializable;

public class Store implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer sStId;

    private Integer sPId;

    private String sStorehouse;

    private String sGoodsAllocation;

    private String sNotes;

    public Integer getsStId() {
        return sStId;
    }

    public void setsStId(Integer sStId) {
        this.sStId = sStId;
    }

    public Integer getsPId() {
        return sPId;
    }

    public void setsPId(Integer sPId) {
        this.sPId = sPId;
    }

    public String getsStorehouse() {
        return sStorehouse;
    }

    public void setsStorehouse(String sStorehouse) {
        this.sStorehouse = sStorehouse == null ? null : sStorehouse.trim();
    }

    public String getsGoodsAllocation() {
        return sGoodsAllocation;
    }

    public void setsGoodsAllocation(String sGoodsAllocation) {
        this.sGoodsAllocation = sGoodsAllocation == null ? null : sGoodsAllocation.trim();
    }

    public String getsNotes() {
        return sNotes;
    }

    public void setsNotes(String sNotes) {
        this.sNotes = sNotes == null ? null : sNotes.trim();
    }

	public Store() {
		super();
		// 
	}

	public Store(Integer sStId, Integer sPId, String sStorehouse, String sGoodsAllocation, String sNotes) {
		super();
		this.sStId = sStId;
		this.sPId = sPId;
		this.sStorehouse = sStorehouse;
		this.sGoodsAllocation = sGoodsAllocation;
		this.sNotes = sNotes;
	}

	@Override
	public String toString() {
		return "Store [sStId=" + sStId + ", sPId=" + sPId + ", sStorehouse=" + sStorehouse + ", sGoodsAllocation="
				+ sGoodsAllocation + ", sNotes=" + sNotes + "]";
	}
    
}