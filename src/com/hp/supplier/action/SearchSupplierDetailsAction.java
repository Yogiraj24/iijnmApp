package com.hp.supplier.action;

import java.util.List;
import com.hp.supplier.form.SubmissionForm1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hp.supplier.framework.BaseAction;
import com.hp.supplier.logic.SupplierLogic;

public class SearchSupplierDetailsAction extends BaseAction{

	@Override
	public ActionForward doAction(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		SubmissionForm1 submissionForm = (SubmissionForm1)form;
		SupplierLogic logic = new SupplierLogic();
		
		List list = logic.searchSupplierDetails(submissionForm);
		
		request.setAttribute("data", list);
		
	    return mapping.findForward("success");
	}

}
