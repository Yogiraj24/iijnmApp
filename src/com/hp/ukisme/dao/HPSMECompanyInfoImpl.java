package com.hp.ukisme.dao;

import java.util.List;

import org.hibernate.Session;

import com.cosp.sessionfactory.HibernateSessionFactory;
import com.hp.ukisme.model.HPSMECompanyInfo;

public class HPSMECompanyInfoImpl implements IHPSMECompanyInfo{

	
	public void add(HPSMECompanyInfo companyInfo) {
	Session	session=HibernateSessionFactory.getSession();
	session.beginTransaction();
	session.save(companyInfo);
	session.beginTransaction().commit();
		
	}

	
	public void edit(HPSMECompanyInfo companyInfo) {
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
