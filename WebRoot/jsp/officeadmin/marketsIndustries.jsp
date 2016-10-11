<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">

<html>
<!-- PLACEHOLDER CSS REF, REQUIRED TO INDICATE REQUIRED TAGS -->
<head><link rel="stylesheet" type="text/css" href="http://localhost:8080/SupplierApp/css/ltr/common.css"/></head>
<h2>Company Information</h2>
<body>
	<html:form action="/marketSubmission.do">
		<table cellpadding="3" cellspacing="0" border="0"
			class="formContainer">
			<tbody>
				<tr>
					<td nowrap class="required"><bean:message
							key="market.label.marketsServed" /></td>
					<td><html:select property="marketsServed" multiple="true">
							<html:option value="1">Placeholder1</html:option>
							<html:option value="2">Placeholder2</html:option>
							<html:option value="3">Placeholder3</html:option>
							<html:option value="4">Placeholder4</html:option>
						</html:select></td>
					<td class="error"><html:errors property="marketsServed"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="market.label.industriesServed" /></td>
					<td><html:select property="industriesServed" multiple="true">
							<html:option value="1">Placeholder1</html:option>
							<html:option value="2">Placeholder2</html:option>
							<html:option value="3">Placeholder3</html:option>
							<html:option value="4">Placeholder4</html:option>
						</html:select></td>
					<td class="error"><html:errors property="industriesServed"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="market.label.otherIndustries" /></td>
					<td><html:text property="otherIndustries" maxlength="50" /></td>
					<td class="error"><html:errors property="otherIndustries"></html:errors></td>
				</tr>
				<tr>
					<td colspan="3"><font color="red">* </font>Indicates a
						required field</td>
				</tr>
				<tr>
					<td colspan="3" class="submitRow"><span class="pushButton">
							<span> <html:submit>
					Save & Next
				</html:submit>
						</span>
					</span></td>

				</tr>
			</tbody>
		</table>
	</html:form>
</body>
</html>
