<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Directive Tag for importing  -->

<!--  %@ import="import java.util.scanner" %>   -->

<!--  declaration tag for creating variables-->
<%! int a= 5; %>

<!--  Scriptlet tag -->
<% int b=a*a; %>

<!-- Expression tag -->
value is : <%= a %>
<br>
quare is : <%= b %>

</body>

</html>