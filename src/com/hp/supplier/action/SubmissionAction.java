package com.hp.supplier.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hp.supplier.form.SubmissionForm1;
import com.hp.supplier.framework.BaseAction;
import com.hp.supplier.logic.SupplierLogic;
/**
 * 
 * @author mahajany
 *
 */
public class SubmissionAction extends BaseAction{

	@Override
	public ActionForward doAction(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("in submission action......................");
		SubmissionForm1 submissionForm = (SubmissionForm1)form;
/*		
		SupplierLogic logic = new SupplierLogic();
		
		boolean flag = logic.submitSupplierDetails(submissionForm);*/
		
	    return mapping.findForward("success");
	}

}
