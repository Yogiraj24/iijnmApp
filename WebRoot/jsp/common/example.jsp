<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<tiles:insert page="/jsp/common/templete.jsp" flush="true">
   <tiles:put name="title" type="string" value="Welcome" />
   <tiles:put name="header" value="/jsp/common/top.jsp" />
   <tiles:put name="menu" value="/jsp/common/left.jsp" />
   <tiles:put name="body" value="/jsp/common/content.jsp" />
   <tiles:put name="bottom" value="/jsp/common/bottom.jsp" /> 
</tiles:insert>