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
@Table(name="HP_MARKET")
public class HPSMEMarketSubmission {
	private int marketId;
	private String industriesServed;
	private String otherIndustries;
	private String marketsServed ;
	
	private HPSMECompanyInfo companyInfo;
	private Date creationDate;
	private Date modifiedDate;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getMarketId() {
		return marketId;
	}
	public void setMarketId(int marketId) {
		this.marketId = marketId;
	}
	public String getIndustriesServed() {
		return industriesServed;
	}
	public void setIndustriesServed(String industriesServed) {
		this.industriesServed = industriesServed;
	}
	public String getOtherIndustries() {
		return otherIndustries;
	}
	public void setOtherIndustries(String otherIndustries) {
		this.otherIndustries = otherIndustries;
	}
	public String getMarketsServed() {
		return marketsServed;
	}
	public void setMarketsServed(String marketsServed) {
		this.marketsServed = marketsServed;
	}
	@ManyToOne
	@JoinColumn(name="COMPANYID")
	public HPSMECompanyInfo getCompanyInfo() {
		return companyInfo;
	}
	public void setCompanyInfo(HPSMECompanyInfo companyInfo) {
		this.companyInfo = companyInfo;
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
	
	

}
