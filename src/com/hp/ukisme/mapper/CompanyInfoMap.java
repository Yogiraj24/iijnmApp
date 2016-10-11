package com.hp.ukisme.mapper;

import com.hp.supplier.form.CompanyInfoForm;
import com.hp.ukisme.model.HPSMECompanyInfo;

public class CompanyInfoMap {
	/** Maps a DAO bean from a domain bean. */
	//public static final FromDAO fromDAO = new FromDAO();
	/** Maps BO to DAO */
	public static final ToDAO toDAO = new ToDAO();

	/**
	 * @param Employee BO
	 * @return Employees DAO
	 */
	
	public static HPSMECompanyInfo from(CompanyInfoForm companyInfoForm) {
		return (companyInfoForm == null ? null : toDAO.from(companyInfoForm));
	}
	static class ToDAO {
		public HPSMECompanyInfo from(CompanyInfoForm companyInfoForm) {
			HPSMECompanyInfo companyInfo = new HPSMECompanyInfo();
			companyInfo.setCompanyName(companyInfoForm.getCompanyName());
			companyInfo.setAddress1(companyInfoForm.getAddress1());
			companyInfo.setAddress2(companyInfoForm.getAddress2());
			companyInfo.setCity(companyInfoForm.getCity());
			return companyInfo;
		}
	}

}
