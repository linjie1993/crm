package com.entity.customer;

import java.io.Serializable;

import com.entity.service.Area;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer cId;

	private String cName;

	private Integer cAId;

	private String cContactName;

	private Integer cClId;

	private String cCreditLine;

	private String cSatisfaction;

	private String cAddress;

	private String cTelephone;

	private String cFax;

	private String cPostcode;

	private String cUrl;

	private String cBusinessLicense;

	private Long cRegMoney;

	private String cDepositBank;

	private String cBankAccount;

	private String cStateTaxesNumber;

	private String cLocalTaxesNumber;

	private String cCorporation;

	private Long cYearlyTurnover;

	private Area area;

	private CustomerLevel customerLevel;

	public Integer getcId() {
		return cId;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public CustomerLevel getCustomerLevel() {
		return customerLevel;
	}

	public void setCustomerLevel(CustomerLevel customerLevel) {
		this.customerLevel = customerLevel;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName == null ? null : cName.trim();
	}

	public Integer getcAId() {
		return cAId;
	}

	public void setcAId(Integer cAId) {
		this.cAId = cAId;
	}

	public String getcContactName() {
		return cContactName;
	}

	public void setcContactName(String cContactName) {
		this.cContactName = cContactName == null ? null : cContactName.trim();
	}

	public Integer getcClId() {
		return cClId;
	}

	public void setcClId(Integer cClId) {
		this.cClId = cClId;
	}

	public String getcCreditLine() {
		return cCreditLine;
	}

	public void setcCreditLine(String cCreditLine) {
		this.cCreditLine = cCreditLine == null ? null : cCreditLine.trim();
	}

	public String getcSatisfaction() {
		return cSatisfaction;
	}

	public void setcSatisfaction(String cSatisfaction) {
		this.cSatisfaction = cSatisfaction == null ? null : cSatisfaction.trim();
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress == null ? null : cAddress.trim();
	}

	public String getcTelephone() {
		return cTelephone;
	}

	public void setcTelephone(String cTelephone) {
		this.cTelephone = cTelephone == null ? null : cTelephone.trim();
	}

	public String getcFax() {
		return cFax;
	}

	public void setcFax(String cFax) {
		this.cFax = cFax == null ? null : cFax.trim();
	}

	public String getcPostcode() {
		return cPostcode;
	}

	public void setcPostcode(String cPostcode) {
		this.cPostcode = cPostcode == null ? null : cPostcode.trim();
	}

	public String getcUrl() {
		return cUrl;
	}

	public void setcUrl(String cUrl) {
		this.cUrl = cUrl == null ? null : cUrl.trim();
	}

	public String getcBusinessLicense() {
		return cBusinessLicense;
	}

	public void setcBusinessLicense(String cBusinessLicense) {
		this.cBusinessLicense = cBusinessLicense == null ? null : cBusinessLicense.trim();
	}

	public Long getcRegMoney() {
		return cRegMoney;
	}

	public void setcRegMoney(Long cRegMoney) {
		this.cRegMoney = cRegMoney;
	}

	public String getcDepositBank() {
		return cDepositBank;
	}

	public void setcDepositBank(String cDepositBank) {
		this.cDepositBank = cDepositBank == null ? null : cDepositBank.trim();
	}

	public String getcBankAccount() {
		return cBankAccount;
	}

	public void setcBankAccount(String cBankAccount) {
		this.cBankAccount = cBankAccount == null ? null : cBankAccount.trim();
	}

	public String getcStateTaxesNumber() {
		return cStateTaxesNumber;
	}

	public void setcStateTaxesNumber(String cStateTaxesNumber) {
		this.cStateTaxesNumber = cStateTaxesNumber == null ? null : cStateTaxesNumber.trim();
	}

	public String getcLocalTaxesNumber() {
		return cLocalTaxesNumber;
	}

	public void setcLocalTaxesNumber(String cLocalTaxesNumber) {
		this.cLocalTaxesNumber = cLocalTaxesNumber == null ? null : cLocalTaxesNumber.trim();
	}

	public String getcCorporation() {
		return cCorporation;
	}

	public void setcCorporation(String cCorporation) {
		this.cCorporation = cCorporation == null ? null : cCorporation.trim();
	}

	public Long getcYearlyTurnover() {
		return cYearlyTurnover;
	}

	public void setcYearlyTurnover(Long cYearlyTurnover) {
		this.cYearlyTurnover = cYearlyTurnover;
	}

	public Customer() {
		super();

	}

	public Customer(String cName, Integer cAId, String cContactName, Integer cClId, String cCreditLine,
			String cSatisfaction, String cAddress, String cTelephone, String cFax, String cPostcode, String cUrl,
			String cBusinessLicense, Long cRegMoney, String cDepositBank, String cBankAccount, String cStateTaxesNumber,
			String cLocalTaxesNumber, String cCorporation, Long cYearlyTurnover) {
		super();
		this.cName = cName;
		this.cAId = cAId;
		this.cContactName = cContactName;
		this.cClId = cClId;
		this.cCreditLine = cCreditLine;
		this.cSatisfaction = cSatisfaction;
		this.cAddress = cAddress;
		this.cTelephone = cTelephone;
		this.cFax = cFax;
		this.cPostcode = cPostcode;
		this.cUrl = cUrl;
		this.cBusinessLicense = cBusinessLicense;
		this.cRegMoney = cRegMoney;
		this.cDepositBank = cDepositBank;
		this.cBankAccount = cBankAccount;
		this.cStateTaxesNumber = cStateTaxesNumber;
		this.cLocalTaxesNumber = cLocalTaxesNumber;
		this.cCorporation = cCorporation;
		this.cYearlyTurnover = cYearlyTurnover;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cAId=" + cAId + ", cContactName=" + cContactName
				+ ", cClId=" + cClId + ", cCreditLine=" + cCreditLine + ", cSatisfaction=" + cSatisfaction
				+ ", cAddress=" + cAddress + ", cTelephone=" + cTelephone + ", cFax=" + cFax + ", cPostcode="
				+ cPostcode + ", cUrl=" + cUrl + ", cBusinessLicense=" + cBusinessLicense + ", cRegMoney=" + cRegMoney
				+ ", cDepositBank=" + cDepositBank + ", cBankAccount=" + cBankAccount + ", cStateTaxesNumber="
				+ cStateTaxesNumber + ", cLocalTaxesNumber=" + cLocalTaxesNumber + ", cCorporation=" + cCorporation
				+ ", cYearlyTurnover=" + cYearlyTurnover + "]";
	}

}