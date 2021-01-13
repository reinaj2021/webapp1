
<%--import 속성 --%>
<%@page import ="java.util.*, java.text.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	    <link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/main.css" />
	</head>

	<body>
		<div class="wrap">
			<%-- header --%>
			<jsp:include page="/WEB-INF/views/include/header.jsp"/>
			<%-- <%@ include file="/WEB-INF/views/include/header.jsp"%> --%>
			
			<%-- 내용 --%>
			<div class="mainCenter">
			<jsp:include page="/WEB-INF/views/include/menu.jsp"/>
			</div>
			
			<div class="content">
				<div class="sector">
					<h5>개발 환경 구축</h5>
					<div>교재 참고하여 1장 진행하기</div>
				</div>

				<div class="sector">
					<h5>개발 환경 구축</h5>
					<div>교재 참고하여 1장 진행하기</div>
				</div>

				<div class="sector">
					<h5>개발 환경 구축</h5>
					<div>교재 참고하여 1장 진행하기</div>
				</div>
				
			</div>
			
		</div>
		
		
	</body>
	
</html>