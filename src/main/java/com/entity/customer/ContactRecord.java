package com.entity.customer;

import java.io.Serializable;
import java.util.Date;

public class ContactRecord implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer crId;

    private String crCId;

    private String crContent;

    private String crReason;

    private Date crTime;

    private String crAddress;

    private String crNotes;

    public Integer getCrId() {
        return crId;
    }

    public void setCrId(Integer crId) {
        this.crId = crId;
    }

    public String getCrCId() {
        return crCId;
    }

    public void setCrCId(String crCId) {
        this.crCId = crCId == null ? null : crCId.trim();
    }

    public String getCrContent() {
        return crContent;
    }

    public void setCrContent(String crContent) {
        this.crContent = crContent == null ? null : crContent.trim();
    }

    public String getCrReason() {
        return crReason;
    }

    public void setCrReason(String crReason) {
        this.crReason = crReason == null ? null : crReason.trim();
    }

    public Date getCrTime() {
        return crTime;
    }

    public void setCrTime(Date crTime) {
        this.crTime = crTime;
    }

    public String getCrAddress() {
        return crAddress;
    }

    public void setCrAddress(String crAddress) {
        this.crAddress = crAddress == null ? null : crAddress.trim();
    }

    public String getCrNotes() {
        return crNotes;
    }

    public void setCrNotes(String crNotes) {
        this.crNotes = crNotes == null ? null : crNotes.trim();
    }

	public ContactRecord() {
		super();
		
	}

	public ContactRecord(String crCId, String crContent, String crReason, Date crTime, String crAddress,
			String crNotes) {
		super();
		this.crCId = crCId;
		this.crContent = crContent;
		this.crReason = crReason;
		this.crTime = crTime;
		this.crAddress = crAddress;
		this.crNotes = crNotes;
	}

	@Override
	public String toString() {
		return "ContactRecord [crId=" + crId + ", crCId=" + crCId + ", crContent=" + crContent + ", crReason="
				+ crReason + ", crTime=" + crTime + ", crAddress=" + crAddress + ", crNotes=" + crNotes + "]";
	}
    
}