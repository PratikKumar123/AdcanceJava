<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function here</title>
</head>
<body>
	<c:set var="String" value="Pratik here" />
	<c:set var="String2" value="second String."/>

	<c:if test="${fn:contains(String, 'here')}">
		<p>Found here string
	</c:if>

	<c:if test="${fn:containsIgnoreCase(String, 'HERE')}">
		<p>Found HERE string
	</c:if>

	<c:if test="${fn:endsWith(String, 'here')}">
		<p>String ends with here
	</c:if>
	
	
<p>Index of string 1 : ${fn:indexOf(String, "here")}</p>
<p>String 2 Length is : ${fn:length(String2)}</p>  


</body>
</html>