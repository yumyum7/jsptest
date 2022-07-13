<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	브라우저와 웹 서버의 정보를 알아내는 JSP
	<hr>
	컨텍스트패스 : <%= request.getContextPath()%> 
	<br>
	요청한 URL : <%= request.getRequestURL() %>
	<br>
	요청한 URI : <%= request.getRequestURI() %>
</body>
</html>