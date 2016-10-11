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
	<html:form action="companyInfoSubmission.do">
		<table cellpadding="3" cellspacing="0" border="0"
			class="formContainer">
			<tbody>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.companyName" /></td>
					<td><html:text property="companyName" maxlength="50" /></td>
					<td class="error"><html:errors property="companyName"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.isSME" /></td>
					<td><html:checkbox property="isSME" /></td>
					<td class="error"><html:errors property="isSME"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.registration" /></td>
					<td><html:select property="registration">
							<html:option value="1">Placeholder1</html:option>
							<html:option value="2">Placeholder2</html:option>
							<html:option value="3">Placeholder3</html:option>
							<html:option value="4">Placeholder4</html:option>
						</html:select></td>
					<td class="error"><html:errors property="registration"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.address1" /></td>
					<td><html:text property="address1" maxlength="50" /></td>
					<td class="error"><html:errors property="address1"></html:errors></td>
				</tr>
				<tr>
					<td nowrap><bean:message key="companyInfo.label.address2" /></td>
					<td><html:text property="address2" maxlength="50" /></td>
					<td class="error"><html:errors property="address2"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.city" /></td>
					<td><html:text property="city" maxlength="50" /></td>
					<td class="error"><html:errors property="city"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.state" /></td>
					<td><html:text property="state" maxlength="50" /></td>
					<td class="error"><html:errors property="state"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.country" /></td>
					<td><html:text property="country" maxlength="50" /></td>
					<td class="error"><html:errors property="country"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.postalCode" /></td>
					<td><html:text property="postalCode" maxlength="50" /></td>
					<td class="error"><html:errors property="postalCode"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.website" /></td>
					<td><html:text property="website" maxlength="50" /></td>
					<td class="error"><html:errors property="website"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.contactName" /></td>
					<td><html:text property="contactName" maxlength="50" /></td>
					<td class="error"><html:errors property="contactName"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.contactTitle" /></td>
					<td><html:text property="contactTitle" maxlength="50" /></td>
					<td class="error"><html:errors property="contactTitle"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.contactPhone" /></td>
					<td><html:text property="contactPhone" maxlength="50" /></td>
					<td class="error"><html:errors property="contactPhone"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.contactEmail" /></td>
					<td><html:text property="contactEmail" maxlength="50" /></td>
					<td class="error"><html:errors property="contactEmail"></html:errors></td>
				</tr>
				<tr>
					<td nowrap><bean:message key="companyInfo.label.DUNS" /></td>
					<td><html:text property="DUNS" maxlength="50" /></td>
					<td class="error"><html:errors property="DUNS"></html:errors></td>
				</tr>
				<tr>
					<td nowrap><bean:message
							key="companyInfo.label.registrationNo" /></td>
					<td><html:text property="registrationNo" maxlength="50" /></td>
					<td class="error"><html:errors property="registrationNo"></html:errors></td>
				</tr>
				<tr>
					<td colspan="3">The UK government requires HP from time to
						time to supply diversity information about its supply chain. For
						the purpose of this survey, HP considers a company to be diverse
						if they have a physical base in the UK and are at least 51% owned,
						managed and controlled by one or more under-represented groups.
						Under-represented groups include ethnic minorities,*females and
						individuals with a disability.<br />
					<br /> <i> *Ethnic minorities include Asian
							(Bangladeshi, Indian, Pakistani or Asian Other), Black (Black
							African, Black Caribbean or Black Other), Chinese or other ethnic
							group, Mixed (White and Black Caribbean, White and Black African,
							White and Asian, any other mixed background). </i>
					</td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.diversityProg" /></td>
					<td><html:checkbox property="diversityProg" /></td>
					<td class="error"><html:errors property="diversityProg"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.diverse" /></td>
					<td><html:checkbox property="diverse" /></td>
					<td class="error"><html:errors property="diverse"></html:errors></td>
				</tr>
				<tr>
					<td nowrap><bean:message
							key="companyInfo.label.underGroup" /></td>
					<td><html:text property="underGroup" maxlength="50" /></td>
					<td class="error"><html:errors property="underGroup"></html:errors></td>
				</tr>
				<tr>
					<td colspan="3">Are you registered with any Minority
						Organizations? Please identify or type in the box provided, if
						applicable (this certification does not provide qualification as
						SME status)</td>
				</tr>
				<tr>
					<td nowrap><bean:message
							key="companyInfo.label.minorityOrgs" /></td>
					<td><html:select property="minorityOrgs" multiple="true">
							<html:option value="1">Placeholder1</html:option>
							<html:option value="2">Placeholder2</html:option>
							<html:option value="3">Placeholder3</html:option>
							<html:option value="4">Placeholder4</html:option>
						</html:select></td>
					<td class="error"><html:errors property="minorityOrgs"></html:errors></td>
				</tr>
				<tr>
					<td nowrap><bean:message
							key="companyInfo.label.minorityOther" /></td>
					<td><html:text property="minorityOther" maxlength="50" /></td>
					<td class="error"><html:errors property="minorityOther"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.yearEst" /></td>
					<td><html:text property="yearEst" maxlength="50" /></td>
					<td class="error"><html:errors property="yearEst"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.numEmployees" /></td>
					<td><html:select property="numEmployees">
							<html:option value="1">Placeholder1</html:option>
							<html:option value="2">Placeholder2</html:option>
							<html:option value="3">Placeholder3</html:option>
							<html:option value="4">Placeholder4</html:option>
						</html:select></td>
					<td class="error"><html:errors property="numEmployees"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.salesTurnover" /></td>
					<td><html:text property="salesTurnover" maxlength="50" /></td>
					<td class="error"><html:errors property="salesTurnover"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.netAssets" /></td>
					<td><html:text property="netAssets" maxlength="50" /></td>
					<td class="error"><html:errors property="netAssets"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.legalStructure" /></td>
					<td><html:select property="legalStructure">
							<html:option value="1">Placeholder1</html:option>
							<html:option value="2">Placeholder2</html:option>
							<html:option value="3">Placeholder3</html:option>
							<html:option value="4">Placeholder4</html:option>
						</html:select></td>
					<td class="error"><html:errors property="legalStructure"></html:errors></td>
				</tr>
				<tr>
					<td nowrap class="required"><bean:message
							key="companyInfo.label.parentCompany" /></td>
					<td><html:text property="parentCompany" maxlength="50" /></td>
					<td class="error"><html:errors property="parentCompany"></html:errors></td>
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
