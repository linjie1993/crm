package com.entity.product;

import java.io.Serializable;

public class Product implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer pId;

    private String pName;

    private String pType;

    private String pProductionBatch;

    private String pUnit;

    private Long pPrice;

    private String pNotes;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType == null ? null : pType.trim();
    }

    public String getpProductionBatch() {
        return pProductionBatch;
    }

    public void setpProductionBatch(String pProductionBatch) {
        this.pProductionBatch = pProductionBatch == null ? null : pProductionBatch.trim();
    }

    public String getpUnit() {
        return pUnit;
    }

    public void setpUnit(String pUnit) {
        this.pUnit = pUnit == null ? null : pUnit.trim();
    }

    public Long getpPrice() {
        return pPrice;
    }

    public void setpPrice(Long pPrice) {
        this.pPrice = pPrice;
    }

    public String getpNotes() {
        return pNotes;
    }

    public void setpNotes(String pNotes) {
        this.pNotes = pNotes == null ? null : pNotes.trim();
    }

	public Product() {
		super();
		// 
	}

	public Product(String pName, String pType, String pProductionBatch, String pUnit, Long pPrice, String pNotes) {
		super();
		this.pName = pName;
		this.pType = pType;
		this.pProductionBatch = pProductionBatch;
		this.pUnit = pUnit;
		this.pPrice = pPrice;
		this.pNotes = pNotes;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pType=" + pType + ", pProductionBatch="
				+ pProductionBatch + ", pUnit=" + pUnit + ", pPrice=" + pPrice + ", pNotes=" + pNotes + "]";
	}
    
}