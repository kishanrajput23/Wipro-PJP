<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<div style="text-align:center">
		<h1>Welcome <%=request.getAttribute("name") %></h1>
		<a href="./Home.html">Back to Home</a>
	</div>
</body>
</html>