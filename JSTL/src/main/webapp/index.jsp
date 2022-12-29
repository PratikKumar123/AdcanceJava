<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>welcome jstl</h1>
	<c:set  var="p" value="30" scope="application"></c:set>
	<c:out value="${p}"></c:out>
	
	<c:remove var="p"/>
	<c:out value="${p}">removed</c:out>
	<hr>
	
	<c:set  var="i" value="300" scope="application"></c:set>
	<c:out value="${i}"></c:out>
	
	
	
	 <c:set var = "salary" scope = "session" value = "400"/>
      <p>Your salary is : <c:out value = "${salary}"/></p>
      <c:choose>
         
         <c:when test = "${salary < 401}">
            Salary is very low
         </c:when>
         
         <c:when test = "${salary >= 500}">
            Salary is very good.
         </c:when>
         
         <c:otherwise>
            No comment
         </c:otherwise>
      </c:choose>
	
	<c:forEach var="k" begin="1" end="5">
	
	<h1> Value of k is <c:out value="${k }"></c:out> </h1>
	</c:forEach>
	
	<!--<c:redirect url=""></c:redirect> -->
	
	
	
</body>
</html>