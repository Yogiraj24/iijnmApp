<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<h2>Types of Business</h2>
<body>
<html:form action="/typesOfBizAction.do?actionType" method="post">
	<table cellpadding="3" cellspacing="0" border="1" class="formContainer">
		<tbody>

			<tr>
				<td width="211">
				<h3>Types of Business</h3>
				</td>
				<td width="588">
				<h3>Please Indicate your Business Type</h3>
				</td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Manufacturing</label></td>
				<td width="588"><html:select property="man">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Business/Consultancy/Professional Services</label></td>
				<td width="588"><html:select property="biz">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Contruction</label></td>
				<td><html:select property="construction">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Educational/Cultural Services</label></td>
				<td><html:select property="edu">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Facility Management</label></td>
				<td><html:select property="facility">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Financial Management</label></td>
				<td><html:select property="financial">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Food Services/Catering Services</label></td>
				<td><html:select property="food">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			
			<tr>
				<td width="211" align="center"><label>Health/Social Care</label></td>
				<td><html:select property="health">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Information Communication Technology</label></td>
				<td><html:select property="itc">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Logistic & Transportation</label></td>
				<td><html:select property="logistic">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Marketing/Media/Print</label></td>
				<td><html:select property="marketing">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Real Estate/Property Mangement</label></td>
				<td><html:select property="realEstate">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Recuriting Servics</label></td>
				<td><html:select property="recruiting">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Retail/Wholesale</label></td>
				<td><html:select property="retail">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Socail Care</label></td>
				<td><html:select property="socialCare">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			
			<tr>
				<td width="211" align="center"><label>Utilites</label></td>
				<td><html:select property="utilities">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			
			<tr>
				<td width="211" align="center"><label>Other(Please specify)</label></td>
				<td><html:select property="other1">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211">
				<h3>Products/Service Category</h3>
				</td>
				<td width="588">
				<h3>Please indicate the appropriate categories your products and/or service would fit under</h3>
				</td>
			</tr>
			<tr>
				<td width="211">
				<h3>HP Categories</h3>
				</td>
				<td width="588">
				<h3>Your Business would supply within</h3>
				</td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Facilities,Office Supplies & Construction</label></td>
				<td><html:select property="facilitiesOffice">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Hardware</label></td>
				<td><html:select property="hardware">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Logistic & Transportation</label></td>
				<td><html:select property="logistic">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Marketing,Print,Media</label></td>
				<td><html:select property="marketingPrint">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Recruitment & HR </label></td>
				<td><html:select property="rechr">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Software</label></td>
				<td><html:select property="software">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Specialist Consultancy</label></td>
				<td><html:select property="spcialist">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Telecoms & Netoworking</label></td>
				<td><html:select property="telecom">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Others (Please Specify)</label></td>
				<td><html:select property="others2">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211">
				<h3>Principal products or services </h3>
				</td>
				<td width="588">
				<h3>Your Business would supply within</h3>
				</td>
			</tr>
			<tr>
				<td colspan="2">
				What are the principal prodcuts or services this company/organization has to offer to HP
				</td>
			</tr>
			<tr>
				<td colspan="2">
				Select no more than three from the Product Group ist and three from the Services list
				</td>
			</tr>
			<tr>
				<td width="211">
				<h3>Product Categories</h3>
				</td>
				<td width="588">
				<h3>Please indicate where your products best fit</h3>
				</td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Building Products & Materials</label></td>
				<td><html:select property="bizProducts">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Computer Desktops</label></td>
				<td><html:select property="comDesktop">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Electronic Equipment</label></td>
				<td><html:select property="electronic">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Environment Prodcuts</label></td>
				<td><html:select property="environmental">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Furniture	& Office Equipment</label></td>
				<td><html:select property="furniture">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>General Office Supplies</label></td>
				<td><html:select property="generalOffice">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Health & Safety Equipment</label></td>
				<td><html:select property="healthSafety">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>IT Accessories,power supplies , media storage,etc</label></td>
				<td><html:select property="itAcess">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Laptops,Notebooks</label></td>
				<td><html:select property="laptop">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Mainframe Servers</label></td>
				<td><html:select property="mainframe">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Monitors</label></td>
				<td><html:select property="monitor">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Mobile Technology</label></td>
				<td><html:select property="mobile">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Network Cabling & technology</label></td>
				<td><html:select property="networkCabeling">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Packagin Material</label></td>
				<td><html:select property="package">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Photocopiers</label></td>
				<td><html:select property="photocopiers">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Printer Inks,Toner,Paper</label></td>
				<td><html:select property="noneec">
					<html:option value="select">prinerInk</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Security</label></td>
				<td><html:select property="security">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Scanners</label></td>
				<td><html:select property="scanners">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Software Packages & Applications</label></td>
				<td><html:select property="softwarePkg">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Touchpads,Palm Technology</label></td>
				<td><html:select property="touchpad">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Others (Please Specify)</label></td>
				<td><html:select property="others3">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211">
				<h3>Service Categories</h3>
				</td>
				<td width="588">
				<h3>Please indicate where your services best fit</h3>
				</td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Asset recovery</label></td>
				<td><html:select property="assetRecovery">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Consultancy-Specialist IT & Networking</label></td>
				<td><html:select property="conIT">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Consultancy-Media & Communications</label></td>
				<td><html:select property="conMedia">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Consultancy-Facilities,Office Mangement,Risk Management</label></td>
				<td><html:select property="conFacility">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Courier Services</label></td>
				<td><html:select property="courier">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Facility Mangement & Buliding Services</label></td>
				<td><html:select property="facilityMgmt">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Financial Services</label></td>
				<td><html:select property="financialService">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Healty & Safety Servicse,specialist consultancy,Training</label></td>
				<td><html:select property="healthSafety">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Human Resource Services & General Recruitment</label></td>
				<td><html:select property="hrs">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			
			<tr>
				<td width="211" align="center"><label>Freight,Warehousing & Logistic Management</label></td>
				<td><html:select property="freight">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Media,Marketing & prodcut Design Services</label></td>
				<td><html:select property="mediaMarketing">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Network & Cabeling Services</label></td>
				<td><html:select property="networkCabeling">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Printing Services</label></td>
				<td><html:select property="printingServices">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Photographic Services</label></td>
				<td><html:select property="photographic">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Re-seller of Technology Products & Services</label></td>
				<td><html:select property="reseller">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Security Management & Services</label></td>
				<td><html:select property="security">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Software Development , R&D</label></td>
				<td><html:select property="sdrd">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Software Support & Maintainance</label></td>
				<td><html:select property="ssm">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Technology Services - Leading Edge or Highly Specialist</label></td>
				<td><html:select property="technologyService">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Training - Specilist IT & Networking </label></td>
				<td><html:select property="trainingIT">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Training-General Office ,etc</label></td>
				<td><html:select property="trainingGeneral">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Travel Services (including car,hotel,flighs,train, etc)</label></td>
				<td><html:select property="travelService">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Utility services (power,light,heat,etc)</label></td>
				<td><html:select property="utilityPower">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td width="211" align="center"><label>Others (Please Specify)</label></td>
				<td><html:select property="others4">
					<html:option value="select">select</html:option>
					<html:option value="Y">Yes</html:option>
					<html:option value="N">No</html:option>
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
