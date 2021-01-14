<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/main.css">
	</head>
	
	<body>
		<div class="wrap">
			<%--헤더 --%>
			<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
			<%--내용 --%>
			<div class="mainCenter">
				<jsp:include page="/WEB-INF/views/include/menu.jsp"></jsp:include>
				
				<div class="content">
				<div class="sector">
					<h5>컬렉션 이용하기</h5>
					
					<div>
					<table>
					<tr>
					<th>번호</th>
					<th>번호</th>
					<th>번호</th>
					<th>번호</th>
					<th>번호</th>
					<th>번호</th>
					</tr>
					
					
					
					<c;forEach var="Board" items="${BoardList }"> 
					<tr>
					<td>${board.no}</td>
					<td>${board.no}</td>
					<td>${board.no}</td>
					<td>${board.no}</td>
					<td>${board.no}</td>
					<td><fmt(formatDate value="${board.date}"pattern="yyyy--MM--dd/)></td>
					</tr>
					</c;forEach>
					
					
					
					
				</div> 
				
				
				</div>
				
				
			
				
					