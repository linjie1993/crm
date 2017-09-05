package com.entity.order;

import java.io.Serializable;

public class OrderItems implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer oiId;

    private Integer oiPId;

    private Integer oiCount;

    private String oUnit;

    private Long oPrice;

    private Long oSubtotal;

    public Integer getOiId() {
        return oiId;
    }

    public void setOiId(Integer oiId) {
        this.oiId = oiId;
    }

    public Integer getOiPId() {
        return oiPId;
    }

    public void setOiPId(Integer oiPId) {
        this.oiPId = oiPId;
    }

    public Integer getOiCount() {
        return oiCount;
    }

    public void setOiCount(Integer oiCount) {
        this.oiCount = oiCount;
    }

    public String getoUnit() {
        return oUnit;
    }

    public void setoUnit(String oUnit) {
        this.oUnit = oUnit == null ? null : oUnit.trim();
    }

    public Long getoPrice() {
        return oPrice;
    }

    public void setoPrice(Long oPrice) {
        this.oPrice = oPrice;
    }

    public Long getoSubtotal() {
        return oSubtotal;
    }

    public void setoSubtotal(Long oSubtotal) {
        this.oSubtotal = oSubtotal;
    }

	public OrderItems() {
		super();
		// 
		
	}

	public OrderItems(Integer oiId, Integer oiPId, Integer oiCount, String oUnit, Long oPrice, Long oSubtotal) {
		super();
		this.oiId = oiId;
		this.oiPId = oiPId;
		this.oiCount = oiCount;
		this.oUnit = oUnit;
		this.oPrice = oPrice;
		this.oSubtotal = oSubtotal;
	}

	@Override
	public String toString() {
		return "OrderItems [oiId=" + oiId + ", oiPId=" + oiPId + ", oiCount=" + oiCount + ", oUnit=" + oUnit
				+ ", oPrice=" + oPrice + ", oSubtotal=" + oSubtotal + "]";
	}
	
    
}