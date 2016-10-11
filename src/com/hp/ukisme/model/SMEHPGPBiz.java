package com.hp.ukisme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class SMEHPGPBiz {
	
	private int HPGPBizId;

	private String remarks;
	private String approvalStatus;
	private SMESupplier smeSupplier;
	@Id
	public int getHPGPBizId() {
		return HPGPBizId;
	}
	public void setHPGPBizId(int hPGPBizId) {
		HPGPBizId = hPGPBizId;
	}
	@ManyToOne
	@JoinColumn(name="SUPPLIERID")
	public SMESupplier getSmeSupplier() {
		return smeSupplier;
	}
	public void setSmeSupplier(SMESupplier smeSupplier) {
		this.smeSupplier = smeSupplier;
	}
	@Column(length=20)
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	

}
