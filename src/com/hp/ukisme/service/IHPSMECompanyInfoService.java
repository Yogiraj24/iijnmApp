package com.hp.ukisme.service;

import java.util.List;

import com.hp.supplier.form.CompanyInfoForm;
import com.hp.ukisme.model.HPSMECompanyInfo;

public interface IHPSMECompanyInfoService {
	public void add(CompanyInfoForm companyInfoForm);
	public void edit(CompanyInfoForm companyInfoForm);
	public void delete(int companyId);
	public HPSMECompanyInfo getCompanyInfo(int companyId);
	public List<HPSMECompanyInfo> getAllCompanies();
}
