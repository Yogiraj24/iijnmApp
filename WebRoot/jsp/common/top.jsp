<%@ page language="java" import="org.apache.struts.Globals, java.util.Locale" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%
session.setAttribute("org.apache.struts.action.LOCALE", new Locale("en"));
 %>
<script language="javascript">
function callLang(){
var value = document.form.lang.value;
alert(value);
var id;
document.forms[0].action = "addPublishing.do?oo=uu";
document.forms[0].submit();
}

</script>
<div id="pageHeader"> 
	<img alt="" src="./images/logo2.jpg">	
	<form name="form">
	<!--<table align="right">
	<td>Language</td>
	<td align="">
	<select id="lang" onchange="callLang()">
	<option value="E">English</option>
	<option value="S">Swedish</option>
	<option value="F">French</option>
	<option value="G">German</option>
	</select>
	</td>
	
	</table>

	--></form>
	<div class="logout" align="right"><html:link action="/logout.do">LogOut</html:link></div>
</div>
