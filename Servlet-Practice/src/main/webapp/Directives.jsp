<%@page import="addnumber.TempValues"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Directives</title>
</head>
<body>
<!--  Page Directives -->
<%@ page import="java.util.*, java.io.*" %> 
<%@ page import="addnumber.TempValues" %>
<%@ page session="false" %>

<!--  include Directives -->
<%@ include file="HeadderPart.jsp" %>

<!--  taglib Directive but which is not use, it required some tag contaned packages or urls -->

<h2> This is Body part </h2>
<%! 
TempValues tmp=new TempValues();
	int x=tmp.a;
	int y=tmp.b;
	int z=x+y;
%>
<% out.println("Addition of "+x+" & "+y+"is :"+z); %>
</body>
</html>