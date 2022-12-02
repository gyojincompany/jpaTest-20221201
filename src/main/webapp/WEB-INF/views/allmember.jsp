<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	[모든 회원 정보]
	<hr>
	학번 / 이름 / 나이 / 학년 / 비고 <br>  
	<c:forEach items="${allMember}" var="dto">		
		${dto.hakbun } / ${dto.name } / ${dto.age } / ${dto.grade } / ${dto.etc }  
		<br>
	</c:forEach>
</body>
</html>