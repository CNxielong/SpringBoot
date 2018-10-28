<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>部门列表</h1>
	<table>
		<c:forEach items="${deptList}" var="dept">
		<td>DNO:${dept.dno}</td>
		<td>DNAME:${dept.dname}</td>
		<td>DCITY:${dept.dcity}</td>
		<td><a href="delete.do?dno=${dept.dno}">删除当前的部门</a></td><tr>
<%-- 		<td><a href="http://localhost:8888/delete.do?dno=${dept.dno}">删除当前的部门</a></td><tr> --%>
		</c:forEach>
	</table>
</body>
</html>