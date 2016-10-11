package com.hp.ukisme.service;

import java.util.List;

import com.hp.supplier.form.CompanyInfoForm;
import com.hp.ukisme.dao.HPSMECompanyInfoImpl;
import com.hp.ukisme.dao.IHPSMECompanyInfo;
import com.hp.ukisme.mapper.CompanyInfoMap;
import com.hp.ukisme.model.HPSMECompanyInfo;

public class HPSMECompanyInfoServiceImpl implements IHPSMECompanyInfoService{
	private IHPSMECompanyInfo companyInfoDAO=new HPSMECompanyInfoImpl();
	
	public void add(CompanyInfoForm companyInfoForm) {
		
		companyInfoDAO.add(CompanyInfoMap.from(companyInfoForm));
	}

	
	public void edit(CompanyInfoForm companyInfoForm) {
		// TODO Auto-generated method stub
		
	}

	
	public void delete(int companyId) {
		// TODO Auto-generated method stub
		
	}

	
	public HPSMECompanyInfo getCompanyInfo(int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<HPSMECompanyInfo> getAllCompanies() {
		// TODO Auto-generated method stub
		return null;
	}

}
