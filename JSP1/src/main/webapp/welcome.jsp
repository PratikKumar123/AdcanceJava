<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome </title>
</head>
<body>


<%@include file="nav.jsp" %>
	<%
	String name = request.getParameter("uname");
	out.println("HII "+name);
	String title = config.getInitParameter("title");
	out.println("title is " +title);
	
	
	String f = application.getInitParameter("fullname");
	out.println("Full name is :"+f);
	%>
	
	<%! int a =10;
		int b = 2;
	
	
	%>
	<% int r = a/b; %>
	<h1>Division is  <%= r %></h1>
</body>
</html>