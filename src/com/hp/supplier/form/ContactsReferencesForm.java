package com.hp.supplier.form;

import org.apache.struts.action.ActionForm;
/**
 * 
 * @author mahajany
 *
 */
public class ContactsReferencesForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String uk;
	private String eec;
	private String noneec;
	public String getUk() {
		return uk;
	}
	public void setUk(String uk) {
		this.uk = uk;
	}
	public String getEec() {
		return eec;
	}
	public void setEec(String eec) {
		this.eec = eec;
	}
	public String getNoneec() {
		return noneec;
	}
	public void setNoneec(String noneec) {
		this.noneec = noneec;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
