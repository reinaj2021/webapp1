<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="mainHeader">
	<h3>Spring traningCamp</h3>
	<div class="loginBox" style="box-sizing:border-box;">
		<img src="<%=application.getContextPath()%>/resources/img/my.png" class="rounded-circle" width="40px" style="display:none;">
		<button id="logIn" class="btn btn-info btn-sm" onclick="logInout()">로그인</button>
		<button id="logOut" class="btn btn-danger btn-sm" onclick="logInout()">로그아웃</button>
	</div>
	
	<script>
		const logInout = () => {
		    $("#logIn").click(()=>{
		      $("img.rounded-circle").show();
		    });
	
			$("#logOut").click(()=>{
			    $("img.rounded-circle").hide();
			});
		}
		
	</script>
	
</div>