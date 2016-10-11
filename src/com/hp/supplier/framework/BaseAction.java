package com.hp.supplier.framework;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hp.supplier.logic.LoginLogic;

public abstract class BaseAction extends Action {

	public BaseAction() {
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("in execute................................");
		LoginLogic loginLogic = new LoginLogic();
		boolean flag = loginLogic.getAuthenticate();
		
		ActionForward forward = doAction(mapping, form, request, response);
		return forward;
	}

	public abstract ActionForward doAction(ActionMapping actionmapping,
			ActionForm actionform, HttpServletRequest httpservletrequest,
			HttpServletResponse httpservletresponse) throws Exception;

/*	public String getMessage(HttpServletRequest request, String key) {
		return getResources(request).getMessage(
				(Locale) request.getSession().getAttribute(
						"org.apache.struts.action.LOCALE"), key);
	}*/
}
