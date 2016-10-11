package com.hp.supplier.form;

import org.apache.struts.action.ActionForm;
/**
 * 
 * @author mahajany
 *
 */
public class TrandingActivitiesForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String type;
	private String otherType;
	private String principleProducts;
	private String principleServices;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOtherType() {
		return otherType;
	}
	public void setOtherType(String otherType) {
		this.otherType = otherType;
	}
	public String getPrincipleProducts() {
		return principleProducts;
	}
	public void setPrincipleProducts(String principleProducts) {
		this.principleProducts = principleProducts;
	}
	public String getPrincipleServices() {
		return principleServices;
	}
	public void setPrincipleServices(String principleServices) {
		this.principleServices = principleServices;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
