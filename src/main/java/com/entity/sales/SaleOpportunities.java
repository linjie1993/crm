package com.entity.sales;

import java.io.Serializable;
import java.util.Date;

public class SaleOpportunities implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer soId;

    private String soCustomerName;

    private String soSummary;

    private String soContactName;

    private String soDescription;

    private String soAddress;

    private String soCreater;

    private Date soCreateTime;

    private String soAssignWho;

    private Date soAssigntime;

    private String soOpportunitiesSource;

    private Integer soSuccessProbability;

    private String soContacttelephone;

    private String soStatus;

    public Integer getSoId() {
        return soId;
    }

    public void setSoId(Integer soId) {
        this.soId = soId;
    }

    public String getSoCustomerName() {
        return soCustomerName;
    }

    public void setSoCustomerName(String soCustomerName) {
        this.soCustomerName = soCustomerName == null ? null : soCustomerName.trim();
    }

    public String getSoSummary() {
        return soSummary;
    }

    public void setSoSummary(String soSummary) {
        this.soSummary = soSummary == null ? null : soSummary.trim();
    }

    public String getSoContactName() {
        return soContactName;
    }

    public void setSoContactName(String soContactName) {
        this.soContactName = soContactName == null ? null : soContactName.trim();
    }

    public String getSoDescription() {
        return soDescription;
    }

    public void setSoDescription(String soDescription) {
        this.soDescription = soDescription == null ? null : soDescription.trim();
    }

    public String getSoAddress() {
        return soAddress;
    }

    public void setSoAddress(String soAddress) {
        this.soAddress = soAddress == null ? null : soAddress.trim();
    }

    public String getSoCreater() {
        return soCreater;
    }

    public void setSoCreater(String soCreater) {
        this.soCreater = soCreater == null ? null : soCreater.trim();
    }

    public Date getSoCreateTime() {
        return soCreateTime;
    }

    public void setSoCreateTime(Date soCreateTime) {
        this.soCreateTime = soCreateTime;
    }

    public String getSoAssignWho() {
        return soAssignWho;
    }

    public void setSoAssignWho(String soAssignWho) {
        this.soAssignWho = soAssignWho == null ? null : soAssignWho.trim();
    }

    public Date getSoAssigntime() {
        return soAssigntime;
    }

    public void setSoAssigntime(Date soAssigntime) {
        this.soAssigntime = soAssigntime;
    }

    public String getSoOpportunitiesSource() {
        return soOpportunitiesSource;
    }

    public void setSoOpportunitiesSource(String soOpportunitiesSource) {
        this.soOpportunitiesSource = soOpportunitiesSource == null ? null : soOpportunitiesSource.trim();
    }

    public Integer getSoSuccessProbability() {
        return soSuccessProbability;
    }

    public void setSoSuccessProbability(Integer soSuccessProbability) {
        this.soSuccessProbability = soSuccessProbability;
    }

    public String getSoContacttelephone() {
        return soContacttelephone;
    }

    public void setSoContacttelephone(String soContacttelephone) {
        this.soContacttelephone = soContacttelephone == null ? null : soContacttelephone.trim();
    }

    public String getSoStatus() {
        return soStatus;
    }

    public void setSoStatus(String soStatus) {
        this.soStatus = soStatus == null ? null : soStatus.trim();
    }

	public SaleOpportunities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SaleOpportunities(String soCustomerName, String soSummary, String soContactName, String soDescription,
			String soAddress, String soCreater, Date soCreateTime, String soAssignWho, Date soAssigntime,
			String soOpportunitiesSource, Integer soSuccessProbability, String soContacttelephone, String soStatus) {
		super();
		this.soCustomerName = soCustomerName;
		this.soSummary = soSummary;
		this.soContactName = soContactName;
		this.soDescription = soDescription;
		this.soAddress = soAddress;
		this.soCreater = soCreater;
		this.soCreateTime = soCreateTime;
		this.soAssignWho = soAssignWho;
		this.soAssigntime = soAssigntime;
		this.soOpportunitiesSource = soOpportunitiesSource;
		this.soSuccessProbability = soSuccessProbability;
		this.soContacttelephone = soContacttelephone;
		this.soStatus = soStatus;
	}

	@Override
	public String toString() {
		return "SaleOpportunities [soId=" + soId + ", soCustomerName=" + soCustomerName + ", soSummary=" + soSummary
				+ ", soContactName=" + soContactName + ", soDescription=" + soDescription + ", soAddress=" + soAddress
				+ ", soCreater=" + soCreater + ", soCreateTime=" + soCreateTime + ", soAssignWho=" + soAssignWho
				+ ", soAssigntime=" + soAssigntime + ", soOpportunitiesSource=" + soOpportunitiesSource
				+ ", soSuccessProbability=" + soSuccessProbability + ", soContacttelephone=" + soContacttelephone
				+ ", soStatus=" + soStatus + "]";
	}
    
}