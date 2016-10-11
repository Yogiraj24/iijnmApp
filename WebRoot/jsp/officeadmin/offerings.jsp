<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">

<html>
<!-- PLACEHOLDER CSS REF, REQUIRED TO INDICATE REQUIRED FIELDS -->
<head>
<link rel="stylesheet" type="text/css"
	href="http://localhost:8080/SupplierApp/css/ltr/common.css" />
</head>
<h2>What does your business have to offer HP?</h2>
<body>
	<html:form action="/offeringsSubmission" method="post">
		<table cellpadding="3" cellspacing="0" border="1"
			class="formContainer">
			<tbody>
				<tr>
					<td nowrap><bean:message key="offerings.label.solutionTitle" /></td>
					<td><html:text property="solutionTitle" maxlength="50" /></td>
					<td class="error"><html:errors property="solutionTitle"></html:errors></td>
				</tr>
				<tr>
					<td nowrap><bean:message key="offerings.label.docURL" /></td>
					<td><html:text property="docURL" maxlength="50" /></td>
					<td class="error"><html:errors property="docURL"></html:errors></td>
				</tr>
				<tr>
					<td nowrap><bean:message
							key="offerings.label.barriersOvercomed" /></td>
					<td><html:text property="barriersOvercomed" maxlength="50" /></td>
					<td class="error"><html:errors property="barriersOvercomed"></html:errors></td>
				</tr>
				<tr>
					<td nowrap><bean:message
							key="offerings.label.businessOutcomes" /></td>
					<td><html:text property="businessOutcomes" maxlength="50" /></td>
					<td class="error"><html:errors property="businessOutcomes"></html:errors></td>
				</tr>
				<tr>
					<td nowrap><bean:message key="offerings.label.scenarios" /></td>
					<td><html:text property="scenarios" maxlength="50" /></td>
					<td class="error"><html:errors property="scenarios"></html:errors></td>
				</tr>
				<tr>
					<td nowrap><bean:message key="offerings.label.whoBenefits" /></td>
					<td><html:text property="whoBenefits" maxlength="50" /></td>
					<td class="error"><html:errors property="whoBenefits"></html:errors></td>
				</tr>
				<tr>
					<td nowrap><bean:message key="offerings.label.addlSolutions" /></td>
					<td><html:checkbox property="addlSolutions" /></td>
					<td class="error"><html:errors property="addlSolutions"></html:errors></td>
				</tr>
				<tr>
					<td colspan="3" class="submitRow"><span class="pushButton">
							<span> <html:submit>
									<bean:message key="common.label.submit" />
								</html:submit>
						</span>
					</span></td>
				</tr>
			</tbody>
		</table>
	</html:form>
</body>
</html>
