<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<%



java.util.Enumeration params = request.getParameterNames();
String queryString = "";
while(params.hasMoreElements()){
	String param = (String)params.nextElement();
	if(!param.equals("rowcount") && !param.equals("offset") && !param.equals("actionName") && com.pranavendu.college.framework.PlatformUtil.isNotEmpty(request.getParameter(param))){

		String[] values = request.getParameterValues(param);
		for(int i=0; i<values.length; i++){
			queryString += "&" + param + "=" + values[i];
		}
	}
}

//System.out.println(queryString);

int totalRows = (Integer)request.getAttribute("totalRows");
int offset = (Integer)request.getAttribute("offset");
int rowcount = (Integer)request.getAttribute("rowcount");
if(rowcount == 0) rowcount = 10;

//System.out.println("totalRows "+totalRows);
//System.out.println((totalRows % rowcount));

String actionName = request.getParameter("actionName");
if (actionName == null){
	actionName = "";
}

int startRow = offset + 1;
int lastRow = (totalRows > (offset + rowcount) ? offset + rowcount : totalRows);
//out.println("(Showing " + startRow + " - " + lastRow + " of " + totalRows + " record(s))");
%>PaginationShowing (<%=startRow %> - <%=lastRow%>&nbsp;&nbsp;From  <%=totalRows%>&nbsp;Records)
<%
if(offset > 0){
	int prev = offset-rowcount;
	//out.println("<a href='" + actionName + "?offset=0&rowcount="+rowcount+ queryString +"'>&lt;&lt; First</a>"); 
	//out.println("<a href='" + actionName + "?offset="+prev+"&rowcount="+rowcount+queryString +"'>Prev</a>"); 
	%>
	<a href="<%=actionName%>?offset=0&rowcount=<%=rowcount%><%=queryString%>">&lt;&lt;First </a>
	<a href="<%=actionName%>?offset=<%=prev%>&rowcount=<%=rowcount%><%=queryString%>">&lt;&lt;Previous </a>
	<% 
	
}
%>

<%
int pageNum = 0;
int o = 0;
for (int i = 0; i < (totalRows / rowcount); i++){
	o = i * rowcount;
	pageNum = i + 1;
	//out.println("<a href='" + actionName + "?offset="+o+"&rowcount="+rowcount+queryString +"'" + ((offset / rowcount) + 1 == pageNum ? "class='currentPage'" : "") + ">"+pageNum+"</a>"); 
}

if(totalRows % rowcount > 0){
	o = pageNum * rowcount;
	pageNum = pageNum + 1;
	//out.println("<a href='" + actionName + "?offset="+o+"&rowcount="+rowcount+queryString +"'" + ((offset / rowcount) + 1 == pageNum ? "class='currentPage'" : "") + ">"+pageNum+"</a>"); 
}

%>
<%
if(totalRows > offset + rowcount){
	int next = offset + rowcount;
	int last = (totalRows % rowcount) > 0 ? (totalRows / rowcount) * rowcount : ((totalRows / rowcount) - 1) * rowcount;
	//out.println("<a href='" + actionName + "?offset="+next+"&rowcount="+rowcount+queryString +"'>Next</a>"); 
	//out.println("<a href='" + actionName + "?offset="+last+"&rowcount="+rowcount+queryString +"'>Last &gt;&gt;</a>"); 
	%>
	<a href="<%=actionName%>?offset=<%=next%>&rowcount=<%=rowcount%><%=queryString%>">Next&gt;&gt;</a>
	<a href="<%=actionName%>?offset=<%=last%>&rowcount=<%=rowcount%><%=queryString%>">Last &gt;&gt; </a>
	<% 
}
%>

<%
String excelAvailable = request.getParameter("excelAvailable");
if (excelAvailable == null){
	excelAvailable = "true";
}

if (excelAvailable.equals("true")){
%>
	<a href="<%=actionName%>?offset=0&rowcount=0<%= queryString %>&format=xls"><img src="images/img/page_excel.png" title="Download"alt='Download' /></a>
<%
}
%>
    