<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>Home page</h1>

	<%
	String name = (String) request.getAttribute("name");
	List<String> s = (List<String>) request.getAttribute("f");
	%>
	<%=name%>

	<%
	for (String s1 : s) {
	%>

	<h1><%=s1%></h1>
	<%
	}
	%>
</body>
</html>