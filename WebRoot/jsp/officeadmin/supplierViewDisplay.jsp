<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<h2>Following details are saved for the Supplier </h2>
<body>
<html:form action="/saveSupplier.do?actionType" method="post">
	<table cellpadding="3" cellspacing="0" border="0" class="formContainer">

		<tbody>
			<logic:iterate id="element" name="form" scope="request">

				<tr>
					<td nowrap="nowrap"><label>Supplier Name : </label></td>
					<td width="2"><bean:write name="element"
						property="supplierName" /></td>
				</tr>
				<tr>
					<td nowrap="nowrap"><label>Contact Person : </label></td>
					<td width="2"><bean:write name="element"
						property="contactPerson" /></td>
				</tr>
				<tr>
					<td nowrap="nowrap"><label>Contact Number : </label></td>
					<td width="2"><bean:write name="element"
						property="contactNumber" /></td>
				</tr>
				<tr>
					<td nowrap="nowrap"><label>Address : </label></td>
					<td width="2"><bean:write name="element" property="address" /></td>
				</tr>
				<tr>
					<td nowrap="nowrap"><label>Remarks : </label></td>
					<td width="2"><bean:write name="element" property="remarks" /></td>
				</tr>

				<tr>

				</tr>
			</logic:iterate>
		</tbody>
	</table>



</html:form>
</body>
</html>
