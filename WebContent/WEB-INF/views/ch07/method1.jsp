

<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
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
				
						
						<div class="sector">
					<h5>EL를 이용하여 스컬라 값 전달</h5>
					<div>
					<div>name: ${name}</div>
					<div>age: ${26}</div>
					<div>직업: ${인공지능개발자}</div>
							<a class="btn btn-info btn-sm" href="method1">데이터 전달</a></div>
						</div>
					</div>
				
						
						<div class="sector">
					<h5>객체 이용한 객체 전달</h5>
					<div>
					<div>번호: ${board1.no}</div>
					<div>제목: ${board1.title}</div>
					<div>내용: ${board1.content}</div>
					<div>직업: ${board1.writer}</div>
					<div>날짜: ${board1.date}</div>
							<a class="btn btn-info btn-sm" href="method1">데이터 전달</a></div>
						</div>
					</div>
					
						</div>
					</div>
					
				
					