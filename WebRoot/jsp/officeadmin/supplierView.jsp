<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<h2>Enter Supplier Details</h2>
<body>
		<html:form action="/saveSupplier.do?actionType"
			method="post">
			<table cellpadding="3" cellspacing="0" border="0"
				class="formContainer">
				<tbody>

					<tr>
						<td nowrap="nowrap"><label>Supplier Name</label></td>
						<td><html:text property="supplierName" maxlength="100" /></td>
					</tr>
					<tr>
						<td nowrap="nowrap"><label>Contact Person</label></td>
						<td><html:text property="contactPerson" maxlength="100" /></td>
					</tr>
					<tr>
						<td nowrap="nowrap"><label>Contact Number</label></td>
						<td><html:text property="contactNumber" maxlength="100" /></td>
					</tr>
					<tr>
						<td nowrap="nowrap"><label>Address</label></td>
						<td><html:textarea property="address"  /></td>
					</tr>
					<tr>
						<td nowrap="nowrap"><label>Remarks</label></td>
						<td><html:textarea property="remarks"  /></td>
					</tr>

				<tr>
				<td colspan="2" class="submitRow"><span class="pushButton">
				<span> <html:submit>
					<bean:message key="common.label.submit" />
				</html:submit> </span> </span> </td>

			</tr>
				</tbody>
			</table>
				
			
			
		</html:form>
</body>
</html>
