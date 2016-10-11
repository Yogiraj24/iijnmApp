package com.hp.ukisme.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class SMEBizInfo {
	
	private int businessId;
	private String opportunity;
	private String marketPlace;
	private SMESupplier smeSupplier;
	
	@Id
	public int getBusinessId() {
		return businessId;
	}
	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}
	@ManyToOne
	@JoinColumn(name="SUPPLIERID")
	public SMESupplier getSmeSupplier() {
		return smeSupplier;
	}
	public void setSmeSupplier(SMESupplier smeSupplier) {
		this.smeSupplier = smeSupplier;
	}
	public String getOpportunity() {
		return opportunity;
	}
	public void setOpportunity(String opportunity) {
		this.opportunity = opportunity;
	}
	public String getMarketPlace() {
		return marketPlace;
	}
	public void setMarketPlace(String marketPlace) {
		this.marketPlace = marketPlace;
	}
	
	
	
	

}
