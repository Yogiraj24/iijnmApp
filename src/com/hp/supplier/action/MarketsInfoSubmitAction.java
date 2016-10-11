package com.hp.supplier.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hp.supplier.form.MarketInfoForm;
import com.hp.supplier.framework.BaseAction;
import com.hp.supplier.logic.SupplierLogic;
/**
 * 
 * @author mahajany
 *
 */
public class MarketsInfoSubmitAction extends BaseAction{

	@Override
	public ActionForward doAction(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		MarketInfoForm marketInfoForm = (MarketInfoForm)form;
			
			SupplierLogic logic = new SupplierLogic();
			
			boolean flag = logic.submitMarketInfo(marketInfoForm);
			
		    return mapping.findForward("success");
		
		
	}

}
