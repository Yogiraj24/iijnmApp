package com.hp.supplier.form;

import org.apache.struts.action.ActionForm;
/**
 * 
 * @author mahajany
 *
 */
public class TechCapabilitySubmissionForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String itCapability;
	private String otherCapabilities;
	private String techThemes;
	public String getItCapability() {
		return itCapability;
	}
	public void setItCapability(String itCapability) {
		this.itCapability = itCapability;
	}
	public String getOtherCapabilities() {
		return otherCapabilities;
	}
	public void setOtherCapabilities(String otherCapabilities) {
		this.otherCapabilities = otherCapabilities;
	}
	public String getTechThemes() {
		return techThemes;
	}
	public void setTechThemes(String techThemes) {
		this.techThemes = techThemes;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
