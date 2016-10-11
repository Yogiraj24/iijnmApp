<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">

<html>
<!-- PLACEHOLDER CSS REF, REQUIRED TO INDICATE REQUIRED TAGS -->
<head>
<link rel="stylesheet" type="text/css"
	href="http://localhost:8080/SupplierApp/css/ltr/common.css" />
</head>
<h2>Technology Business Capability</h2>
<body>
	<html:form action="/techCapabilitySubmission" method="post">
		<table cellpadding="3" cellspacing="0" border="0"
			class="formContainer">
			<tr>
				<td colspan="3">HP, as one of the world’s leading
					technology solutions companies, is always interested in innovative
					and enterprising technology solutions. If this is applicable to
					your registration please complete this section to bring your
					business opportunities to our technology experts who are always
					seeking innovative customer solutions.</td>
			<tr>
				<td nowrap><bean:message
						key="techCapability.label.itCapability" /></td>
				<td><html:select property="itCapability" multiple="true">
						<html:option value="1">Placeholder1</html:option>
						<html:option value="2">Placeholder2</html:option>
						<html:option value="3">Placeholder3</html:option>
						<html:option value="4">Placeholder4</html:option>
					</html:select></td>
				<td class="error"><html:errors property="itCapability"></html:errors></td>
			</tr>
			<tr>
				<td nowrap><bean:message
						key="techCapability.label.otherCapabilities" /></td>
				<td><html:text property="otherCapabilities" maxlength="50" /></td>
				<td class="error"><html:errors property="otherCapabilities"></html:errors></td>
			</tr>
			<tr>
				<td nowrap><bean:message
						key="techCapability.label.techThemes" /></td>
				<td><html:select property="techThemes" multiple="true">
						<html:option value="1">Placeholder1</html:option>
						<html:option value="2">Placeholder2</html:option>
						<html:option value="3">Placeholder3</html:option>
						<html:option value="4">Placeholder4</html:option>
					</html:select></td>
				<td class="error"><html:errors property="techThemes"></html:errors></td>
			</tr>
			<tr>
				<td colspan="3" class="submitRow"><span class="pushButton">
						<span> <html:submit>Save & Next
				</html:submit>
					</span>
				</span></td>
			</tr>
			</tbody>
		</table>
	</html:form>
</body>
</html>
