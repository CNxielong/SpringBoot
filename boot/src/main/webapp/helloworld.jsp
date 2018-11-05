<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>pathVariable</h1>
<a href="${pageContext.request.contextPath}/pathVariable/bigsea" > name is bigsea </a>
<br/>
<a href="${pageContext.request.contextPath}/pathVariable/sea" > name is sea</a>
<br/>
<a href="requestParam?firstName=big&lastName=sea" > name is bigsea , age is 0 </a>
<br/>
<a href="requestParam?lastName=sea&age=23" > name is sea , age is 23 </a>
<br/>
<a href="requestParam" > throws exception </a>

</body>
</html>