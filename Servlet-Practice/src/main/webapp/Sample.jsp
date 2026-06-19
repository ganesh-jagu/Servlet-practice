<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sample JSP</title>
</head>
<body bgcolor="green" text="white" align="center">
 <%

            int num1=Integer.parseInt (request.getParameter("num-1"));
			int num2=Integer.parseInt (request.getParameter("num-2"));
			int num3=num1+num2;		
			out.println("Addition of "+num1+" & "+num2+" is "+num3);
			
			 %>
</body>
</html>