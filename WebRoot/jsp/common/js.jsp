<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<script language="JavaScript">
var FormLib = {
	setMasterChk:function(chkMaster, chkChild){
	
	},
	
	setChildChk: function(chkChild, bCheck){
	
	}
}


var FormValidations = {
	deleteBtnHandler: function(chk){
	
	}
}

var FormFilter = {
	toggle: function(elBtn, elContainer){
		(elContainer.style.display=="none")? this.show(elBtn, elContainer) : this.hide(elBtn, elContainer);
	},
	
	show: function(elBtn, elContainer){
		elBtn.style.backgroundImage = "url(css/minus.gif)";
		elContainer.style.display = "";
	},
	
	hide: function(elBtn, elContainer){
		elBtn.style.backgroundImage = "url(css/plus.gif)";
		elContainer.style.display = "none";	
	}
}



var MovableGroup = {
	init: function(idAvailableCont, idSelectedCont){
		idAvailableCont = "#"+idAvailableCont;
		idSelectedCont = "#"+idSelectedCont;
		
		var clickHandler = function(event){
			var id = event.data.id;
			var mItem = MovableGroup.getItem(id);
			
			function showHandler(){
				if(mItem.isSelected){
                                          
					mItem.isSelected = false;
					$(idAvailableCont).append(mItem.el);

					mItem.icon.attr("src", "images/img/add.png");
					mItem.icon.attr("title", "Select");
					
					var val = mItem.hidden[0].value;
					mItem.hiddenFldContainer.html('<input type="hidden" name="available" value="'+val+'" >');
					mItem.hidden = mItem.hiddenFldContainer.find(":hidden");
				}else{
					  
					mItem.isSelected = true;
					$(idSelectedCont).append(mItem.el);

					mItem.icon.attr("src", "images/img/cancel.png");
					mItem.icon.attr("title", "Remove");	
					
					var val = mItem.hidden[0].value;
					mItem.hiddenFldContainer.html('<input type="hidden" name="selected" value="'+val+'" >');
					mItem.hidden = mItem.hiddenFldContainer.find(":hidden");
				}
				
				$(mItem.el).fadeIn(1000);
			}
			
			$(mItem.el).fadeOut(500, showHandler);
			
		}
		
		var isSelected = false;
		var createMovableItem = function(index, domEle){
			var id = MovableGroup.getId();
			domEle.id = id;

			var mItem = new MovableItem(domEle, idAvailableCont, idSelectedCont, isSelected);
			mItem.icon.bind("click", {id: id}, clickHandler);
			
			MovableGroup.addItem( id, mItem );		
		}		
		
		isSelected = false;
		$(idAvailableCont+" .movable").each(createMovableItem);
		
		isSelected = true;
		$(idSelectedCont+" .movable").each(createMovableItem);		
		
		
	},
	
	onSortStart:function(elem){
		var mItem = this.getItem(elem.id);
		mItem.saveChkboxState();
	},
	
	onSortStop:function(elem){
		var mItem = this.getItem(elem.id);
		mItem.restoreChkboxState();
	},	
	
	
	list:{},
	idCounter: 0,
	getId: function(){
		return "movableItem_"+(this.idCounter++);
	},
	addItem: function(key, item){
		this.list[key] = item;
	},
	getItem:function(key){
		return this.list[key] || null;
	}
}


function MovableItem(el, idAvailableCont, idSelectedCont, bSelected){
	this.el = el;
	this.idAvailableCont = idAvailableCont;
	this.idSelectedCont = idSelectedCont;
	this.icon = $(el).find(".imgCont img");
	this.checkboxes = $(el).find(":checkbox");
	this.hidden = $(el).find(":hidden");
	this.hiddenFldContainer = $(el).find(".hiddenFldContainer");
	
	this.isSelected = bSelected;
}

MovableItem.prototype.saveChkboxState = function(){
	this.checkboxes.each(function(i, elem){
		elem.checkedOrig = elem.checked;
	});
}

MovableItem.prototype.restoreChkboxState = function(){
	this.checkboxes.each(function(i, elem){
		elem.checked = elem.checkedOrig;
	});
}

function checkAllboxes()
{
	frm = document.forms["CustomerListingForm"];
	for(var i=0; i<frm.elements.length; i++)
	{
		if(frm.elements[i].type == "checkbox" && frm.elements[i].name == "actionItem")
	{
		if(frm.selectAll.checked == true)
	{
		frm.elements[i].checked = true;
	}
	else
	{
		frm.elements[i].checked = false;
	}
	}
	}
}

function checkEvery()
{
	frm = document.forms["userform"];
	for(var i=0; i<frm.elements.length; i++)
	{
	if(frm.elements[i].type == "checkbox" && frm.elements[i].name == "UserIds")
	{
	if(frm.selectAll.checked == true)
	{
	frm.elements[i].checked = true;
	}
	else
	{
	frm.elements[i].checked = false;
	}
	}
	}
    	
}
function checkEveryWorkFlowEvent() 
{
	frm = document.forms["workflow"];
	for(var i=0; i<frm.elements.length; i++)
	{
	if(frm.elements[i].type == "checkbox" && frm.elements[i].name == "id")
	{
	if(frm.selectAll.checked == true) 
	{
	frm.elements[i].checked = true;
	}
	else
	{
	frm.elements[i].checked = false;
	}
	}
	}
}
	function checkAll(value)
	{		
	field = document.forms[0].id;	
	for (i = 0; i < field.length; i++)
    field[i].checked = value ;    
    }     
   
	function doCancel() {						
		document.forms[0].action = "listWorkflow.do";		
		document.forms[0].submit();
	}

 function cancelEdit() 
{		
	history.back();
}   

