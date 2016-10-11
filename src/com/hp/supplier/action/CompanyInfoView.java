package com.hp.supplier.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hp.supplier.form.CompanyInfoForm;
import com.hp.supplier.framework.BaseAction;
import com.hp.ukisme.service.HPSMECompanyInfoServiceImpl;
import com.hp.ukisme.service.IHPSMECompanyInfoService;

public class CompanyInfoView extends BaseAction{

	@Override
	public ActionForward doAction(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		CompanyInfoForm companyInfoForm=(CompanyInfoForm)form;
		
		System.out.println("Testing................................................."+companyInfoForm.getCompanyName());
		
		IHPSMECompanyInfoService companyInfoService=new HPSMECompanyInfoServiceImpl();
		companyInfoService.add(companyInfoForm);
		return mapping.findForward("success");
	}

}
