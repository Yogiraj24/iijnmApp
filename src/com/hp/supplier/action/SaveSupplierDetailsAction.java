package com.hp.supplier.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hp.supplier.form.SupplierForm;
import com.hp.supplier.framework.BaseAction;
import com.hp.supplier.logic.SupplierLogic;

public class SaveSupplierDetailsAction extends BaseAction{

	@Override
	public ActionForward doAction(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		SupplierForm supplierForm = (SupplierForm)form;
		SupplierLogic supplierLogic = new SupplierLogic();
		boolean flag = supplierLogic.saveSupplier(supplierForm);
		 if (flag==true){
			 
			 List<SupplierForm> al  = new ArrayList<SupplierForm>();
			 al.add(supplierForm);
			request.setAttribute("form", al) ; 
			return mapping.findForward("success");
		 }
		
		 
		
	    return mapping.findForward("failure");
	}

}
