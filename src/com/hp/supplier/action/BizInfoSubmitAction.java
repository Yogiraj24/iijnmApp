package com.hp.supplier.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hp.supplier.form.BusinessInfoForm;
import com.hp.supplier.form.SubmissionForm1;
import com.hp.supplier.framework.BaseAction;
import com.hp.supplier.logic.SupplierLogic;
/**
 * 
 * @author mahajany
 *
 */
public class BizInfoSubmitAction extends BaseAction{

	@Override
	public ActionForward doAction(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		 BusinessInfoForm submissionForm = (BusinessInfoForm)form;
		
		SupplierLogic logic = new SupplierLogic();
		
		boolean flag = logic.submitBizInfoDetails(submissionForm);
		
	    return mapping.findForward("success");
	}

}
