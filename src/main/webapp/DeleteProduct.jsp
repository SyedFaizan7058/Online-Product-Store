<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DeleteProfile</title>
</head>
<body>

	<%
	String msg = (String) request.getAttribute("msg");
	out.println(msg + "<br>");
	%>

	<%@include file="ViewAllProducts.jsp"%>

</body>
</html>