<%@page import="com.user.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- <form action="getUser">
		Enter the username: <input type="text" name="uname" />
		<input type="submit" />
	</form> -->
	<%
		User u1 = (User) request.getAttribute("user");
	%>
	Username: <%= u1.getUname() %><br>
	Password: <%= u1.getPwd() %>
</body>
</html>