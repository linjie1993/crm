package com.entity.service;

import java.io.Serializable;
import java.util.Date;

public class Services implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer sSeId;

    private Integer sStId;

    private String sContent;

    private String sCustomer;

    private Integer sSsId;

    private String sRequest;

    private String sCreater;

    private Date sCreateTime;

    private String sAssignWho;

    private Date sAssignTime;

    private String sDisposer;

    private Date sDisposeTime;

    private String sResult;

    private String sSatisfaction;

    public Integer getsSeId() {
        return sSeId;
    }

    public void setsSeId(Integer sSeId) {
        this.sSeId = sSeId;
    }

    public Integer getsStId() {
        return sStId;
    }

    public void setsStId(Integer sStId) {
        this.sStId = sStId;
    }

    public String getsContent() {
        return sContent;
    }

    public void setsContent(String sContent) {
        this.sContent = sContent == null ? null : sContent.trim();
    }

    public String getsCustomer() {
        return sCustomer;
    }

    public void setsCustomer(String sCustomer) {
        this.sCustomer = sCustomer == null ? null : sCustomer.trim();
    }

    public Integer getsSsId() {
        return sSsId;
    }

    public void setsSsId(Integer sSsId) {
        this.sSsId = sSsId;
    }

    public String getsRequest() {
        return sRequest;
    }

    public void setsRequest(String sRequest) {
        this.sRequest = sRequest == null ? null : sRequest.trim();
    }

    public String getsCreater() {
        return sCreater;
    }

    public void setsCreater(String sCreater) {
        this.sCreater = sCreater == null ? null : sCreater.trim();
    }

    public Date getsCreateTime() {
        return sCreateTime;
    }

    public void setsCreateTime(Date sCreateTime) {
        this.sCreateTime = sCreateTime;
    }

    public String getsAssignWho() {
        return sAssignWho;
    }

    public void setsAssignWho(String sAssignWho) {
        this.sAssignWho = sAssignWho == null ? null : sAssignWho.trim();
    }

    public Date getsAssignTime() {
        return sAssignTime;
    }

    public void setsAssignTime(Date sAssignTime) {
        this.sAssignTime = sAssignTime;
    }

    public String getsDisposer() {
        return sDisposer;
    }

    public void setsDisposer(String sDisposer) {
        this.sDisposer = sDisposer == null ? null : sDisposer.trim();
    }

    public Date getsDisposeTime() {
        return sDisposeTime;
    }

    public void setsDisposeTime(Date sDisposeTime) {
        this.sDisposeTime = sDisposeTime;
    }

    public String getsResult() {
        return sResult;
    }

    public void setsResult(String sResult) {
        this.sResult = sResult == null ? null : sResult.trim();
    }

    public String getsSatisfaction() {
        return sSatisfaction;
    }

    public void setsSatisfaction(String sSatisfaction) {
        this.sSatisfaction = sSatisfaction == null ? null : sSatisfaction.trim();
    }

	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Services(Integer sSeId, Integer sStId, String sContent, String sCustomer, Integer sSsId, String sRequest,
			String sCreater, Date sCreateTime, String sAssignWho, Date sAssignTime, String sDisposer, Date sDisposeTime,
			String sResult, String sSatisfaction) {
		super();
		this.sSeId = sSeId;
		this.sStId = sStId;
		this.sContent = sContent;
		this.sCustomer = sCustomer;
		this.sSsId = sSsId;
		this.sRequest = sRequest;
		this.sCreater = sCreater;
		this.sCreateTime = sCreateTime;
		this.sAssignWho = sAssignWho;
		this.sAssignTime = sAssignTime;
		this.sDisposer = sDisposer;
		this.sDisposeTime = sDisposeTime;
		this.sResult = sResult;
		this.sSatisfaction = sSatisfaction;
	}

	@Override
	public String toString() {
		return "Services [sSeId=" + sSeId + ", sStId=" + sStId + ", sContent=" + sContent + ", sCustomer=" + sCustomer
				+ ", sSsId=" + sSsId + ", sRequest=" + sRequest + ", sCreater=" + sCreater + ", sCreateTime="
				+ sCreateTime + ", sAssignWho=" + sAssignWho + ", sAssignTime=" + sAssignTime + ", sDisposer="
				+ sDisposer + ", sDisposeTime=" + sDisposeTime + ", sResult=" + sResult + ", sSatisfaction="
				+ sSatisfaction + "]";
	}

}