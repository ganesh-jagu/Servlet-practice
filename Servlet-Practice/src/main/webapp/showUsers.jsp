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
	// get user data
	users u = (users) request.getAttribute("user");
	if(u!=null)
	{
	 out.println("user ID:"+u.getUid()); 
	 out.println("\n user Name:"+u.getUname());
	 out.println("\n Cource:"+u.getCourse());
	}
	// showing User ID after insert
	users u2=(users) request.getAttribute("uid");
	if(u2!=null){		
	out.println("hey " +u2.getUname()+ " you are registerd successfully with ID: "+u2.getUid());
	}
%>
</body>
</html>