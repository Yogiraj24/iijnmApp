
function showMap(fieldName) { 
    var checkBoxElement = fieldName;
    var atleastOneChecked = false;
    var flag = false;
    var LocationData = [];
   if(!checkBoxElement.length){
      checkBoxElement = [checkBoxElement];
   }
    for (var i = checkBoxElement.length - 1 ; i >=0 ; i--) {
        if (checkBoxElement[i].checked) {
            atleastOneChecked = true;
            var val = checkBoxElement[i].value;
            var stringArray = val.split(",");
            if (isNaN(stringArray[1] * 1) || isNaN(stringArray[2] * 1)) {
                continue;
            } else if (stringArray[1] * 1 < 0 || stringArray[1] * 1 > 90 || stringArray[2] * 1 < -180 || stringArray[2] * 1 > 180) {
                continue;
            } else {
                var d = stringArray[0]+"," +stringArray[1] + "," + stringArray[2];
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
        if(loadComplete) {
         pnl.show();
        var firstPoint = true;
        var bounds;
        flag = true;
        for (var k = 0; k < LocationData.length; k++) {
            var dataValue = LocationData[k];
            var dataArray = dataValue.split(",");
            if (firstPoint == true) {
                map.clearOverlays();
                map.setCenter(new GLatLng(dataArray[1], dataArray[2]), 14);
                bounds = map.getBounds();
                firstPoint = false;
            }
            var point = new GLatLng(dataArray[1], dataArray[2]);
            latlongArray.push(point);
            map.addOverlay(new GMarker(point));
            
             var dir = k*1+1;
             var style = '<div style="background-color:#ccccff;font-weight:bold;font-size:10px;border:2px solid black">'+ dir+":" +dataArray[0]+'</div>';
		  	 var label = new ELabel(point,style , null, new GSize(6,-30), 75);
             map.addOverlay(label);  
              
            bounds.extend(point);
        } //Location Data for loop closes
        
            var polygon =  new GPolygon(latlongArray, "#f33f00", 5, 1, "#ff0000", 0.2);
            map.addOverlay(polygon);
    }
    }
    if (atleastOneChecked) {
        if (flag) {
            map.setCenter(bounds.getCenter(), map.getBoundsZoomLevel(bounds));
        }
    } else {
        alert('<bean:message key="activityreport.select.msg" />');
    } 
} //function close




var panel = null;
function getPanel(){
	if(!panel){
		  document.getElementById('rPanel').style.display = "";
          panel = new YAHOO.widget.Panel("rPanel", {
          draggable:true,
          width: "500px",
          height: "350px",
          zIndex:"10",
          autofillheight: "body", // default value, specified here to highlight its use in the example
          constraintoviewport: true,
          visible: false,
          context: ["myButton", "tl", "bl"]
      });
      panel.render();
		
      // Create Resize instance, binding it to the 'rPanel' DIV
      
        var resize = new YAHOO.util.Resize("rPanel", {
         
          handles: ["br"],
          autoRatio: false,
          minWidth: 500,
          minHeight: 350,
          status: false
      });

      resize.on("startResize", function(args) {
          if (this.cfg.getProperty("constraintoviewport")) {
              var D = YAHOO.util.Dom;
              var clientRegion = D.getClientRegion();
              var elRegion = D.getRegion(this.element);
       
              resize.set("maxWidth", clientRegion.right - elRegion.left - YAHOO.widget.Overlay.VIEWPORT_OFFSET);
              resize.set("maxHeight", clientRegion.bottom - elRegion.top - YAHOO.widget.Overlay.VIEWPORT_OFFSET);
          } else {
              resize.set("maxWidth", null);
              resize.set("maxHeight", null);
          }
      }, panel, true );

      resize.on("resize", function(args) {
           var panelHeight = args.height;
           this.cfg.setProperty("height", panelHeight + "px");
           map.checkResize();
      }, panel, true);
      
     

    }

  
	return panel;
}

function toggleEventInfo(n){
	var tr = document.getElementById("eventInfoRow"+n);
	if(tr){
		tr.style.display = (tr.style.display == "none")? "" : "none";
	}
}


var UserUtil = {
	init: function(){
	
	},
	
	processUsersArr: function(arr){
		if(arr[0].length == 3) return;
		
		//add lower case username as 3rd element 
		for(var i=0, len=arr.length; i<len; i++){
			var tmp = arr[i];
			tmp.push( tmp[1].toLowerCase() );
		}
	},
	
	optionTagReg: {},
	getOptionObj: function(userId, userName){
		var opt = this.optionTagReg[userId];
		if(!opt){
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



function checkOne(value) {
   		frm = document.forms["activityReportForm"];
		for(var i=0; i<frm.elements.length; i++)
			{
				if(frm.elements[i].type == "checkbox" && frm.elements[i].name == "team")
				{
					if(frm.allTeams.checked == true)
					{
						frm.elements[i].checked = true;
					}
					else
						{
	  					  frm.allTeams.checked == true
	  					  frm.elements[i].checked = false;
						}
				}
			} 	    
    }
 
  function doExcel(){
 	document.forms[0].action = "downloadexceluserTrackingReport.do?format=xls"; 
 	document.forms[0].submit();
  }
  
  
 
 function doShowReports(dateFrom,dateTo){ 	
 	var flag = checkUserSelection();
 	if(!flag)
 	{
 		return false;
 	}
 	var df = new Date(dateFrom);
 	var dt= new Date(dateTo); 	
 	if (Date.parse(df) > Date.parse(dt)) {
	alert("Invalid Date Range!\nStart Date cannot be after End Date!")
	return false;
	} 	
	 	document.forms[0].action = "showUserTrackingReport.do"; 
 		document.forms[0].submit();	
 }
 
 function checkAll(value){
	field = document.forms[0].mapData;
	if(field) {
	 	if(!field.length){
		field = [field];
		}
		for (i = 0; i < field.length; i++)
		field[i].checked = value ;
		}
}

 function selectEventsInfo(value,fieldValue){
  	temp = "map_eventNum";
 	temp = temp.replace(/eventNum/,fieldValue);
 	field = document.getElementsByName(temp);
 	if(field) {
	 	if(!field.length){
		field = [field];
		}
  	 
		for (i = 0; i < field.length; i++)
		field[i].checked = value ;
		}
}


function checkUser(form) {
 	var index = form.userId.selectedIndex;
    var teams = form.team;
    
    if(teams){
        if(!teams.length){
   		teams = [teams];
  		}
        if(index*1 > 0) {
		    form.allTeams.disabled=true;
		        for(var i=0;i<teams.length;i++){
 					teams[i].disabled=true;
  					}
		    }else{
		        form.allTeams.disabled=false;
		        for(var i=0;i<teams.length;i++){
 					   teams[i].disabled=false;
  					   }
		         }
		    }
 }
 


function toggleEventInfo(n){
	var tr = document.getElementById("eventInfoRow"+n);
	if(tr){
		tr.style.display = (tr.style.display == "none")? "" : "none";
	}
}
var UserUtil = {
	init: function(){
	
	},
	
	processUsersArr: function(arr){
		if(arr[0].length == 3) return;
		
		//add lower case username as 3rd element 
		for(var i=0, len=arr.length; i<len; i++){
			var tmp = arr[i];
			tmp.push( tmp[1].toLowerCase() );
		}
	},
	
	optionTagReg: {},
	getOptionObj: function(userId, userName){
		var opt = this.optionTagReg[userId];
		if(!opt){
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

function checkOne(value) {
   		frm = document.forms["activityReportForm"];
		for(var i=0; i<frm.elements.length; i++)
			{
				if(frm.elements[i].type == "checkbox" && frm.elements[i].name == "team")
				{
					if(frm.allTeams.checked == true)
					{
						frm.elements[i].checked = true;
					}
					else
						{
	  					  frm.allTeams.checked == true
	  					  frm.elements[i].checked = false;
						}
				}
			} 	    
    }
 
  function doExcel(){
 	document.forms[0].action = "downloadexceluserTrackingReport.do?format=xls"; 
 	document.forms[0].submit();
  }
 
 function doShowReports(dateFrom,dateTo){ 	
 	var flag = checkUserSelection();
 	if(!flag)
 	{
 		return false;
 	}
 	var df = new Date(dateFrom);
 	var dt= new Date(dateTo); 	
 	if (Date.parse(df) > Date.parse(dt)) {
	alert("Invalid Date Range!\nStart Date cannot be after End Date!")
	return false;
	} 	
	 	document.forms[0].action = "showUserTrackingReport.do"; 
 		document.forms[0].submit();	
 }
 
 function checkAll(value){
	field = document.forms[0].mapData;
	if(field) {
	 	if(!field.length){
		field = [field];
		}
		for (i = 0; i < field.length; i++)
		field[i].checked = value ;
		}
}

 function selectEventsInfo(value,fieldValue){
  	temp = "map_eventNum";
 	temp = temp.replace(/eventNum/,fieldValue);
 	field = document.getElementsByName(temp);
 	if(field) {
	 	if(!field.length){
		field = [field];
		}
  	 
		for (i = 0; i < field.length; i++)
		field[i].checked = value ;
		}
}

