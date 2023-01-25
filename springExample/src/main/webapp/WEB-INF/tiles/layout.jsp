<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title><tile:insertAttribute name="title" ignore="true" /></title>

</head>
<body>
	<center>
		<div>
			<div style="background-color: #f8c471">
				<tile:insertAttribute name="header" />
			</div>
			<div
				style="float: left; width: 15%; height: 450%; background-color: #C39BD3">
				<tile:insertAttribute name="menu" />
			</div>

			<div
				style="float: left; width: 85%; height: 450%; background-color: #76D7C4">
				<tile:insertAttribute name="body" />
			</div>

			<div style="clear: both;">
				<tile:insertAttribute name="footer" />
			</div>
		</div>
	</center>
</body>
</html>