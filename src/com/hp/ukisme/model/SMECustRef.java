package com.hp.ukisme.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity

public class SMECustRef {
	
	private int custRefId;
	private String customerName;
	private String email;
	private String contactNumber;
	private String address;
	private SMESupplier smeSupplier;
	
	@Id
	public int getCustRefId() {
		return custRefId;
	}
	public void setCustRefId(int custRefId) {
		this.custRefId = custRefId;
	}
	@ManyToOne
	@JoinColumn(name="SUPPLIERID")
	public SMESupplier getSmeSupplier() {
		return smeSupplier;
	}
	public void setSmeSupplier(SMESupplier smeSupplier) {
		this.smeSupplier = smeSupplier;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
