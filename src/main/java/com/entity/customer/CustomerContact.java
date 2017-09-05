package com.entity.customer;

import java.io.Serializable;

public class CustomerContact implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer ccId;

    private String ccCustomerid;

    private String ccName;

    private String ccSex;

    private String ccPosition;

    private String ccOfficePhone;

    private String ccMobilephone;

    private String ccNotes;

    public Integer getCcId() {
        return ccId;
    }

    public void setCcId(Integer ccId) {
        this.ccId = ccId;
    }

    public String getCcCustomerid() {
        return ccCustomerid;
    }

    public void setCcCustomerid(String ccCustomerid) {
        this.ccCustomerid = ccCustomerid == null ? null : ccCustomerid.trim();
    }

    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName == null ? null : ccName.trim();
    }

    public String getCcSex() {
        return ccSex;
    }

    public void setCcSex(String ccSex) {
        this.ccSex = ccSex == null ? null : ccSex.trim();
    }

    public String getCcPosition() {
        return ccPosition;
    }

    public void setCcPosition(String ccPosition) {
        this.ccPosition = ccPosition == null ? null : ccPosition.trim();
    }

    public String getCcOfficePhone() {
        return ccOfficePhone;
    }

    public void setCcOfficePhone(String ccOfficePhone) {
        this.ccOfficePhone = ccOfficePhone == null ? null : ccOfficePhone.trim();
    }

    public String getCcMobilephone() {
        return ccMobilephone;
    }

    public void setCcMobilephone(String ccMobilephone) {
        this.ccMobilephone = ccMobilephone == null ? null : ccMobilephone.trim();
    }

    public String getCcNotes() {
        return ccNotes;
    }

    public void setCcNotes(String ccNotes) {
        this.ccNotes = ccNotes == null ? null : ccNotes.trim();
    }

	public CustomerContact() {
		super();
		
	}

	public CustomerContact(String ccCustomerid, String ccName, String ccSex, String ccPosition, String ccOfficePhone,
			String ccMobilephone, String ccNotes) {
		super();
		this.ccCustomerid = ccCustomerid;
		this.ccName = ccName;
		this.ccSex = ccSex;
		this.ccPosition = ccPosition;
		this.ccOfficePhone = ccOfficePhone;
		this.ccMobilephone = ccMobilephone;
		this.ccNotes = ccNotes;
	}

	@Override
	public String toString() {
		return "CustomerContact [ccId=" + ccId + ", ccCustomerid=" + ccCustomerid + ", ccName=" + ccName + ", ccSex="
				+ ccSex + ", ccPosition=" + ccPosition + ", ccOfficePhone=" + ccOfficePhone + ", ccMobilephone="
				+ ccMobilephone + ", ccNotes=" + ccNotes + "]";
	}
    
}