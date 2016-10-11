<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<!--<%@ include file="dir.jsp" %>

--><!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text /html; charset=UTF-8"/>
<title>
<tiles:getAsString name="title" ignore="true"/>
</title>
<script language="JavaScript" src="javascript/common.js"></script>
<script language="JavaScript" src="javascript/jquery-ui-153/jquery-1.2.6.js"></script>
<script language="JavaScript" src="javascript/jquery-ui-153/ui/ui.core.js"></script>
<script language="JavaScript" src="javascript/jquery-ui-153/ui/minified/ui.sortable.min.js"></script>
<script language="JavaScript" src="javascript/jquery-ui-153/ui/minified/ui.slider.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/ltr/common.css"/>
<link rel="stylesheet" type="text/css" href="css/ltr/ui.datepicker.css" />
<script language="JavaScript" src="javascript/common.js"></script>



<script language="JavaScript">
	$(document).ready(function(){
	$("#selectedList").sortable({
		stop: function(evt, ui){
			var elem = $(ui.item)[0];
			MovableGroup.onSortStop(elem);
		},
		start: function(evt, ui){
			var elem = $(ui.item)[0];
			MovableGroup.onSortStart(elem);
		}
	});
	MovableGroup.init("availableList", "selectedList");	
	});	
	$(document).ready(function() {
	var options = {
		dateFormat: "dd-M-y",
		showOn: "both",
		buttonImage: "css/calendar.gif",
		buttonImageOnly: true
	};

	$('#dateFrom').datepicker(options);
	$('#dateTo').datepicker(options);
});
	function checkAllWorkflow(value)
    {   
    field = document.forms[0].id; 
    for (i = 0; i < field.length; i++)
    field[i].checked = value ;
    }
	</script>
	<style>
	.selected .movable .txtCont{
	cursor:move;
	}
	</style>
	<style>
.ui-slider{
	display: inline-block;
	width: 360px;
	background-image: url(css/slider-bg-1.gif);
}
.ui-slider-handle{
	background-image: url(css/slider-handle.gif);
}
</style>
</head>

<body>
<tiles:insert attribute="header"/>
<table width="100%" border="0" cellspacing="0" cellpadding="0" id="pageContainer">
<tr>
<td id="leftCol">
<tiles:insert attribute="left"/>
</td>
<td id="centerCol">
<tiles:insert attribute="body"/>
</td>
</tr>
</table>
<tiles:insert attribute="bottom"/>
</body>
</html>