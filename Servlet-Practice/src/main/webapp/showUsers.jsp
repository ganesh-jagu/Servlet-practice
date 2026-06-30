<%@page import="UsersData.users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users data</title>
</head>
<body>
<% 	
	users u = (users) request.getAttribute("user");
	out.println(u);
%>
</body>
</html>