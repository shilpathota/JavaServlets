<%@page import ="com.servletmavenapplication.model.Alien" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Alien Data</title>
</head>
<body>
 <%
 	Alien al = (Alien)request.getAttribute("alien");
 	out.println(al);
 %>
</body>
</html>