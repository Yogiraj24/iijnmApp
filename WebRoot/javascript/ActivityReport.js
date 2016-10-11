function initialize(fieldName) {
	if (GBrowserIsCompatible()) {
		this.map = new GMap2(document.getElementById("gmapDiv"));
		map.setCenter(new GLatLng(37.4419, -122.1419), 13);
		map.addControl(new GMapTypeControl());
		map.addControl(new GLargeMapControl());
		var js_urls = [ elabelJs ];

		YAHOO.util.Get.script(js_urls, {
			onSuccess : function() {
				loadComplete = true;
				showMap(fieldName);

			}
		});

	}

}

function initTeam() {
	checkTeam(document.forms[0].allTeams, document.forms[0].team);
	checkUser(document.forms[0]);
}
function trimValue(field) {
	var val = field.value;
	field.value = trim(val);
}
function trim(val) {
	return val.replace(/^\s+|\s+$/g, "")
}

function toggleEventInfo(n) {
	var tr = document.getElementById("eventInfoRow" + n);
	if (tr) {
		tr.style.display = (tr.style.display == "none") ? "" : "none";
	}
	setReportDivWidth();
}
function setReportDivWidth() {
	var repTab = document.getElementById("reportTable");
	var repDiv = document.getElementById("reportContainer");
	try {
		if (repDiv != null && repTab != null) {
			var tabWidth = repTab.offsetWidth > repTab.width ? repTab.offsetWidth
					: repTab.width;
			repDiv.style.width = tabWidth;
		}
	} catch (ex) {

	}
}

function showLandmark(data) {

	var dataArray = data.split(",");
	var landmarkIcon = new GIcon(G_DEFAULT_ICON);
	landmarkIcon.shadow = "";
	landmarkIcon.image = landmarkIconImagePath;

	markerOptions = {
		icon : landmarkIcon
	};
	style = '<div style="background-color:#ccccff;font-weight:bold;font-size:9px;border:1px solid black">' + dataArray[3] + '</div>';
	var point = new GLatLng(dataArray[4], dataArray[5]);
	map.addOverlay(new GMarker(point, markerOptions));
	var label = new ELabel(point, style, null, new GSize(2, -25), 75);
	map.addOverlay(label);

}

function showMap(fieldName) {
	var checkBoxElement = fieldName;
	var atleastOneChecked = false;
	var flag = false;
	var noValidData = false;
	var LocationData = [];
	var cellSiteData = [];
	var allowCellSite = document.forms["activityReportForm"].includeCellSite.value * 1 === 1 ? true
			: false;
	if (!checkBoxElement.length) {
		checkBoxElement = [ checkBoxElement ];
	}
	for ( var i = 0; i < checkBoxElement.length; i++) {
		if (checkBoxElement[i].checked) {
			atleastOneChecked = true;
			noValidData = true;
			var val = checkBoxElement[i].value;

			var stringArray = val.split(",");

			if (isNaN(stringArray[1] * 1) || isNaN(stringArray[2] * 1)) {
				continue;
			} else if (stringArray[1] * 1 < 0 || stringArray[1] * 1 > 90
					|| stringArray[2] * 1 < -180 || stringArray[2] * 1 > 180) {
				continue;
			} else if (!allowCellSite && stringArray[3] * 1 === 1) {
				cellSiteData.push(stringArray[3]);
				continue;
			} else {
				var d = stringArray[0] + "," + stringArray[1] + ","
						+ stringArray[2];
				if (stringArray[4] != 'NA') {
					d = d + "," + stringArray[4] + "," + stringArray[5] + ","
							+ stringArray[6];

				}

				LocationData.push(d);
			}
		}
	} // for loop close

	if (LocationData.length > 0) {
		var pnl = getPanel();
		var latlongArray = [];
		pnl.center();
		if (!loadComplete) {
			initialize(fieldName);
		}

		if (loadComplete) {
			pnl.show();
			var firstPoint = true;
			var bounds;
			flag = true;

			for ( var k = 0; k < LocationData.length; k++) {
				var dataValue = LocationData[k];
				var dataArray = dataValue.split(",");
				var dataArrayLength = dataArray.length;

				if (firstPoint == true) {
					map.clearOverlays();
					map.setCenter(new GLatLng(dataArray[1], dataArray[2]), 14);
					bounds = map.getBounds();
					firstPoint = false;
				}
				var iconType = new GIcon(G_DEFAULT_ICON);
				iconType.image = "http://www.google.com/intl/en_ALL/mapfiles/ms/micons/blue-dot.png";
				markerOptions = {
					icon : iconType
				};
				var point = new GLatLng(dataArray[1], dataArray[2]);

				latlongArray.push(point);
				map.addOverlay(new GMarker(point, markerOptions));

				// A simple transparent ELabel

				var dir = k * 1 + 1;
				var style = '<div style="background-color:#ccccff;font-weight:bold;font-size:10px;border:2px solid black">'
						+ dir + ":" + dataArray[0] + '</div>';
				var label = new ELabel(point, style, null, new GSize(6, -30),
						75);
				map.addOverlay(label);
				bounds.extend(point);

				if (dataArrayLength > 3) {
					showLandmark(dataValue);

				}

			} //Location Data for loop closes

			var polygon = new GPolyline(latlongArray, "#f33f00", 5, 1,
					"#ff0000", 0.2);
			map.addOverlay(polygon);

		}//Load Complete  loop Closes
	} else {
		if (noValidData) {
			if (cellSiteData.length > 0) {
				alert(message1);
			} else {
				alert(message2);
			}
		}
	}

	if (atleastOneChecked) {
		if (flag) {
			map.setCenter(bounds.getCenter(), map.getBoundsZoomLevel(bounds));
		}
	} else {
		alert(message3);
	}
} //function close

