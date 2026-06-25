<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core Tags</title>
</head>
<body>
<!--  out -->
<c:out value="Jai Bal Ganesh"/>
</br>
<!--  set -->
<c:set var="marks" value="${500}" scope="session"/>
<c:set var="marks" value="${550}" scope="request"/>
<c:set var="marks" value="${450}" scope="page"/>
<c:set var="marks" value="${600}" scope="application"/>
<c:set var="collage" value="Aditya" scope="page"/>
Collage: <c:out value="${collage}" /> </br>
<!--  Remove -->
<c:remove var="marks" scope="page"/>
<c:remove var="marks" scope="application"/>
 <c:remove var="collage" scope="request"/>  
Collage: <c:out value="${requestScope.collage}" /> </br>
Session marks:<c:out value=" ${sessionScope.marks}"/> </br>
Page marks:<c:out value=" ${pageScope.marks}"/> </br>
application marks:<c:out value="${applicationScope.marks}"/> </br>
request marks:<c:out value="${requestScope.marks}"/>


</br>
<c:set var="school" value="ZPHS High School" />
 <c:remove var="school"/>
<c:out value="${school}"/>

<!-- If --> IF tag </br>
<c:if test="${20>5}">
Condition True
</c:if>
</br>
<c:if test="${5<45}" var="result">
Answer is: ${result}
</c:if>
</br>

<c:set var="age" value="20"/>

<c:if test="${age >= 18}">
Adult
</c:if>
<c:if test="${age < 18}">
Miner
</c:if>

<!--  Choose, when, otherwise --> </br>
<c:set var="mar" value="499"/>
<c:choose>
	<c:when test="${mar > 900 }">
	A grade
	</c:when>
	<c:when test="${mar >750 }">
	B Grade
	</c:when>
	<c:when test="${mar >= 500}">
	C Grade
	</c:when>
	<c:otherwise>
	Nuvvu Exam Rasi Bokka
	</c:otherwise>
</c:choose>
<!-- forEach --></br>
<c:forEach begin="0" end="5" var="j">
<c:out value="${j}"/></br>
</c:forEach>

<c:forEach items="${cources}" var="crs">
${crs} </br>
</c:forEach>
<!-- forTokens -->
<c:forTokens items="bed,bedsheet,pillow,towel,charger, mobile,fan,rain" delims="," begin="1" end="5" step="2" var="var">
${var} </br>
</c:forTokens>
<!--  catch -->
<c:catch var="err">
<%
// int a=10/0; 
	int b[]= {4,5,6,3,5,7,6};
	out.println(b[20]);
%>
</c:catch>
${err} 

<!--  URL 
<c:url value="https://www.youtube.com/watch?v=gtw2T55VXQQ&list=RDFyj5wbzRPC8&index=4" var="youtube"/>
</br><a href="${youtube}" > youtube </a>
<c:url value="HeadderPart.jsp" var="headder"/> 
</br> <a href="${headder}"> heddar </a>

<c:url value="headderPart.jsp" var="values">
	<c:param name="user" value="Nani"/>
</c:url>
</br> <a href="${values}"> values </a>  -->
</body>
</html>