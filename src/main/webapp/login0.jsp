<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <link href="/Finance/themes/bootstrap/css/bootstrap.min.css" rel="stylesheet">    
    <script src="/Finance/plugins/jquery-2.1.4.js"></script>
    <title>Login</title>
    <style>
    .form{
			margin: auto;
			padding: 200px 0 0 40px;
			width: 300px;
		}
    </style>
    <script type="text/javascript" language="javascript">
	    //初始化验证码
	    $(function(){
	    	setValidateCode();
	    });
	
	    //单击更换验证码
	    function changeImg(){
	    	setValidateCode();
	    };
	
	    function setValidateCode() {
	    	$('img#codefont').attr('src', 'randomnum?num=' + new Date().getTime());
	    }
    </script>
  </head>
  
  <body>
   <div class="container">
    <div>${message}</div>
  	<form class="form" action="/Finance/login_check" method="post"> 	
  	
	  <div class="form-login">
	    <label for="username">Username</label>
	    <input type="text" class="form-control" id="username" name='username' placeholder="Enter Username">
	  </div>
	  
	  <div class="form-login">
	    <label for="password">Password</label>
	    <input type="password" class="form-control" id="password" name='password' placeholder="Enter Password">
	  </div>	  
	  
	  <div class="form-login">		 
	  	<label for="code">Code</label> 
		<input type="text" class="form-control" id="verificationCode" name='verificationCode' placeholder="verificationCode" /> 
		<a id="randomnum" href="#" onclick="changeImg()"> 
			<img src="" id="codefont" width="68" height="27" alt="" /> 
		</a> 		
	  </div>
	
	  <div class="remember">
	    <label>
	      <input type="checkbox"> Remember me
	    </label>
	  </div>
	  
	  <button id="signin" type="submit" class="btn btn-default">Sign in</button>
	  
	</form>
	</div>
  </body>
</html>
