package com.edu.iijnm.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.edu.iijnm.form.SignForm;
import com.edu.iijnm.framework.BaseAction;
import com.edu.iijnm.logic.LoginLogic;

public class SignUpSubmitAction extends BaseAction{

	@Override
	public ActionForward doAction(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		SignForm signForm=(SignForm)form;
		
		
		LoginLogic logic = new LoginLogic();
		boolean status = logic.registration(signForm);
		if (status == true ){
		return mapping.findForward("success");
		}
		return mapping.findForward("failure");
	}

}
