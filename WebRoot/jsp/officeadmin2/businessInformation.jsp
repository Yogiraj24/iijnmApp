<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<h2>Business Information</h2>
<body>
<html:form action="/bizInfoAction.do?actionType" method="post">
	<table cellpadding="3" cellspacing="0" border="1" class="formContainer">
		<tbody>

			<tr>

				<td width="211" align="center"><label>Please select
				values if you do business into these areas </label></td>
				<td width="211"><html:select property="uk" multiple="3"
					size="3">
					<html:option value="UK">UK</html:option>
					<html:option value="EEC">EEC</html:option>
					<html:option value="Non EEC">Non EEC</html:option>
				</html:select></td>
			</tr>


			<tr>
				<td colspan="2">
				<h3>For Goverment Reporting Purpose</h3>
				</td>
			</tr>
			<tr>
				<td class="none" colspan="2">
				<table>
					<tr>
						<td align="left">What % of the ownership is
						held by registered disbaled/socially disadvanaged individuals
						/community groups:<html:text property="disabled_per" /></td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td class="none" colspan="2">
				<table>
					<tr>
						<td align="">What % of ownership is held by ethnic
						minority persons:<html:text property="women_per" /></td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td class="none" colspan="2">
				<table>
					<tr>
						<td align="center">What % of ownership held by women:<html:text property="women_per" /></td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td colspan="2">
				<h3>Contact Information</h3>
				</td>
			</tr>
			<tr>
						<td align="center">Company Name</td>
				        <td><html:text property="company_name" /></td>
			</tr>

			<tr>
				<td width="211" align="center"><label>Address Line1</label></td>
				<td width="211"><html:textarea property="address1" /></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Address Line2</label></td>
				<td width="211"><html:textarea property="address2" /></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>City</label></td>
				<td width="211"><html:text property="city" /></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Country</label></td>
				<td width="211"><html:text property="country" /></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Postal Code</label></td>
				<td width="211"><html:text property="postalCode" /></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Web Site</label></td>
				<td width="211"><html:text property="webSite" /></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Contact Name</label></td>
				<td width="211"><html:text property="contactName" /></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Title</label></td>
				<td width="211"><html:text property="title" /></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Phone</label></td>
				<td width="211"><html:text property="phone" /></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Email</label></td>
				<td width="211"><html:text property="email" /></td>
			</tr>
			<tr>
				<td colspan="2">
				<h3>Company/Organization Identifier</h3>
				</td>
			</tr>
			<tr>
				<td colspan="2">Dun & Bradstreet's Data Universal Numbering
				System number , if Known</td>

			</tr>
			<tr>
				<td width="211" align="center"><label>DUNs number (9
				digits)</label></td>
				<td width="211"><html:text property="dun" /></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Company
				Registration Number</label></td>
				<td width="211"><html:text property="regNumber" /></td>
			</tr>
			<tr>
				<td colspan="2">
				<h3>Academic/Charity Institutions</h3>
				</td>
			</tr>
			<tr>
				<td width="211"><label>Academic/Charity </label></td>
				<td width="211"><label>Name & Registration Number(if
				aplicable)</label></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>The entity I
				represent is an academic institution</label></td>
				<td width="211"><html:text property="academic" /></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>The entity I
				represent is a registered charity</label></td>
				<td width="211"><html:text property="charity" /></td>
			</tr>
			<tr>
				<td colspan="2">
				<h3>General Business Information</h3>
				</td>
			</tr>
			<tr>
				<td width="211" align="center"><label></label></td>
				<td width="211"><label>Complete all fields(if
				aplicable)</label></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Year your
				organization is established</label></td>
				<td width="211"><html:text property="establishedYear" /></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>For the most
				recent financial accounts , please prvide total annual gross sales</label></td>
				<td width="211"><html:text property="annualGross" /></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>For the most
				recent financial accounts , please prvide Net worth (Balance Sheet
				total asset less total liablities)</label></td>
				<td width="211"><html:text property="netWorth" /></td>
			</tr>
			<tr>
				<td colspan="2">
				<h3>Size of organisation</h3>
				</td>
			</tr>
			<tr>
				<td colspan="2">
				<h3>(Classifiation are defined by Goverment agencies by
				turnover,net worth and employee numbers)</h3>
				</td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Please select values if you supply into these
				Locations</label></td>
				<td width="211"><html:select property="uk" >
				    <html:option value="select">Select</html:option>
					<html:option value="single">Single employee company</html:option>
					<html:option value="MicroBusiness">MicroBusiness < 10 employees</html:option>
					<html:option value="Small">Small Business < 50 employees</html:option>
					<html:option value="Medium">Medium Business < 250 employees</html:option>
					<html:option value="MTL">Medium to Large Business 251 to 500 employees </html:option>
					<html:option value="Large">Large Business > 500 employees</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211"><h3>Trading Information</h3></td>
			</tr>
			
			<tr>
				<td width="211" align="center"><label>Name & Registration Number(if
				aplicable)</label></td>
				<td width="211"><html:select property="profit" multiple="3" size="3">
					<html:option value="profitable">This company/organization has been profitable for the past 3 years</html:option>
					<html:option value="tradesElectronically">This company/organization trades electronically</html:option>
					<html:option value="broadband">This company/organisation has broadband intenet connection</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211"><label>
				<h3>Business Structure</h3></td>

			</tr>
			<tr>
				<td width="211"><label>
				<h3>Type of Organisation</h3></td>
				<td width="211"><label>Please confirm Type</label></td>
				</td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Type of Organisation
				</label></td>
				<td width="211"><html:select property="registeredCharity" multiple="10" size="10">
					<html:option value="Public Limited Corporation">Public Limited Corporation</html:option>
					<html:option value="Limited Company">Limited Company</html:option>
					<html:option value="Subsidiary or Division of Parent Company">Subsidiary or Division of Parent Company</html:option>
					<html:option value="Franchise">Franchise</html:option>
					<html:option value="Joint Venture">Joint Venture</html:option>
					<html:option value="General Partnership">General Partnership</html:option>
					<html:option value="Limited Partnership">Limited Partnership</html:option>
					<html:option value="Sole Propritorship">Sole Propritorship</html:option>
					<html:option value="Registered Charity">Registered Charity</html:option>
					<html:option value="Academic Institution">Academic Institution</html:option>
					
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
