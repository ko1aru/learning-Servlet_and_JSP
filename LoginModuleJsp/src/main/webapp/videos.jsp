<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Videos</title>
</head>
<body>
	<% 
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("username")==null) response.sendRedirect("login"); 
	%>
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/OuBUUkQfBYM?si=8VHO6bcV2P2Ydywh" title="Servlet & JSP Tutorial - Full Course" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe><br>
	<a href=https://www.youtube.com/watch?v=OuBUUkQfBYM&list=PLsyeobzWxl7pSqMzPF_SlvQ0IdcGA-XI2&index=3>Servlet & JSP Tutorial - Full Course</a>
</body>
</html>