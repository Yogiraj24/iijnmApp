package com.hp.ukisme.dao;

import java.util.List;

import com.hp.ukisme.model.HPSMECompanyInfo;

public interface IHPSMECompanyInfo {
	public void add(HPSMECompanyInfo companyInfo);
	public void edit(HPSMECompanyInfo companyInfo);
	public void delete(int companyId);
	public HPSMECompanyInfo getCompanyInfo(int companyId);
	public List<HPSMECompanyInfo> getAllCompanies();

}
