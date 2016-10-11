var options = {
		dateFormat: "dd-M-y",
		showOn: "both",
		buttonImage: "css/calendar.gif",
		buttonImageOnly: true
	};

var AssignRepitionModel = {
	container: null,
	templateHTML:'',
	counter:0,
	numOfAssignments:0,
	init: function(){
		this.container = $("#assignmentContainer");

		this.templateHTML = $("#assignmentTemplate").html();
		$("#assignmentTemplate").empty();

		//events
		$("#addAssignment").bind("click", function(){AssignRepitionModel.add()} )
		
	},

	add: function(){
	try{
		var n = this.counter;
		var thisRef = this;
		var repo = this.templateHTML;
		
		repo = repo.replace(/_suffix/g, n);
		
		this.container.append(repo);
		$("#dateFrom"+n).datepicker(options);
		if(n != 0){//don't animate first one
		
			$("#assignmentDiv"+n).hide();
			$("#assignmentDiv"+n).fadeIn("slow");
			

		}
				
		//events
		$("#delete"+n).bind("click", function(){thisRef.del(n)})
		$("#reset"+n).bind("click", function(){thisRef.reset(n)})
		this.counter++;
		this.numOfAssignments++;
		$("#assignmentsCounter").val(this.counter);

		
		}catch(tree) {
		alert(tree);
		}
		
	},

	del: function(n){
		var div = $("#assignmentDiv"+n);
		var origBorder = div.css("border");
		div.css("border", "2px solid red");

		if(confirm("Delete Assignment")){
			div.fadeOut("slow", function(){
				$(this).remove();
			});
			this.numOfAssignments--;
			$("#assignmentsCounter").val(this.counter);

		}else{
			div.css("border", origBorder);
		}
	},
	
	reset:function(n){
	document.getElementById("name"+n).value = "";
	document.getElementById("workflow"+n).selectedIndex = 0;
	document.getElementById("dateFrom"+n).value = "";
	document.getElementById("hourFrom"+n).selectedIndex = 8;
	document.getElementById("minFrom"+n).selectedIndex = 0;
	document.getElementById("users"+n).selectedIndex = -1;
	document.getElementById("teams"+n).selectedIndex = -1;
	document.getElementById("text"+n).value = "";
	}

}




function onSubmitForm(suffix) {

var srcUsrFld = document.getElementById("users"+suffix);
var destUsrFld = document.getElementById("userSelected"+suffix);

var srcTeamFld = document.getElementById("teams"+suffix);
var destTeamFld = document.getElementById("teamSelected"+suffix);

if(srcUsrFld.selectedIndex < 0  &&  srcTeamFld.selectedIndex < 0){ return ;}

 populateDestination(srcUsrFld,destUsrFld);
 populateDestination(srcTeamFld,destTeamFld);

var wFlow = document.getElementById("workflow"+suffix);

var wfId = wFlow.options[wFlow.selectedIndex].value;
var teams = destTeamFld.value;
var users = destUsrFld.value;


if(wfId*1 != 0) {
  validateWorkflow(wfId,teams,users,suffix)
   }
}

function populateDestination(srcFld,dstFld) {
var vals = [];
var length = srcFld.options.length
	
	for(var i=0 ; i<length; i++) {
		var opt = srcFld.options[i];
			if(opt.selected) vals.push(opt.value);

		}
			
	dstFld.value = vals.join(",");
	

}

function cancel() {

	var a = document.forms[0].offset.value;
	var b = document.forms[0].rowcount.value;
	document.filterDataForm.submit();
	
}


