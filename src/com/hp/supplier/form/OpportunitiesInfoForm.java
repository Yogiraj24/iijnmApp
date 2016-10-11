package com.hp.supplier.form;

import org.apache.struts.action.ActionForm;
/**
 * 
 * @author mahajany
 *
 */
public class OpportunitiesInfoForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String second;
	private String first;
	private String thired;
	private String fourth;
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getThired() {
		return thired;
	}
	public void setThired(String thired) {
		this.thired = thired;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getFourth() {
		return fourth;
	}
	public void setFourth(String fourth) {
		this.fourth = fourth;
	}
	
	
	
}
