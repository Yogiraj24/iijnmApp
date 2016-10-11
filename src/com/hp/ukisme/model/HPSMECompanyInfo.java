package com.hp.ukisme.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="HP_COMPANYINFO")
public class HPSMECompanyInfo {
	
	private int companyId;
	private String companyName;
	private String isSME;
	private String registration;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private String postalCode;
	private String website;
	private String contactName;
	private String contactTitle;
	private String contactPhone;
	private String contactEmail;
	private String DUNS;
	private String registrationNo;
	private String diversityProg;
	private String diverse;
	private String underGroup;
	private String minorityOrgs;
	private String minorityOther;
	private String yearEst;
	private String numEmployees;
	private String salesTurnover;
	private String legalStructure;
	private String netAssets;
	private String parentCompany;
	
	private Date creationDate;
	private Date modifiedDate;
	private List<HPSMETechCapability> techCapability = new ArrayList<HPSMETechCapability>();
	private List<HPSMEOfferings> offerings = new ArrayList<HPSMEOfferings>();
	private List<HPSMETradingActivities> tradingActivities=new ArrayList<HPSMETradingActivities>();
	private List<HPSMEHistorySubmission> historySubmission = new ArrayList<HPSMEHistorySubmission>();
	private List<HPSMEMarketSubmission> marketSubmission = new ArrayList<HPSMEMarketSubmission>();

	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getIsSME() {
		return isSME;
	}
	public void setIsSME(String isSME) {
		this.isSME = isSME;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactTitle() {
		return contactTitle;
	}
	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getDUNS() {
		return DUNS;
	}
	public void setDUNS(String dUNS) {
		DUNS = dUNS;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getDiversityProg() {
		return diversityProg;
	}
	public void setDiversityProg(String diversityProg) {
		this.diversityProg = diversityProg;
	}
	public String getDiverse() {
		return diverse;
	}
	public void setDiverse(String diverse) {
		this.diverse = diverse;
	}
	public String getUnderGroup() {
		return underGroup;
	}
	public void setUnderGroup(String underGroup) {
		this.underGroup = underGroup;
	}
	public String getMinorityOrgs() {
		return minorityOrgs;
	}
	public void setMinorityOrgs(String minorityOrgs) {
		this.minorityOrgs = minorityOrgs;
	}
	public String getMinorityOther() {
		return minorityOther;
	}
	public void setMinorityOther(String minorityOther) {
		this.minorityOther = minorityOther;
	}
	public String getYearEst() {
		return yearEst;
	}
	public void setYearEst(String yearEst) {
		this.yearEst = yearEst;
	}
	public String getNumEmployees() {
		return numEmployees;
	}
	public void setNumEmployees(String numEmployees) {
		this.numEmployees = numEmployees;
	}
	public String getSalesTurnover() {
		return salesTurnover;
	}
	public void setSalesTurnover(String salesTurnover) {
		this.salesTurnover = salesTurnover;
	}
	public String getLegalStructure() {
		return legalStructure;
	}
	public void setLegalStructure(String legalStructure) {
		this.legalStructure = legalStructure;
	}
	public String getNetAssets() {
		return netAssets;
	}
	public void setNetAssets(String netAssets) {
		this.netAssets = netAssets;
	}
	public String getParentCompany() {
		return parentCompany;
	}
	public void setParentCompany(String parentCompany) {
		this.parentCompany = parentCompany;
	}
	
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	@OneToMany(mappedBy="companyInfo")
	public List<HPSMETechCapability> getTechCapability() {
		return techCapability;
	}
	public void setTechCapability(List<HPSMETechCapability> techCapability) {
		this.techCapability = techCapability;
	}
	@OneToMany(mappedBy="companyInfo")
	public List<HPSMEOfferings> getOfferings() {
		return offerings;
	}
	public void setOfferings(List<HPSMEOfferings> offerings) {
		this.offerings = offerings;
	}
	@OneToMany(mappedBy="companyInfo")
	public List<HPSMETradingActivities> getTradingActivities() {
		return tradingActivities;
	}
	public void setTradingActivities(List<HPSMETradingActivities> tradingActivities) {
		this.tradingActivities = tradingActivities;
	}
	@OneToMany(mappedBy="companyInfo")
	public List<HPSMEHistorySubmission> getHistorySubmission() {
		return historySubmission;
	}
	public void setHistorySubmission(List<HPSMEHistorySubmission> historySubmission) {
		this.historySubmission = historySubmission;
	}
	@OneToMany(mappedBy="companyInfo")
	public List<HPSMEMarketSubmission> getMarketSubmission() {
		return marketSubmission;
	}
	public void setMarketSubmission(List<HPSMEMarketSubmission> marketSubmission) {
		this.marketSubmission = marketSubmission;
	}
	
	
	

}
