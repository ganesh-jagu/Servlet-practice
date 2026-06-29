<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wellcome page</title>
</head>
<body>

<% 
	response.setHeader("cache-control","no-cache, no-store, must-revalidate"); // Http:1.1
	response.setHeader("pragma","no-cache");// Http: 1.0
	response.setHeader("Expires","0"); // Proxies 
	
	
	if(session.getAttribute("user")==null)
	{
		response.sendRedirect("loginPage.jsp");
	}
%>
<h3>Wellcome   ${user} </h3>
<a href="Images.jsp"> images </a> <br>
<a href="logout" > logout</a>
</body>
</html>