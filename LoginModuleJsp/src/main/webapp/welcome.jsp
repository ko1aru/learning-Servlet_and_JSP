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
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");	
	
		if(session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	Welcome <%= session.getAttribute("username") %>
	<br>
	<a href="videos.jsp">Videos</a>
	<form action="getUser">
		Search user by username: <input type="text" name="uname" />
		<input type="submit" />
	</form>
	<form action="logout">
		<input type="submit" value="Logout">
	</form>
</body>
</html>