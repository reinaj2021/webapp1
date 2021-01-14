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
					<h5>model 객체를 이용한 스컬라 값 읽기</h5>
					<div>
							<a class="btn btn-info btn-sm" href="method1">데이터 전달</a></div>
						</div>
					</div>
						
						<div class="sector">
					<h5>model 객체를 이용한 데이터 전달</h5>
					<div>
							<a class="btn btn-info btn-sm" href="method1">데이터 전달</a></div>
						</div>
					</div>
						<div class="sector">
					<h5>Model 객체를 이용한 collection 이용</h5>
					<div>
							<a class="btn btn-info btn-sm" href="method1">데이터 전달</a></div>
						</div>
					</div>
						
					
						</div>
					</div>
					
					