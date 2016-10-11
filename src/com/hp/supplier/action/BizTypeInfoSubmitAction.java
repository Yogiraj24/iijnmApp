package com.hp.supplier.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hp.supplier.form.TypesOfBusinessForm;
import com.hp.supplier.framework.BaseAction;
import com.hp.supplier.logic.SupplierLogic;
/**
 * 
 * @author mahajany
 *
 */
public class BizTypeInfoSubmitAction extends BaseAction{

	@Override
	public ActionForward doAction(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		 TypesOfBusinessForm businessForm = (TypesOfBusinessForm)form;
		
		SupplierLogic logic = new SupplierLogic();
		
		boolean flag = logic.submitBizTypesDetails(businessForm);
		
	    return mapping.findForward("success");
	}

}
