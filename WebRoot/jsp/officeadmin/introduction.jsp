<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<h2>Data Usage and Disclaimer</h2>
<h3>Registering in HP's Supplier Diversity database is the first step  in our evolution of your firm's potential to 
do business with Hewlett Packard.</h3>
<h3>BEFORE PROCEEDING WITH THIS REGISTRATION PROCESS , PLEASE NOTE
<div
{
font-family: verdana;
}>
<p ><font color="blue">The information that you provide to HP in the following questionaire will be used primarily by HP Global Procrement 
and specific HP Business personnel to usderstand your business capability and product/service offering .
 Therefor , it is recommended that while endeavouring to promote your organisation in the best possible way ,
  you are careful with the informatuino you submit , at this stage please do not provide information you consider to be
   confidential,trade secrets, ot otherwise sensitive information . After some initial evalution and dialouge , 
   should both parties decide to then take matters to be a more foramlised commercial nature , 
   HP has standard confidentiality and Non Disclousre Agreement to give the necessary protection for the sharing of sensitive information .</p>

<p>The data will be stored in an internally managed Supplier Diversity databse to be utilized by select
 HP porcurement and commodity managers to evaluate your company as ap potential supplier 
 (based on technology , quality , responsiveness , felivery capabilities etc) and for no toher purpose  
 For more information see the HP online Proivacy Statement . If you have questions or concerns about 
 the use of this information , please contact the Supplier Diversity registration administrator at SMEregistration@hp.com before proceding.</p></font></div>
</h3>
<html:form action="/accept.do?actionType" method="post">
<table>

			<tr>
				<td colspan="2" class="submitRow"><span class="pushButton">
				<span> <html:submit>I Accept
				</html:submit> </span> </span></td>

			</tr>
			<%			
			String myPage = "http://http://c0006439.itcs.hp.com/:8080/SupplierApp/jsp/common/adminLogin.jsp";
			%>

			<tr>
				<td colspan="2" class="submitRow" onClick="JavaScript:window.location='<%= myPage %>';"><span class="pushButton">
				<span> <html:button property="reject">I Reject
				</html:button> </span> </span></td>

			</tr>
			</table>
			</html:form>
</body>
</html>
