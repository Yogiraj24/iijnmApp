package com.hp.supplier.form;

import org.apache.struts.action.ActionForm;
/**
 * 
 * @author mahajany
 *
 */
public class MarketSubmissionForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String industriesServed;
	private String otherIndustries;
	private String marketsServed ;
	
	
	public String getMarketsServed() {
		return marketsServed;
	}
	public void setMarketsServed(String marketsServed) {
		this.marketsServed = marketsServed;
	}
	public String getIndustriesServed() {
		return industriesServed;
	}
	public void setIndustriesServed(String industriesServed) {
		this.industriesServed = industriesServed;
	}
	public String getOtherIndustries() {
		return otherIndustries;
	}
	public void setOtherIndustries(String otherIndustries) {
		this.otherIndustries = otherIndustries;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
