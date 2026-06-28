<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Functions in JSTL</title>
</head>
<body>
<c:set var="str" value="Jai bal Ganesh"/>

length: ${fn:length(str)}

<c:if test="${fn:startsWith(str,Jai)}"><br>
yes it is start with jai
</c:if>

<c:if test="${fn:endsWith(str,Ganesh)}"><br>
yes it is ends with Ganesh
</c:if>
<br>
To Lower: ${fn:toLowerCase(str)}<br>
To Upper: ${fn:toUpperCase(str)} <br>

<c:if test="${fn:contains(str, 'Ganesh')}">
yes the Word Ganesh is exist
</c:if>
</body>
</html>