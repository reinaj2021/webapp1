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
			<%-- 아래와 같은 방법은 복사 붙여넣기라서 동일한 내용이 있으면 에러가 난다.
			<%@ include file="/WEB-INF/views/include/header.jsp" %> --%>
			
			<%--내용 --%>
			<div class="mainCenter">
				<jsp:include page="/WEB-INF/views/include/menu.jsp"></jsp:include>
				
				<div class="content">
					<div class="sector">
						<h5>Request Mapping</h5>
						<div>
							GET 방식: <a class = "btn btn-info btn-sm" href="getMethod">request1</a> <%-- get 방식 --%>
							<br /><br />
							POST 방식: <form method="post" action="postMethod" style="display:inline-block;"> <%-- post 방식 --%>
								<button class = "btn btn-info btn-sm">request1</button>
							</form> 
						</div>
					</div>
					
						<div class="sector">
						<h5>요청방식 별 회원가입 처리</h5>
						<div>
							GET 방식: <a class = "btn btn-info btn-sm" 
										href="signUp">회원가입</a> <%-- get 방식 --%>
							<br /><br />
						</div>
						
						<div>
							<h5>비동기 처리</h5>
							<div>
								GET 방식: <a class="btn btn-info btn-sm" href="javascript:fun1()">회원가입</a>
								<script>
									function fun1() {
									    $.ajax({
									        url: "joinAsync",
									        method: "get",
									        success: function(data) {
									            console.log(data);
									            $("#joinForm").html(data);
									        }
									    });
									};
								</script>
								<div id="joinForm" style="margin-top: 50px;"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>