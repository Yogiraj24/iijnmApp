<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<h2>Contacts & References</h2>
<body>
<html:form action="/contactReferencesInfoSubmit.do?actionType" method="post">
	<table cellpadding="3" cellspacing="0" border="1" class="formContainer">
		<tbody>

			<tr>
				<td colspan="2">
				<h3>Current HP Supplier</h3>
				</td>
				
			</tr>
			<tr>
				<td width="211" align="center"><label>This
				company/organisation currently trades with HP</label></td>
				<td width="588"><html:select property="uk">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Please list below any
				current contracts you have with HP</label></td>
			</tr>
		
			<tr>
				<th>Contract Title</th>
				<th>Contract Ref</th>
				<th>Expiry Date</th>
				<th>HP Contract Manger</th>
			</tr>
		
		
			<tr class="row1">
				<td align="center"><html:text property="uk" /></td>
				<td align="center"><html:text property="uk" /></td>
				<td align="center"><html:text property="uk" /></td>
				<td align="center"><html:text property="uk" /></td>

			</tr>
		

		<tr>
			<td colspan="2">
			<h3>Hewlett Packard References</h3>
			</td>
		</tr>
		<tr>
		<td nowrap="nowrap"><h3>HP Reference #1</h3></td>
		</tr>
		
		<tr>
			<td nowrap="nowrap"><label>HP Division Name</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>HP Contact Name</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>HP Office/Site location</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Last meeting date</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Approximate service period</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr> 	
		<tr>
		<td nowrap="nowrap"><h3>HP Reference #1</h3></td>
		</tr>
		
		<tr>
			<td nowrap="nowrap"><label>HP Division Name</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>HP Contact Name</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>HP Office/Site location</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Last meeting date</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Approximate service period</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr> 	
		<tr>
		<td nowrap="nowrap"><h3>HP Reference #1</h3></td>
		</tr>
		
		<tr>
			<td nowrap="nowrap"><label>HP Division Name</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>HP Contact Name</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>HP Office/Site location</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Last meeting date</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Approximate service period</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr> 	
		
		<tr>
			<td colspan="2">
			<h3>Other References</h3>
			</td>
		</tr>
		<tr>
		<td nowrap="nowrap"><label>List the compnay/organisation's three main customers (other than HP)</label></td>
		</tr>
		<tr>
		
		<td nowrap="nowrap"><h3>Customer #1</h3></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Organisation Name</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Contact Name</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Email Address</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Phone Number</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
		
		<td nowrap="nowrap"><h3>Customer #2</h3></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Organisation Name</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Contact Name</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Email Address</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Phone Number</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
		
		<td nowrap="nowrap"><h3>Customer #3</h3></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Organisation Name</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Contact Name</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Email Address</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
		</tr>
		<tr>
			<td nowrap="nowrap"><label>Phone Number</label></td>
			<td><html:text property="uk" maxlength="100" /></td>
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
