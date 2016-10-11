<%@ page import="org.apache.struts.Globals, java.util.Locale" language="java" pageEncoding="UTF-8"%>

<%
String dir = "ltr";

if(request.getParameter("locale") != null && !request.getParameter("locale").equals("")){
   	request.getSession(true).setAttribute(Globals.LOCALE_KEY , new Locale(request.getParameter("locale")));
}else{
	if(request.getSession(true).getAttribute(Globals.LOCALE_KEY) == null){
		request.getSession(true).setAttribute(Globals.LOCALE_KEY , new Locale("en"));
	}
}

Locale locale = (Locale)request.getSession(true).getAttribute(Globals.LOCALE_KEY);
if(locale.getLanguage().equals("ar")){
	dir = "rtl";
}

if(request.getParameter("menu_id") != null && !request.getParameter("menu_id").equals("")){


   //	request.getSession(true).setAttribute(in.yogi.platform.action.SessionConstants.MENU_ID , request.getParameter("menu_id"));
}

%>
