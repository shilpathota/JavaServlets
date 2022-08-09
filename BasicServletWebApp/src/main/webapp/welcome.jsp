<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<%
		
		System.out.println("Welcome "+session.getAttribute("username"));
		if(session.getAttribute("username")== null){
			response.sendRedirect("Login.jsp");
		}
	%>
	
	Welcome ${username}
	<a href="videos.jsp" value="Videos"/>
</body>
</html>