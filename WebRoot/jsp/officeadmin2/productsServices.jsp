<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<h2>Types of Business</h2>
<body>
<html:form action="/productServices.do?actionType" method="post">
	<table cellpadding="3" cellspacing="0" border="1" class="formContainer">
		<tbody>

			<tr>
				<td width="211">
				<h3>Types of Business</h3>
				</td>
				<td>Please indicate your Business Type</td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Please select
				values if you do business into these areas </label></td>
				<td width="588"><html:select property="man" multiple="16"
					size="10">
					<html:option value="Manufacturing">Manufacturing</html:option>
					<html:option value="Business/Consultancy/Professional Services">Business/Consultancy/Professional Services</html:option>
					<html:option value="Contruction">Contruction</html:option>
					<html:option value="Educational/Cultural Services">Educational/Cultural Services</html:option>
					<html:option value="Facility Management">Facility Management</html:option>
					<html:option value="Financial Management">Financial Management</html:option>
					<html:option value="Food Services/Catering Services">Food Services/Catering Services</html:option>
					<html:option value="Health/Social Care">Health/Social Care</html:option>
					<html:option value="Information Communication Technology">Information Communication Technology</html:option>
					<html:option value="Logistic & Transportation">Logistic & Transportation</html:option>
					<html:option value="Marketing/Media/Print">Marketing/Media/Print</html:option>
					<html:option value="Real Estate/Property Mangement">Real Estate/Property Mangement</html:option>
					<html:option value="Recuriting Services">Recuriting Services</html:option>
					<html:option value="Retail/Wholesale">Retail/Wholesale</html:option>
					<html:option value="Social Care">Socail Care</html:option>
					<html:option value="Utilites">Utilites</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td align="center">Others</td>
				<td><html:text property="other1"></html:text></td>
			</tr>

			<tr>
				<td width="211">
				<h3>Product/Service Category</h3>
				</td>
				<td>Your Business would supply within</td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Please select
				values if you do business into these areas </label></td>
				<td width="588"><html:select property="biz" multiple="8"
					size="6">
					<html:option value="Facilities,Office Supplies & Construction">Facilities,Office Supplies & Construction</html:option>
					<html:option value="Hardware">Hardware</html:option>
					<html:option value="Logistic & Transportation">Logistic & Transportation</html:option>
					<html:option value="Marketing,Print,Media">Marketing,Print,Media</html:option>
					<html:option value="Recruitment & HR">Recruitment & HR</html:option>
					<html:option value="Software">Software</html:option>
					<html:option value="Specialist Consultancy">Specialist Consultancy</html:option>
					<html:option value="Telecoms & Netoworking">Telecoms & Netoworking</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td align="center">Others</td>
				<td><html:text property="others2"></html:text></td>
			</tr>


			<tr>
				<td width="211">
				<h3>Product Categories</h3>
				</td>
				<td>Please indicate where your products best fit</td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Please select
				values if you do business into these areas </label></td>
				<td width="588"><html:select property="construction" multiple="20"
					size="10">
					<html:option value="Building Products & Materials">Building Products & Materials</html:option>
					<html:option value="Computer Desktops">Computer Desktops</html:option>
					<html:option value="Electronic Equipment">Electronic Equipment</html:option>
					<html:option value="Environment Prodcuts">Environment Prodcuts</html:option>
					<html:option value="Furniture & Office Equipment">Furniture & Office Equipment</html:option>
					<html:option value="General Office Supplies">General Office Supplies</html:option>
					<html:option value="Health & Safety Equipment">Health & Safety Equipment</html:option>
					<html:option
						value="IT Accessories,power supplies , media storage,etc">IT Accessories,power supplies , media storage,etc</html:option>
					<html:option value="Laptops,Notebooks">Laptops,Notebooks</html:option>
					<html:option value="Mainframe Servers">Mainframe Servers</html:option>
					<html:option value="Monitors">Monitors</html:option>
					<html:option value="Mobile Technology">Mobile Technology</html:option>
					<html:option value="Network Cabling & technology">Network Cabling & technology</html:option>
					<html:option value="Packaging Material">Packaging Material</html:option>
					<html:option value="Photocopiers">Photocopiers</html:option>
					<html:option value="Printer Inks,Toner,Paper">Printer Inks,Toner,Paper</html:option>
					<html:option value="Security">Security</html:option>
					<html:option value="Scanners">Scanners</html:option>
					<html:option value="Software Packages & Applications">Software Packages & Applications</html:option>
					<html:option value="Touchpads,Palm Technology">Touchpads,Palm Technology</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td align="center">Others</td>
				<td><html:text property="others3"></html:text></td>
			</tr>

			<tr>
				<td width="211">
				<h3>Service Categories</h3>
				</td>
				<td>Please indicate where your services best fit</td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Please select
				values if you do business into these areas </label></td>
				<td width="588"><html:select property="construction" multiple="22"
					size="10">
					<html:option value="Asset recovery">Asset recovery</html:option>
					<html:option value="Consultancy-Specialist IT & Networking">Consultancy-Specialist IT & Networking</html:option>
					<html:option value="Consultancy-Media & Communications">Consultancy-Media & Communications</html:option>
					<html:option
						value="Consultancy-Facilities,Office Mangement,Risk Management">Consultancy-Facilities,Office Mangement,Risk Management</html:option>
					<html:option value="Courier Services">Courier Services</html:option>
					<html:option value="Facility Mangement & Buliding Services">Facility Mangement & Buliding Services</html:option>
					<html:option value="Financial Services">Financial Services</html:option>
					<html:option
						value="Healty & Safety Servicse,specialist consultancy,Training">Healty & Safety Servicse,specialist consultancy,Training</html:option>
					<html:option value="Human Resource Services & General Recruitment">Human Resource Services & General Recruitment</html:option>
					<html:option value="Freight,Warehousing & Logistic Management">Freight,Warehousing & Logistic Management</html:option>
					<html:option value="Media,Marketing & prodcut Design Services">Media,Marketing & prodcut Design Services</html:option>
					<html:option value="Network & Cabeling Services	">Network & Cabeling Services</html:option>
					<html:option value="Printing Services">Printing Services</html:option>
					<html:option value="Photographic Services">Photographic Services</html:option>
					<html:option value="Re-seller of Technology Products & Services">Re-seller of Technology Products & Services</html:option>
					<html:option value="Security Management & Services">Security Management & Services</html:option>
					<html:option value="Software Development , R&D">Software Support & Maintainance</html:option>
					<html:option
						value="Technology Services - Leading Edge or Highly Specialist">Technology Services - Leading Edge or Highly Specialist</html:option>
					<html:option value="Training - Specilist IT & Networking">Training - Specilist IT & Networking	</html:option>
					<html:option value="Training-General Office ,etc">Training-General Office ,etc</html:option>
					<html:option
						value="Travel Services (including car,hotel,flighs,train, etc)">Travel Services (including car,hotel,flighs,train, etc)</html:option>
					<html:option value="Utility services (power,light,heat,etc)">Utility services (power,light,heat,etc)</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td align="center">Others</td>
				<td><html:text property="others4"></html:text></td>
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
