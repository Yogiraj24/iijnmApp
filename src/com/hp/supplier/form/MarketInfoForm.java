package com.hp.supplier.form;

import org.apache.struts.action.ActionForm;
/**
 * 
 * @author mahajany
 *
 */
public class MarketInfoForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String england;
	private String scotland;
	private String others;
	public String getEngland() {
		return england;
	}
	public void setEngland(String england) {
		this.england = england;
	}
	public String getScotland() {
		return scotland;
	}
	public void setScotland(String scotland) {
		this.scotland = scotland;
	}
	public String getOthers() {
		return others;
	}
	public void setOthers(String others) {
		this.others = others;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	}