function validate_form(thisform)
{

  with (thisform)
    {
       if(assignmentName.length){
 		  for(var i=0;i<assignmentName.length;i++) {
 		 	 if (validate_required(assignmentName[i],"Please enter the Assignment Name")==false)
    			  {
				  assignmentName[i].focus();
				  return false;
				  
    	                   } 
    	          }
    	          

    			  for ( var i = 0; i < assignmentTypeId.length; i++) {
				if (assignmentTypeId[i].selectedIndex == 0) {
					alert('Please Select Assignment Type');
					assignmentTypeId[i].focus();
					return false;
				}
			}   
    	          
		  for(var i=0;i<dateFrom.length;i++) {
			if(dateFrom[i].value  == "") {
			alert('Please enter the Assignment start date');
			dateFrom[i].focus();
			return false;
			}
		   }
    	          
    	           for(var i=0;i<userId.length;i++) {
			var selectTeam = false;
			var selectUser = false;
			

			
			
			if(teamId[i].selectedIndex == -1) {
				selectTeam = true;	
			}

			
			if(userId[i].selectedIndex == -1) {
				selectUser = true;	
			}

			
			if(selectUser && selectTeam) {

				alert('Please select either user or team or both of them' );
				teamId[i].focus();
				return false;
		}
    	          
    	          
    	  } 
    	  

    	          
        }else{
        	
	       if (validate_required(assignmentName,"Please enter the Assignment Name")==false) {
			    assignmentName.focus();
			 return false;
		         }
		 
					if (assignmentTypeId.selectedIndex == 0) {
						alert('Please Select Assignment Type');
						assignmentTypeId.focus();
						return false;
					}
		
		if(dateFrom.value == "") {
		     alert('Please enter the Assignment start date');
		     dateFrom.focus();
		     return false;
		
		}
		
		var selectTeam = false;
		var selectUser = false;
		if(teamId.selectedIndex == -1) {
			selectTeam = true;	
		}
		
		if(userId.selectedIndex == -1) {
			selectUser = true;	
		}
		

		if(selectUser && selectTeam) {

			alert('Please select either user or team or both of them' );
			teamId.focus();
			return false;
		}

	
        }
        
        
        
     return true;
    }
 }
 
 function validate_required(field,alerttxt)
 {
    with (field)
 	{
 	 value = value.replace(/^\s+|\s+$/g,"");
	 if (value==null || value=="" )
	   {alert(alerttxt);return false;}
	 else {return true}
 	}
 }

function validateDate(date,hour,mins,counter) {
	document.getElementById("currentCounter").value = counter;
    	var xhr = null;
    
    	if (window.XMLHttpRequest) {
    		xhr = new XMLHttpRequest();
    	}else if (window.ActiveXObject) {
    		xhr = new ActiveXObject("Microsoft.XMLHTTP");
    	}
    
    	validateDate.xhr = xhr;
    
    	xhr.open("POST", "validateDate.do?date="+date.value+"&hour="+hour.value+"&mins="+mins.value, true);
    	xhr.onreadystatechange = validateDate_handler;
    	xhr.send(null);
    
}



function validateDate_handler() {
	var xhr = validateDate.xhr;
	if (xhr.readyState==4){
		var textout = xhr.responseText;
		if(textout.length > 0) {
		  alert(textout);
		  var counter  = document.getElementById("currentCounter").value*1;
		  var dateVar = document.getElementById("dateFrom"+counter);
		  dateVar.value = "";
		  dateVar.focus();
	}
	
	}
}
  
  function validateWorkflow(wfId,teams,users,counter) {

 
  	document.getElementById("currentCounter").value = counter;
  	var xhr = null;
  	if (window.XMLHttpRequest) {
  		xhr = new XMLHttpRequest();
  	}else if (window.ActiveXObject) {
  		xhr = new ActiveXObject("Microsoft.XMLHTTP");
  	}
  
  	validateWorkflow.xhr = xhr;
  
  	xhr.open("POST", "validateWorkflow.do?wfId="+wfId+"&teams="+teams+"&users="+users,true);
  	xhr.onreadystatechange = validateWorkflow_handler;
  	xhr.send(null);
  
  }
  
  
  
  function validateWorkflow_handler() {
  	var xhr = validateWorkflow.xhr;
  	if (xhr.readyState==4){
  		var textout = xhr.responseText;
  		if(textout.length > 0) {
  		  alert(textout);
  		  var counter  = document.getElementById("currentCounter").value*1;
  		  var workflowVar = document.getElementById("workflow"+counter);
  		  workflowVar.selectedIndex = 0;

  	}
  
  }
 }
