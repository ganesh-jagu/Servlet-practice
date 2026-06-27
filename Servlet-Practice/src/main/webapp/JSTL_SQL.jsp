<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL_SQL</title>
</head>
<body>
<!-- data source for configuration -->
<sql:setDataSource 
driver="com.mysql.cj.jdbc.Driver"
url="jdbc:mysql://localhost:3306/jstl"
user="root"
password="root"
var="db"/>

<!--  query for select statement -->
<sql:query var="result" dataSource="${db}"> select * from jstlEx </sql:query>
Result: ${result} <br>
row count: ${result.rowCount} 
<br>

<c:forEach items="${result.rows}" var="var" >
${var.id} - ${var.name} - ${var.cource} <br>
</c:forEach>

<!--  update for insert, delete, update -->
<%-- <!--  insert -->
<sql:update dataSource="${db}" var="count"> 
insert into jstlEx values(3,'Sai','English')
</sql:update>
Rows added: ${count} 
 --%>
<%-- 
 <!-- update  -->
 
<sql:update var="num" dataSource="${db}"> update jstlEx set cource='Telugu' where name='sai' </sql:update>
Rows Effected: ${num}
	<!--  delete  -->
<sql:update dataSource="${db}" var="del" > 
delete from jstlEx where id=3 
</sql:update>
<br>Rows deleted: ${del} <br>

<sql:query var="result" dataSource="${db}"> select * from jstlEx </sql:query>
row count: ${result.rowCount} 
<br>

<c:forEach items="${result.rows}" var="var" >
${var.id} - ${var.name} - ${var.cource} <br>
</c:forEach>
--%>
<!--  param -->
<sql:query var="user" dataSource="${db}"> 
select * from jstlEx where id=? 
<sql:param value="2"/>
</sql:query> 
<br> 
<c:forEach var="use" items="${user.rows}">
ID: ${use.id} - name: ${use.name} 
</c:forEach>
</body>
</html>