<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<h2>Opportunities Info</h2>
<h3>This is your opportunity to inform HP of your capability
				and potential business opportunities that exist by working with you</h3>
<body>
<html:form action="/opportunitiesInfoSubmit.do?actionType" method="post">
	<table cellpadding="3" cellspacing="0" border="1" class="formContainer">
		<tbody>	
			<tr>
				<td width="412">
				What unique products or services does this
				company/organisation offer that differenciate it from its
				competitors ? Also include any strong points ,attributes,competitive
				advantages or additional information of which HP should be aware
			  </td>
				<td width="200"><html:textarea property="first" >
			  </html:textarea></td>
			</tr>
			<tr>
				<td width="412">
				If applicable , please explain how your portfolio of
				products/services complement HP's portfolio range to market
			  </td>
				<td width="200"><html:textarea property="second">
			  </html:textarea></td>
			</tr>
			<tr>
				<td width="412">
				Please give details of any government funding or awards you
				receive or goverment sponsored business schemes/groups you belong
				to.Please also list any details of certifications you have
				recognising your minority shareholding or SME status
			  </td>
				<td width="200"><html:textarea property="thired">
			  </html:textarea></td>
			</tr>
			<tr>
				<td width="412">
				Please enter below any 'Key Words' you would like any
				search facility to include for HP managers to find your details
			  </td>
				<td width="200"><html:textarea property="fourth">
			  </html:textarea></td>
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
