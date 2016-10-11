<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ include file="/jsp/common/dir.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title><bean:message key="login.label.administrator"/></title>

<link rel="stylesheet" type="text/css" href="../../css/common.css" />
<script language="JavaScript" src="javascript/common.js"></script>

<style>
.featureTitle{
	color: red;
	font-weight: bold;
	margin: 0px;
	line-height: 20px;
}

.featureText{
	line-height: 16px;
	margin: 0 0 10px 0;
	padding: 0px;
}
</style>
</head>

<body>
<div id="pageHeader"> 
<table width=100% border=0>
<tr><td>
<span class="logoText2">Login </span>
</td>
<td align=right>
<a href="http://www.google.com" target="_blank"> <img border="0" src="../../css/ajax-loader.gif" title="HP logo" /></a> 
</td></tr></table>
</div>
<div style="margin:25px auto; width: 30%;">
	<div class="contentBox" style="">
		
    <h1 class="hd" align="center">Login</h1>
		<div class="bd" style="overflow: visible;">

        <table border="0" cellspacing="0" cellpadding="10" align="center">
          <tr>
           <td width="220" valign="top"> 
              <html:form action="/login.do" method="post">
                <table cellpadding="3" cellspacing="0" border="0" class="formContainer">
                  <tbody>
            
                    <tr> 
                      <td nowrap="nowrap"><label>Username</label></td>
                      <td><html:text property="username" maxlength="100" /></td>
                    </tr>
                    <tr>
                  	  <td colspan="2"><font color='red'><html:errors property="password"/></font></td>
                  	</tr>
                    <tr> 
                      <td><label>Password</label></td>
                      <td><html:password property="password" maxlength="15" value=""/></td>
                    </tr>

                    <tr> 
                      <td colspan="2" class="submitRow"> <span class="pushButton"> 
                        <html:submit >Submit</html:submit>
                        </span> </td>
                        
                    </tr>
                    <tr> 
                      <td colspan="2" class="submitRow">
                      <html:link action="/forgotPasswordPage.do">ForgotPassword</html:link><br />
                      <br/>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </html:form></td>
          </tr>
        </table>
		</div>
	</div>
</div>
<div id="pageFooter">

<br><br><br><br><br><br><br><br><br><br><br>
&copy<a href="http://athp.hp.com/portal/site/athp/" target="_blank">Hewlett Packard</a>
</div>
<!-- footer end -->
</body>

</html>
