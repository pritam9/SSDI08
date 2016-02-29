/**
 * 
 */
var attempt = 3; // Variable to count number of attempts.
// Below function Executes on click of login button.
function validate(){
var username = document.getElementById("username").value;
var password = document.getElementById("password").value;
document.getElementById("username").style.borderColor="#ccc";
document.getElementById("password").style.borderColor="#ccc";
if(username==""){
	document.getElementById("username").focus();
	document.getElementById("username").style.borderColor="red";
	document.getElementById("username").style.style.borderStyle="solid";
}
else if(password==""){
	document.getElementById("password").focus();
	document.getElementById("password").style.borderColor="red";
	document.getElementById("password").style.style.borderStyle="solid";
}
else if ( username == "test" && password == "test123"){
alert ("Login successfully");
window.location.href="login.do";
//window.location = "success.html"; // Redirecting to other page.
return false;
}
else{
attempt --;// Decrementing by one.
alert("You have left "+attempt+" attempt;");
// Disabling fields after 3 attempts.
if( attempt == 0){
return false;
}
}
}