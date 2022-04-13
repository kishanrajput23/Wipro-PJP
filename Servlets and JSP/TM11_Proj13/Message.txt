<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Status</title>
</head>
<body onload="redirect();">
	<script>
		function redirect(){
		alert("Invalid Credentials");
		setTimeout(homePage, 1000);
		}
		function homePage()
		{
			window.location.href="./Home.html";
		}
	</script>
</body>
</html>