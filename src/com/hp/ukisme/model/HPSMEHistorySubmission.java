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
@Table(name="HP_HISTORY")
public class HPSMEHistorySubmission {
	
	private int historyId;
	private String isCurrentSupplier;
	private String currentSupplier;
	private String inContractHp;
	private String listContract;
	
	private HPSMECompanyInfo companyInfo;
	private Date creationDate;
	private Date modifiedDate;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getHistoryId() {
		return historyId;
	}
	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}
	public String getIsCurrentSupplier() {
		return isCurrentSupplier;
	}
	public void setIsCurrentSupplier(String isCurrentSupplier) {
		this.isCurrentSupplier = isCurrentSupplier;
	}
	public String getCurrentSupplier() {
		return currentSupplier;
	}
	public void setCurrentSupplier(String currentSupplier) {
		this.currentSupplier = currentSupplier;
	}
	public String getInContractHp() {
		return inContractHp;
	}
	public void setInContractHp(String inContractHp) {
		this.inContractHp = inContractHp;
	}
	public String getListContract() {
		return listContract;
	}
	public void setListContract(String listContract) {
		this.listContract = listContract;
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
