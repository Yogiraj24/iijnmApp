<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<h2>Authorizer Information</h2>
<body>
		<html:form action="/submissionAction.do?actionType"
			method="post">
			<table cellpadding="3" cellspacing="0" border="0"
				class="formContainer">
				<tbody>

					<tr>
						<td nowrap="nowrap"><label>Authorised Signature</label></td>
						<td><html:text property="authorizer" maxlength="100" /></td>
					</tr>
					<tr>
						<td nowrap="nowrap"><label>Organisation</label></td>
						<td><html:text property="organization" maxlength="100" /></td>
					</tr>
					<tr>
						<td nowrap="nowrap"><label>Contact Name</label></td>
						<td><html:text property="contactName" maxlength="100" /></td>
					</tr>
					<tr>
						<td nowrap="nowrap"><label>Contact Title</label></td>
						<td><html:text property="contactTitle" /></td>
					</tr>
					<tr>
						<td nowrap="nowrap"><label>Email Address</label></td>
						<td><html:textarea property="emailaddress"  /></td>
					</tr>
					<tr>
						<td nowrap="nowrap"><label>Phone Number</label></td>
						<td><html:text property="phoneaddress"  /></td>
					</tr>
					<tr>
						<td nowrap="nowrap"><label>Test</label></td>
						<td><html:text property="test"  /></td>
					</tr>
					

				<tr>
				<td colspan="2" class="submitRow"><span class="pushButton">
				<span> <html:submit>
					Save & Next
				</html:submit> </span> </span> </td>

			</tr>
				</tbody>
			</table>
				
			
			
		</html:form>
</body>
</html>
