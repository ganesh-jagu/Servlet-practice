<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	response.setHeader("cache-control","no-cache, no-store, must-revalidate");//Http:1.1 (Presently we are using this)
	response.setHeader("pragma","no-cache");// Http: 1.0
	response.setHeader("Expires","0"); // Proxies 

	if(session.getAttribute("user")==null)
	{
		response.sendRedirect("loginPage.jsp");
	}
%>
Here have your profile
<iframe width="560" height="315" src="https://www.youtube.com/embed/gQLQ0t9B5yk?si=LU8BliRIidIN3xz5" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
</body>
</html>