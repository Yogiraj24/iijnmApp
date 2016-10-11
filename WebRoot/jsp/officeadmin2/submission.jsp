<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<h2>Submission</h2>
<h2>I have read the proceeding information and understnad that submission or acceptance of my company's information into this SUpplier Diversity registration tool is no guarantee of HP using my comapny as a supplier . By submitting information on this form , I understand tha tI am voluntarily providing this inforamtion and thhat HP is not obligated or bound to any agreemrnt with or commitment to me or the company I represent 

I hereby declare that all of the inforamtion I have provided in this SUpplier Registration form is true , correct and complete .
</h2>
<body>
<html:form action="/searchSupplier.do?actionType" method="post">
	<table cellpadding="3" cellspacing="0" border="0" class="formContainer">
		<tbody>

			<tr>
				<td nowrap="nowrap"><label>Authorised Signature</label></td>
				<td><html:text property="supplierName" maxlength="100" /></td>
			</tr>

			<tr>
				<td nowrap="nowrap"><label>Oraganisation</label></td>
				<td><html:text property="supplierName" maxlength="100" /></td>
			</tr>
			
			<tr>
				<td nowrap="nowrap"><label>Contact Name</label></td>
				<td><html:text property="supplierName" maxlength="100" /></td>
			</tr>
			
			<tr>
				<td nowrap="nowrap"><label>Contact Title</label></td>
				<td><html:text property="supplierName" maxlength="100" /></td>
			</tr>

			<tr>
				<td nowrap="nowrap"><label>Email Address</label></td>
				<td><html:text property="supplierName" maxlength="100" /></td>
			</tr>
			
			
			<tr>
				<td nowrap="nowrap"><label>Phone Number</label></td>
				<td><html:text property="supplierName" maxlength="100" /></td>
			</tr>
			<tr>
				<td colspan="2" class="submitRow"><span class="pushButton">
				<span> <html:submit>Save & Next
				</html:submit> </span> </span></td>

			</tr>
		</tbody>
	</table>
	
</html:form>
</body>
</html>
