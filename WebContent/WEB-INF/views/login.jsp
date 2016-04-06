<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>login page</title>
		<style type="text/css">
			.height{ width:100%;height:98%;/* background-image: url(../images/OnePiece1.png);background-repeat: repeat; */  }
			.ontPointThree{ height:300px; }
		</style>
		<script type="text/javascript">
			function login(){
				var username = $("#userName").val();
				var password = $("#password").val();
				//var formArray = $("#form").serializeArray();
				$.ajax({
				   type: "POST",
				   url: "${ctx}/login/login.do",
				   data: "username="+username+"&password="+password,
				   //date: formArray,
				   success: function(msg){
				     if(msg=="true"){
				    	 alert("查有此人");
				     }else{
				    	 alert("查无此人");
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
				    <input type="text" class="form-control" id="userName" placeholder="userName">
				  </div>
				  <div class="form-group">
				    <label for="password">Password</label>
				    <input type="password" class="form-control" id="password" placeholder="Password">
				  </div>
				  <button type="button" class="btn btn-default" onclick="login()" >login</button>
				  <a type="button" class="btn btn-default" href="${ctx}/login/initRegister.do">register</a>
			  	</div>
			  </div>
			</div>
		</form>
	</body>
</html>
