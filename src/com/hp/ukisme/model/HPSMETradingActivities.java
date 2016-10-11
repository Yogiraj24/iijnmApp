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
@Table(name="HP_TRADINGACTIVITIES")
public class HPSMETradingActivities {
	
	private int tradingActivitiesId;
	private String type;
	private String otherType;
	private String principleProducts;
	private String principleServices;
	
	private HPSMECompanyInfo companyInfo;
	private Date creationDate;
	private Date modifiedDate;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getTradingActivitiesId() {
		return tradingActivitiesId;
	}
	public void setTradingActivitiesId(int tradingActivitiesId) {
		this.tradingActivitiesId = tradingActivitiesId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOtherType() {
		return otherType;
	}
	public void setOtherType(String otherType) {
		this.otherType = otherType;
	}
	public String getPrincipleProducts() {
		return principleProducts;
	}
	public void setPrincipleProducts(String principleProducts) {
		this.principleProducts = principleProducts;
	}
	public String getPrincipleServices() {
		return principleServices;
	}
	public void setPrincipleServices(String principleServices) {
		this.principleServices = principleServices;
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
