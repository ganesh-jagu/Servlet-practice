<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formating Tags</title>
</head>
<body>
<!--  setLocale -->
<fmt:setLocale value="te-in"/>
<!--  formatNumber -->
<br><fmt:formatNumber value="123456789.123" type="number" pattern="#,##,##.0"/>
<br><fmt:formatNumber value="123456789.123" type="currency" pattern="#,##,##.0" var="num"/>
<br><fmt:formatNumber value="0.75" type="percent"/>
<br> currancy: ${num}

<br><fmt:parseNumber var="number" value="123456789.123"/>
<br><fmt:formatNumber value="${number}" type="number" pattern="#,##.00"/>
<br> <fmt:formatNumber value="${number}" type="currency" />
<br> <fmt:formatNumber value="${number}" type="percent"/>

<!--  formateDate -->
<br>

<fmt:parseDate value="24-05-2006" pattern="dd-MM-yyyy" var="date"/>

 <fmt:formatDate value="${date}" pattern="dd/MMM/yyyy/EEE"/> 

<fmt:setTimeZone value="Asia/kolkata"/>
<br><fmt:formatDate value="${date}" pattern="HH-mm-ss"/>
</body>
</html>