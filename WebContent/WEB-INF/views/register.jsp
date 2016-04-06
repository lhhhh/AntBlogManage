<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Register Page</title>
		<script type="text/javascript">
		
			$(function(){
				$('[data-toggle="popover"]').popover();
				
				$("#userName").blur(function(){
					if($(this).val()==""){
						alert("userName不能为空!!");
					}
				})	
				$("#password").blur(function(){
					if($(this).val()==""){
						alert("password不能为空!!");
					}
				})	
				$("#email").blur(function(){
					if($(this).val()==""){
						alert("email不能为空!!");
					}
				})	
			})
		
			function register(){
				var username = $("#userName").val();
				var password = $("#password").val();
				var password = $("#password").val();
				$.ajax({
				   type: "POST",
				   url: "${ctx}/login/register.do",
				   data: "username="+username+"&password="+password+"&email="+email,
				   success: function(msg){
				     if(msg=="true"){
				    	 alert("注册成功");
				     }else{
				    	 alert("注册失败");
				     }
				   }
				});
			}
		</script>
	</head>
	<body>
		<form id="form">
			<div class="row height">
			  <div class="col-md-8">此处应有背景图片</div>
			  <div class="col-md-4">
			  	<div class="ontPointThree"/>
			  	<div>
	  			  <div class="form-group">
				    <label for="userName">userName</label>
				    <input type="text" class="form-control" id="userName" placeholder="userName"
				     data-container="body" data-toggle="popover" data-placement="left" data-content="username填写错误!!"/>
				  </div>
				  <div class="form-group">
				    <label for="password">Password</label>
				    <input type="password" class="form-control" id="password" placeholder="Password">
				  </div>
				  <div class="form-group">
				    <label for="email">Email</label>
				    <input type="text" class="form-control" id="email" placeholder="Email">
				  </div>
				  <button type="button" class="btn btn-default" onclick="register()" >register</button>
			  	</div>
			  </div>
			</div>
		</form>
	</body>
</html>