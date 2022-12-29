<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
* {
	padding: 0;
	margin: 0;
	
}

.nav {
	padding: 20px;
	background-color: black;
	color: white;
}
</style>
</head>
<body>

	<div class="nav">

		<h1>Hi todays date and time is</h1>
		<%=new Date()%>


	</div>
</body>
</html>