var UserUtil = {
	init : function() {

	},

	processUsersArr : function(arr) {
		if (arr[0].length == 3)
			return;

		//add lower case username as 3rd element 
	for ( var i = 0, len = arr.length; i < len; i++) {
		var tmp = arr[i];
		tmp.push(tmp[1].toLowerCase());
	}
},

optionTagReg : {},
getOptionObj : function(userId, userName) {
	var opt = this.optionTagReg[userId];
	if (!opt) {
		//var elem = new Option(userName, userId);
	var elem = document.createElement('option');
	elem.innerHTML = userName;
	elem.value = userId;
	this.optionTagReg[userId] = opt = elem;
}
opt.selected = false;
return opt;
}

}
function checkOneActivitySummary(value) {
	frm = document.forms["activitySummaryReportForm"];
	for ( var i = 0; i < frm.elements.length; i++) {

		if (frm.elements[i].type == "checkbox"
				&& frm.elements[i].name == "team") {
			if (frm.allTeams.checked == true) {
				frm.elements[i].checked = true;
			} else {
				frm.allTeams.checked == true
				frm.elements[i].checked = false;
			}
		}
	}
}

function checkOne(value) {
	frm = document.forms["activityReportForm"];
	for ( var i = 0; i < frm.elements.length; i++) {

		if (frm.elements[i].type == "checkbox"
				&& frm.elements[i].name == "team") {
			if (frm.allTeams.checked == true) {
				frm.elements[i].checked = true;
			} else {
				frm.allTeams.checked == true
				frm.elements[i].checked = false;
			}
		}
	}
}
function checkEventReport(value) {
	frm = document.forms["eventReportForm"];
	for ( var i = 0; i < frm.elements.length; i++) {

		if (frm.elements[i].type == "checkbox"
				&& frm.elements[i].name == "team") {
			if (frm.allTeams.checked == true) {
				frm.elements[i].checked = true;
			} else {
				frm.allTeams.checked == true
				frm.elements[i].checked = false;
			}
		}
	}
}
function doExcel() {
	document.forms[0].action = "downloadexcelactivityReport.do?format=xls";
	document.forms[0].submit();
}
function doActivitySummaryExcel() {
	document.forms[0].action = "downloadexcelactivitySummaryReport.do?format=xls";
	document.forms[0].submit();
}
function doEventExcel() {
	document.forms[0].action = "downloadexcelEventReport.do?format=xls";
	document.forms[0].submit();
}
function doShowSummaryReports(dateFrom, dateTo) {
	var df = new Date(dateFrom);
	var dt = new Date(dateTo);
	if (Date.parse(df) > Date.parse(dt)) {
		alert("Invalid Date Range!\nStart Date cannot be after End Date!")
		return false;
	}
	document.forms[0].action = "showActivitySummaryReport.do";
	document.forms[0].offset.value = 0;
	document.forms[0].rowcount.value = rowcount;
	document.forms[0].submit();
}

function doShowReports(dateFrom, dateTo) {
	var df = new Date(dateFrom);
	var dt = new Date(dateTo);
	if (Date.parse(df) > Date.parse(dt)) {
		alert("Invalid Date Range!\nStart Date cannot be after End Date!")
		return false;
	}
	document.forms[0].action = "showActivityReport.do";
	document.forms[0].offset.value = 0;
	document.forms[0].rowcount.value = rowcount;
	document.forms[0].submit();
}
function doShowEventReports(dateFrom, dateTo) {
	var df = new Date(dateFrom);
	var dt = new Date(dateTo);
	if (Date.parse(df) > Date.parse(dt)) {
		alert("Invalid Date Range!\nStart Date cannot be after End Date!")
		return false;
	}
	document.forms[0].action = "showEventReport.do";
	document.forms[0].offset.value = 0;
	document.forms[0].rowcount.value = rowcount;
	document.forms[0].submit();
}
function doSortReports(order) {
	document.forms[0].action = "sortReport.do?sort=wfEventDateTime&order="
			+ order;
	document.forms[0].submit();
}

