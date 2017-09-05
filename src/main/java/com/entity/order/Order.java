package com.entity.order;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer oId;

    private Integer oCId;

    private Long oTotalMoney;

    private Date oDate;

    private String oAddress;

    private String oStatus;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getoCId() {
        return oCId;
    }

    public void setoCId(Integer oCId) {
        this.oCId = oCId;
    }

    public Long getoTotalMoney() {
        return oTotalMoney;
    }

    public void setoTotalMoney(Long oTotalMoney) {
        this.oTotalMoney = oTotalMoney;
    }

    public Date getoDate() {
        return oDate;
    }

    public void setoDate(Date oDate) {
        this.oDate = oDate;
    }

    public String getoAddress() {
        return oAddress;
    }

    public void setoAddress(String oAddress) {
        this.oAddress = oAddress == null ? null : oAddress.trim();
    }

    public String getoStatus() {
        return oStatus;
    }

    public void setoStatus(String oStatus) {
        this.oStatus = oStatus == null ? null : oStatus.trim();
    }

	public Order() {
		super();
		// 
	}

	public Order(Integer oCId, Long oTotalMoney, Date oDate, String oAddress, String oStatus) {
		super();
		this.oCId = oCId;
		this.oTotalMoney = oTotalMoney;
		this.oDate = oDate;
		this.oAddress = oAddress;
		this.oStatus = oStatus;
	}

	@Override
	public String toString() {
		return "Order [oId=" + oId + ", oCId=" + oCId + ", oTotalMoney=" + oTotalMoney + ", oDate=" + oDate
				+ ", oAddress=" + oAddress + ", oStatus=" + oStatus + "]";
	}
    
}