package com.hp.supplier.form;

import org.apache.struts.action.ActionForm;
/**
 * 
 * @author mahajany
 *
 */
public class SubmissionForm1 extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String authorizer;
	private String organization;
	private String contactName;
	private String contactTitle;
	private String emailaddress;
	private String phoneaddress;
	private String test;
	
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getAuthorizer() {
		return authorizer;
	}
	public void setAuthorizer(String authorizer) {
		this.authorizer = authorizer;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
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
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getPhoneaddress() {
		return phoneaddress;
	}
	public void setPhoneaddress(String phoneaddress) {
		this.phoneaddress = phoneaddress;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
