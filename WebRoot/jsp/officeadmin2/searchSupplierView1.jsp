<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<h2>Search Supplier Details</h2>
<body>
<html:form action="/searchSupplier.do?actionType" method="post">
	<table cellpadding="3" cellspacing="0" border="0" class="formContainer">
		<tbody>

			<tr>
				<td nowrap="nowrap"><label>Company Name</label></td>
				<td><html:text property="cname" maxlength="100" /></td>
			</tr>
			<tr>
				<td nowrap="nowrap"><label>Duns Number</label></td>
				<td><html:text property="dunsnumber" maxlength="100" /></td>
			</tr>
			<tr>
				<td nowrap="nowrap"><label>Parent Company Name</label></td>
				<td><html:text property="parentComName" maxlength="100" /></td>
			</tr>
			<tr>
				<td nowrap="nowrap"><label>Parent Company Name</label></td>
				<td><html:text property="parentComName" maxlength="100" /></td>
			</tr>
			<tr>
				<td nowrap="nowrap"><label>Other types of Biz</label></td>
				<td><html:text property="parentComName" maxlength="100" /></td>
			</tr>
			<tr>
				<td nowrap="nowrap"><label>IT capability </label></td>
				<td><html:text property="parentComName" maxlength="100" /></td>
			</tr>
			<tr>
				<td nowrap="nowrap"><label>Other capabilities</label></td>
				<td><html:text property="parentComName" maxlength="100" /></td>
			</tr>
			<tr>
				<td nowrap="nowrap"><label>Supplier Number</label></td>
				<td><html:text property="parentComName" maxlength="100" /></td>
			</tr>
			<tr>
				<td nowrap="nowrap"><label>Current or previous contract numbers</label></td>
				<td><html:text property="parentComName" maxlength="100" /></td>
			</tr>
			<tr>
				<td nowrap="nowrap"><label>A SME</label></td>
				<td><html:checkbox property="sme"></html:checkbox></td>
			</tr>
			<tr>
				<td nowrap="nowrap"><label>Country ownership is registred</label></td>
				<td><html:checkbox property="ownership"></html:checkbox></td>
			</tr>
			<tr>
				<td nowrap="nowrap"><label>Minority Organisation</label></td>
				<td><html:checkbox property="minority"></html:checkbox></td>
			</tr>
			<tr>
				<td nowrap="nowrap"><label># of Emplooyees </label></td>
				<td><html:checkbox property="minority"></html:checkbox></td>
			</tr>
				<tr>
				<td nowrap="nowrap"><label>Principal products</label></td>
				<td><html:checkbox property="minority"></html:checkbox></td>
			</tr>
				<tr>
				<td nowrap="nowrap"><label>Principal services</label></td>
				<td><html:checkbox property="minority"></html:checkbox></td>
			</tr>
				<tr>
				<td nowrap="nowrap"><label>Markets served</label></td>
				<td><html:checkbox property="minority"></html:checkbox></td>
			</tr>
				<tr>
				<td nowrap="nowrap"><label># of Emplooyees </label></td>
				<td><html:checkbox property="minority"></html:checkbox></td>
			</tr>
			<tr>
				<td colspan="2" class="submitRow"><span class="pushButton">
				<span> <html:submit>Search
				</html:submit> </span> </span></td>

			</tr>
		</tbody>
	</table>
	<logic:present name="data">
		<div class="reportContainer">
		<table cellspacing="1" cellpadding="2" border="0" class="report"
			width="400px">
			<thead>
				<tr>
					<th width="2">Authorised Signature</th>
					<th width="2">Organisation</th>
					<th width="2">Contact Name</th>
					<th width="2">Contact Title</th>
					<th width="2">Email Address</th>
					<th width="2">Phone Number</th>
				</tr>
			</thead>
			<tbody>
				<logic:iterate id="element" name="data" scope="request">
					<tr class="row1">
						<td width="2"><bean:write name="element" property="autoSign" /></td>
						<td width="2"><bean:write name="element" property="organization" /></td>
						<td width="2"><bean:write name="element" property="contactName" /></td>
						<td width="2"><bean:write name="element" property="contactTitle" /></td>
						<td width="2"><bean:write name="element" property="emailAdress" /></td>
						<td width="2"><bean:write name="element" property="phoneNumber" /></td>
					</tr>
				</logic:iterate>
				<logic:empty name="data">
					<table cellspacing="1" cellpadding="2" border="1" align="center"
						width="400px">
						<thead>
							<tr class="row1">
								<td align="center">No Data Found</td>
							</tr>
						</thead>
					</table>
				</logic:empty>
			</tbody>
		</table>
		</div>
	</logic:present>



</html:form>
</body>
</html>