function checkAll(value) {

	field = document.forms[0].mapData;

	if (field) {
		if (!field.length) {
			field = [ field ];
		}

		for (i = 0; i < field.length; i++)
			field[i].checked = value;
	}
}

function selectEventsInfo(value, fieldValue) {
	temp = "map_eventNum";
	temp = temp.replace(/eventNum/, fieldValue);
	field = document.getElementsByName(temp);
	if (field) {
		if (!field.length) {
			field = [ field ];
		}

		for (i = 0; i < field.length; i++)
			field[i].checked = value;
	}
}
function checkTeamActivitySummary(allTeams, teams) {

	var teamId = document.forms[0].userId;
	var teamflag = 0;
	var allteamflag = 0;

	if (teams) {
		if (!teams.length) {
			teams = [ teams ];
		}
	}

	if (allTeams.checked) {
		allteamflag++;
	}

	if (teams) {
		for ( var i = 0; i < teams.length; i++) {
			if (teams[i].checked) {
				teamflag++;
			}
		}
	}

	if (teamflag > 0) {
		teamId.disabled = true;
	} else {
		if (allteamflag * 1 == 1) {
			allTeams.checked = false;
		}
		teamId.disabled = false;
	}
	if (teams) {
		if (teams.length > teamflag) {
			allTeams.checked = false;
			allTeams.value = "0";
		} else if (teams.length == teamflag) {
			allTeams.checked = true;
			allTeams.value = "1";
		}
	}
}

function checkTeam(allTeams, teams) {

	var teamId = document.forms[0].userId;
	var teamflag = 0;
	var allteamflag = 0;

	if (teams) {
		if (!teams.length) {
			teams = [ teams ];
		}
	}

	if (allTeams.checked) {
		allteamflag++;
	}

	if (teams) {
		for ( var i = 0; i < teams.length; i++) {
			if (teams[i].checked) {
				teamflag++;
			}
		}
	}

	if (teamflag > 0) {
		teamId.disabled = true;
	} else {
		if (allteamflag * 1 == 1) {
			allTeams.checked = false;
		}
		teamId.disabled = false;
	}
	if (teams) {
		if (teams.length > teamflag) {
			allTeams.checked = false;
			allTeams.value = "0";
		} else if (teams.length == teamflag) {
			allTeams.checked = true;
			allTeams.value = "1";
		}
	}
}

function checkUser(form) {
	var index = form.userId.selectedIndex;
	var teams = form.team;

	if (teams) {
		if (!teams.length) {
			teams = [ teams ];
		}
		if (index * 1 > 0) {
			form.allTeams.disabled = true;
			for ( var i = 0; i < teams.length; i++) {
				teams[i].disabled = true;
			}
		} else {
			form.allTeams.disabled = false;
			for ( var i = 0; i < teams.length; i++) {
				teams[i].disabled = false;
			}
		}
	}
}

function onPageUnload() {
	if (typeof GUnload != "undefined") {
		GUnload();
	}
}

function getPanel() {

	if (!panel) {
		document.getElementById('rPanel').style.display = "";
		panel = new YAHOO.widget.Panel("rPanel", {
			draggable : true,
			width : "500px",
			height : "350px",
			zIndex : "10",
			autofillheight : "body", // default value, specified here to highlight its use in the example
			constraintoviewport : true,
			visible : false,
			context : [ "myButton", "tl", "bl" ]
		});
		panel.render();

		// Create Resize instance, binding it to the 'rPanel' DIV

		var resize = new YAHOO.util.Resize("rPanel", {

			handles : [ "br" ],
			autoRatio : false,
			minWidth : 500,
			minHeight : 350,
			status : false
		});

		resize.on("startResize", function(args) {
			if (this.cfg.getProperty("constraintoviewport")) {
				var D = YAHOO.util.Dom;
				var clientRegion = D.getClientRegion();
				var elRegion = D.getRegion(this.element);

				resize.set("maxWidth", clientRegion.right - elRegion.left
						- YAHOO.widget.Overlay.VIEWPORT_OFFSET);
				resize.set("maxHeight", clientRegion.bottom - elRegion.top
						- YAHOO.widget.Overlay.VIEWPORT_OFFSET);
			} else {
				resize.set("maxWidth", null);
				resize.set("maxHeight", null);
			}
		}, panel, true);

		resize.on("resize", function(args) {
			var panelHeight = args.height;
			this.cfg.setProperty("height", panelHeight + "px");
			map.checkResize();
		}, panel, true);
	}

	return panel;
}
