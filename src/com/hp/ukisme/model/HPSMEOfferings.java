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
@Table(name="HP_OFFERINGS")
public class HPSMEOfferings {
	
	private int offeringsId;
	private String solutionTitle;
	private String docURL;
	private String barriersOvercomed;
	private String businessOutcomes;
	private String scenarios;
	private String whoBenefits;
	private String addlSolutions;
	
	private HPSMECompanyInfo companyInfo;
	private Date creationDate;
	private Date modifiedDate;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getOfferingsId() {
		return offeringsId;
	}
	public void setOfferingsId(int offeringsId) {
		this.offeringsId = offeringsId;
	}
	public String getSolutionTitle() {
		return solutionTitle;
	}
	public void setSolutionTitle(String solutionTitle) {
		this.solutionTitle = solutionTitle;
	}
	public String getDocURL() {
		return docURL;
	}
	public void setDocURL(String docURL) {
		this.docURL = docURL;
	}
	public String getBarriersOvercomed() {
		return barriersOvercomed;
	}
	public void setBarriersOvercomed(String barriersOvercomed) {
		this.barriersOvercomed = barriersOvercomed;
	}
	public String getBusinessOutcomes() {
		return businessOutcomes;
	}
	public void setBusinessOutcomes(String businessOutcomes) {
		this.businessOutcomes = businessOutcomes;
	}
	public String getScenarios() {
		return scenarios;
	}
	public void setScenarios(String scenarios) {
		this.scenarios = scenarios;
	}
	public String getWhoBenefits() {
		return whoBenefits;
	}
	public void setWhoBenefits(String whoBenefits) {
		this.whoBenefits = whoBenefits;
	}
	public String getAddlSolutions() {
		return addlSolutions;
	}
	public void setAddlSolutions(String addlSolutions) {
		this.addlSolutions = addlSolutions;
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
