package com.hp.ukisme.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

public class SMESupplier {

	private int supplierId;
	private String supplierName;
	private String organisation;
	private String contactName;
	private String contactTitle;
	private String email;
	private String phoneNumber;
	private List<SMEBizInfo> businessInfo = new ArrayList<SMEBizInfo>();
	private List<SMECustRef> customerReference = new ArrayList<SMECustRef>();
	private List<SMEHPGPBiz> hpGpBusiness = new ArrayList<SMEHPGPBiz>();
	
	@Id
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getOrganisation() {
		return organisation;
	}
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@OneToMany(mappedBy="smeSupplier")
	public List<SMEBizInfo> getBusinessInfo() {
		return businessInfo;
	}
	public void setBusinessInfo(List<SMEBizInfo> businessInfo) {
		this.businessInfo = businessInfo;
	}
	@OneToMany
	public List<SMECustRef> getCustomerReference() {
		return customerReference;
	}
	public void setCustomerReference(List<SMECustRef> customerReference) {
		this.customerReference = customerReference;
	}
	@OneToMany
	public List<SMEHPGPBiz> getHpGpBusiness() {
		return hpGpBusiness;
	}
	public void setHpGpBusiness(List<SMEHPGPBiz> hpGpBusiness) {
		this.hpGpBusiness = hpGpBusiness;
	}	
	
	

}
