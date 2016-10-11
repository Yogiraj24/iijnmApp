package com.hp.supplier.form;

import org.apache.struts.action.ActionForm;
/**
 * 
 * @author mahajany
 *
 */
public class OfferingsSubmissionForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String solutionTitle;
	private String docURL;
	private String barriersOvercomed;
	private String businessOutcomes;
	private String scenarios;
	private String whoBenefits;
	private String addlSolutions;
	
	public String getSolutionTitle() {
		return solutionTitle;
	}
	public void setSolutionTitle(String solutionTitle) {
		this.solutionTitle = solutionTitle;
	}
	public String getDocURL() {
		return docURL;
	}
	public void setDocURL(String docURL) {
		this.docURL = docURL;
	}
	public String getBarriersOvercomed() {
		return barriersOvercomed;
	}
	public void setBarriersOvercomed(String barriersOvercomed) {
		this.barriersOvercomed = barriersOvercomed;
	}
	public String getBusinessOutcomes() {
		return businessOutcomes;
	}
	public void setBusinessOutcomes(String businessOutcomes) {
		this.businessOutcomes = businessOutcomes;
	}
	public String getScenarios() {
		return scenarios;
	}
	public void setScenarios(String scenarios) {
		this.scenarios = scenarios;
	}
	public String getWhoBenefits() {
		return whoBenefits;
	}
	public void setWhoBenefits(String whoBenefits) {
		this.whoBenefits = whoBenefits;
	}
	public String getAddlSolutions() {
		return addlSolutions;
	}
	public void setAddlSolutions(String addlSolutions) {
		this.addlSolutions = addlSolutions;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
