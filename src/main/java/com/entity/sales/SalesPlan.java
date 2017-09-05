package com.entity.sales;

import java.io.Serializable;
import java.util.Date;

public class SalesPlan implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer sopId;

    private Integer sopSoId;

    private Date sopDate;

    private String sopContent;

    private String sopResult;

    private String sopStatus;

    public Integer getSopId() {
        return sopId;
    }

    public void setSopId(Integer sopId) {
        this.sopId = sopId;
    }

    public Integer getSopSoId() {
        return sopSoId;
    }

    public void setSopSoId(Integer sopSoId) {
        this.sopSoId = sopSoId;
    }

    public Date getSopDate() {
        return sopDate;
    }

    public void setSopDate(Date sopDate) {
        this.sopDate = sopDate;
    }

    public String getSopContent() {
        return sopContent;
    }

    public void setSopContent(String sopContent) {
        this.sopContent = sopContent == null ? null : sopContent.trim();
    }

    public String getSopResult() {
        return sopResult;
    }

    public void setSopResult(String sopResult) {
        this.sopResult = sopResult == null ? null : sopResult.trim();
    }

    public String getSopStatus() {
        return sopStatus;
    }

    public void setSopStatus(String sopStatus) {
        this.sopStatus = sopStatus == null ? null : sopStatus.trim();
    }

	public SalesPlan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesPlan(Integer sopId, Integer sopSoId, Date sopDate, String sopContent, String sopResult,
			String sopStatus) {
		super();
		this.sopId = sopId;
		this.sopSoId = sopSoId;
		this.sopDate = sopDate;
		this.sopContent = sopContent;
		this.sopResult = sopResult;
		this.sopStatus = sopStatus;
	}

	@Override
	public String toString() {
		return "SalesPlan [sopId=" + sopId + ", sopSoId=" + sopSoId + ", sopDate=" + sopDate + ", sopContent="
				+ sopContent + ", sopResult=" + sopResult + ", sopStatus=" + sopStatus + "]";
	}
    
}