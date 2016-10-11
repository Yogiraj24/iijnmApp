package com.hp.supplier.form;

import org.apache.struts.action.ActionForm;
/**
 * 
 * @author mahajany
 *
 */
public class HistorySubmissionForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String isCurrentSupplier;
	private String currentSupplier;
	private String inContractHp;
	private String listContract;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