function deleteAll()
{
 	var count=0;
   	frm = document.forms["CustomerListingForm"];
  	for(var i=0; i<frm.elements.length; i++)
	{
		if(frm.elements[i].type == "checkbox" && frm.elements[i].name == "actionItem")
	{
	  if(frm.elements[i].checked == true)
	  {
	  	count=count+1;
	  }
    }
   }
  		if(count==0 )
   {
     alert('<bean:message key="customer.message.atleastOneCustomer"/>')
     return false;
   }
   else
   { 
   		var where_to;
   		if(count==1)
   			where_to= confirm('<bean:message key="customer.message.active/deactiveCustomer"/>');
   		else
   		 	where_to= confirm('<bean:message key="customer.message.active/deactiveCustomers"/>');
        if (where_to== true)
         {
          document.forms[0].action="deleteCustomer.do?fromJs=yes";
          document.forms[0].submit();
        }
        if (where_to== false)
        {
            document.forms[0].selectAll.checked=false;
            for(var i=0; i<frm.elements.length; i++){
				if(frm.elements[i].type == "checkbox" && frm.elements[i].name == "actionItem"){
	  			if(frm.elements[i].checked == true){
	  				frm.elements[i].checked = false;
	  				}
	  			}
	  		}
            return false;
        }
   }
 }

   
	
	function doEdit(value) {				
		alert(value);		
		document.forms[0].id.value = value;		
		document.forms[0].action = "editlistWorkflow.do";		
		document.forms[0].submit();
	}



 //Team JS  Start


 function delete1(){ 
 var count=0;
   frm = document.forms["teamListingForm"];
   for(var i=0; i<frm.elements.length; i++)
	{
	if(frm.elements[i].type == "checkbox" && frm.elements[i].name == "actionItem")
	{
	  if(frm.elements[i].checked == true)
	  {count=count+1;}
    }
   }
   if(count==0){
     alert('<bean:message key="team.message.AtleastOneTeam"/>');
     return false;
   }else{ 
	   var where_to;
	    if(count==1)
			where_to= confirm('<bean:message key="team.message.delteConfirmteam"/>');
		else
			where_to= confirm('<bean:message key="team.message.delteConfirmteams"/>');
        if (where_to== true)
         {
          document.forms[0].action="deleteTeam.do?fromJs=yes";
          document.forms[0].submit();
        }
        if (where_to== false){
            document.forms[0].selectAll.checked=false;
            
            for(var i=0; i<frm.elements.length; i++){           	
	   	if(frm.elements[i].type == "checkbox" && frm.elements[i].name == "actionItem"){
	   	  if(frm.elements[i].checked == true){	   	 
	   	     frm.elements[i].checked = false ;
	   	   }
	       }
          }
          
            return false;
            
        }
       
      
   }
 }
 
function deleteConfirmation()
{
	var where_to= confirm('<bean:message key="customer.message.active/deactiveCustomer"/>');
 	if (where_to== true)
    {
        return true;
    }
    if (where_to== false)
    {
        return false;
    }
}  
 
 function deleteConfirm(id)
{
var where_to= confirm('<bean:message key="team.message.delteConfirmteam"/>');
        if (where_to== true)
         {
           document.teamListingForm.action = "deleteTeam.do";
           document.getElementById("teamId").value = id;
           document.teamListingForm.submit();
         }
      }  
    
    function doCancelEditTeam() {						
		history.back();
	}

	function checkAllboxesTeam()
{
	frm = document.forms["teamListingForm"];
	for(var i=0; i<frm.elements.length; i++)
	{
		if(frm.elements[i].type == "checkbox" && frm.elements[i].name == "actionItem")
	{
		if(frm.selectAll.checked == true)
	{
		frm.elements[i].checked = true;
	}
	else
	{
		frm.elements[i].checked = false;
	}
	}
	}
}

function editTeam(id) {
document.teamListingForm.action = "getTeam.do";
document.getElementById("teamId").value = id;
document.teamListingForm.submit();
}

//Team JS  End	

	function checkWorkFlow() 
{
	frm = document.forms["workflowListingForm"];
	for(var i=0; i<frm.elements.length; i++)
	{
	if(frm.elements[i].type == "checkbox" && frm.elements[i].name == "id")
	{
	if(frm.selectAll.checked == true) 
	{
	frm.elements[i].checked = true;
	}
	else
	{
	frm.elements[i].checked = false;
	}
	}
	}
}

/* 
 * WorkFlowEvent description counter method 
 */
   function textCounter(field, countfield, maxlimit) {
						if (field.value.length > maxlimit) // if too long...trim it!
						field.value = field.value.substring(0, maxlimit);
						// otherwise, update 'characters left' counter
						else 
						countfield.value = maxlimit - field.value.length;
						}
						
  </script>



