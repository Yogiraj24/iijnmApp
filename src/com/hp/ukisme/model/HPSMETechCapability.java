package com.hp.ukisme.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="HP_TECHCAPABILITY")
public class HPSMETechCapability {
	
	private int techCapabilityId;
	private String itCapability;
	private String otherCapabilities;
	private String techThemes;
	
	private HPSMECompanyInfo companyInfo;
	private Date creationDate;
	private Date modifiedDate;
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getTechCapabilityId() {
		return techCapabilityId;
	}
	public void setTechCapabilityId(int techCapabilityId) {
		this.techCapabilityId = techCapabilityId;
	}
	public String getItCapability() {
		return itCapability;
	}
	public void setItCapability(String itCapability) {
		this.itCapability = itCapability;
	}
	public String getOtherCapabilities() {
		return otherCapabilities;
	}
	public void setOtherCapabilities(String otherCapabilities) {
		this.otherCapabilities = otherCapabilities;
	}
	public String getTechThemes() {
		return techThemes;
	}
	public void setTechThemes(String techThemes) {
		this.techThemes = techThemes;
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
	@ManyToOne
	@JoinColumn(name="COMPANYID")
	public HPSMECompanyInfo getCompanyInfo() {
		return companyInfo;
	}
	public void setCompanyInfo(HPSMECompanyInfo companyInfo) {
		this.companyInfo = companyInfo;
	}


	
	
}
