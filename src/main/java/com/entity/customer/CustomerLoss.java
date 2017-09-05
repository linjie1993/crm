package com.entity.customer;

import java.io.Serializable;
import java.util.Date;

public class CustomerLoss implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer clId;

    private Integer clCId;

    private String clCustomerManager;

    private Date clDate;

    private String clReprieve;

    private String clReason;

    private String clType;

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public Integer getClCId() {
        return clCId;
    }

    public void setClCId(Integer clCId) {
        this.clCId = clCId;
    }

    public String getClCustomerManager() {
        return clCustomerManager;
    }

    public void setClCustomerManager(String clCustomerManager) {
        this.clCustomerManager = clCustomerManager == null ? null : clCustomerManager.trim();
    }

    public Date getClDate() {
        return clDate;
    }

    public void setClDate(Date clDate) {
        this.clDate = clDate;
    }

    public String getClReprieve() {
        return clReprieve;
    }

    public void setClReprieve(String clReprieve) {
        this.clReprieve = clReprieve == null ? null : clReprieve.trim();
    }

    public String getClReason() {
        return clReason;
    }

    public void setClReason(String clReason) {
        this.clReason = clReason == null ? null : clReason.trim();
    }

    public String getClType() {
        return clType;
    }

    public void setClType(String clType) {
        this.clType = clType == null ? null : clType.trim();
    }

	public CustomerLoss() {
		super();
		// 
	}

	public CustomerLoss(Integer clCId, String clCustomerManager, Date clDate, String clReprieve, String clReason,
			String clType) {
		super();
		this.clCId = clCId;
		this.clCustomerManager = clCustomerManager;
		this.clDate = clDate;
		this.clReprieve = clReprieve;
		this.clReason = clReason;
		this.clType = clType;
	}

	@Override
	public String toString() {
		return "CustomerLoss [clId=" + clId + ", clCId=" + clCId + ", clCustomerManager=" + clCustomerManager
				+ ", clDate=" + clDate + ", clReprieve=" + clReprieve + ", clReason=" + clReason + ", clType=" + clType
				+ "]";
	}
    
}