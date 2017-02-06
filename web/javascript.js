    function formValidation()  
    {  
    var uid = document.Registration.uname;  
    var mname=document.Registration.mname; 
    var sname=document.Registration.usname;
    var gender=document.Registration.ugender;
    var racer=document.Registration.urace;
    var iphone=document.Registration.uphone;
    var uemail=document.Registration.email;   
    var usprov=document.Registration.uprov;
    var zip=document.Registration.uzip;
   
	
    if(allletters(uid)) {}  
    if(allleTters(sname)){}
    if(allgender(gender)){}
    if(allrace(racer)){}
    if(allnumeric(iphone, 10)){}
    if(validemail(uemail)){}
    if(allprovince(usprov)){}
    if(allpostal(zip, 4)){}
   
 return false;  
      
    }
function allletters(uid)  
    {   
    var letters = /^[A-Za-z]+$/;  
    if(uid.value.match(letters))  
    {  
    return true;  
    }  
    else  
    {  
    alert('name connot be empty and must have alphabetic characters only');  
   uid.focus();  
    return false;  
    }  
    }


function allleTters(sname)
	{	
		var letters= /^[A-Za-z]+$/;
		if(sname.value.match(letters))
		{
			return true;
		}
		else 
		{
			alert('surname cannot be empty and must should have alphabetic characters only');
			sname.focus();
			return false;
		}
	}
function allgender(gender)
	{
		if(gender.value=="Default")
		{
			alert('select your gender');
			gender.focus();
			return false;
		}
		else
		{
			return true;
		}
	}
function allrace(racer)
	{
		if(racer.value=="Default")
		{
			alert('select your race');
			racer.focus();
			return false;
		}
		else
		{
			return true;
		}
	}
function allnumeric(iphone, my)
	{
		var numbers= /^[0-9]+$/; 
		if(iphone.value.match(numbers) && iphone.value.length==10)
		{
			return true;
		}
		else
		{
			alert('Please enter a valid phone number');
			iphone.focus();
			return falsse;
		}
	}

function validemail(uemail)
	{
		var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/; 
		if(uemail.value.match(mailformat))
		{
			return true;
		}
		else
		{
			alert('You have entered an invalid email address');
			uemail.focus();
			return false;
		}
	}
function allprovince(usprov)
	{
		if(usprov.value=="Default")
		{
			alert('select your province');
			usprov.focus();
			return false;
		}
		else
		{
			return true;
		}
	}
function allpostal(zip)  
    {   
    var numbers = /^[0-9]+$/;  
    if(zip.value.match(numbers) && zip.value.length==4)  
    {  
    return true;  
    }  
    else  
    {  
    alert('Postal code must have 4 numeric characters only');  
    zip.focus();  
     window.location.reload();
    return false;  
    }  
    }  

