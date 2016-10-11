<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<h2>Market Info</h2>
<h3>Specify service locations</h3>
<body>
<html:form action="/marketsInfoSubmit.do?actionType" method="post">
	<table cellpadding="3" cellspacing="0" border="1" class="formContainer">
		<tbody>

			<tr>
				<td width="211" align="center"><label>Please select values if you supply into these
				Locations</label></td>
				<td width="588"><html:select property="uk" multiple="12" size="10">
					<html:option value="England">England</html:option>
					<html:option value="Northan IrelandN">Northan Ireland</html:option>
					<html:option value="Scotland">Scotland</html:option>
					<html:option value="Wales">Wales</html:option>
					<html:option value="Africa">Africa</html:option>
					<html:option value="Asia Pacific">Asia Pacific</html:option>
					<html:option value="Australia">Australia</html:option>
					<html:option value="Canada">Canada</html:option>
					<html:option value="Europe">Europe</html:option>
					<html:option value="Latin America">Latin America</html:option>
					<html:option value="Mexico">Mexico</html:option>
					<html:option value="United States">United States</html:option>
					
				</html:select></td>
			</tr>
			<tr>
				<td width="211">
				<h3>Markets</h3>
				</td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Please select values if you supply into these
				Markets</label></td>
				<td width="588"><html:select property="uk" multiple="19" size="10">
					<html:option value="Automotive">Automotive</html:option>
					<html:option value="Banking">Banking</html:option>
					<html:option value="Construction">Construction</html:option>
					<html:option value="Education">Education</html:option>
					<html:option value="Financial Services">Financial Services</html:option>
					<html:option value="General Manufacturing & Engg.">General Manufacturing & Engg.</html:option>
					<html:option value="Healthcare & Social care">Healthcare & Social care</html:option>
					<html:option value="Insurance">Insurance</html:option>
					<html:option value="Information Technologies">Information Technologies</html:option>
					<html:option value="Marketing and Communications">Marketing and Communications</html:option>
					<html:option value="Petrochemical">Petrochemical</html:option>
					<html:option value="Printing & Pubslishing">Printing & Pubslishing</html:option>
					<html:option value="Real Estate">Real Estate</html:option>
					<html:option value="Telecom">Telecom</html:option>
					<html:option value="Transport & Logistic">Transport & Logistic</html:option>
					<html:option value="Utilities">Utilities</html:option>
					<html:option value="UK Public Sector">UK Public Sector</html:option>
					<html:option value="UK Local Government">UK Local Government</html:option>
					<html:option value="UK Defence & NATO">UK Defence & NATO</html:option>
				</html:select></td>
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
