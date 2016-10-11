function validateUser()
{
	var form = document.adduserform;
	if ( form.fisrtName.value == "" || form.fisrtName.value == "" )
    {
	     alert ( "Please fill in the First Name box seperate js." );
	     form.fisrtName.focus();
	     return false;
    }
	if ( form.lastName.value == "" )
    {
	     alert ( "Please fill in the lastName box seperate js." );
	     form.lastName.focus();	  
	     return false;      
    }
	if ( form.usertypeId.value == "" )
    {
	     alert ( "Please fill in the usertypeId box seperate js." );
	     form.usertypeId.focus();
	     return false;
    }
	if ( form.emailAddress.value == "" )
    {
	     alert ( "Please fill in the emailAddress box seperate js." );
	     form.emailAddress.focus();
	     return false;
    }
  return true;		
}
