package com.hp.supplier.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hp.supplier.framework.BaseAction;
import com.hp.supplier.logic.LoginLogic;

public class TechCapabilitySubmissionView extends BaseAction{

	@Override
	public ActionForward doAction(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		
		return mapping.findForward("success");
	}

}
