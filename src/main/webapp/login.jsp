<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="UTF-8"/>
<title>登录</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
<meta content="" name="description"/>
<meta content="" name="author"/>
<!-- BEGIN GLOBAL MANDATORY STYLES -->

<link href="/Finance/assets/global/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link href="/Finance/assets/global/css/simple-line-icons.min.css" rel="stylesheet" type="text/css"/>
<link href="/Finance/assets/global/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="/Finance/assets/global/css/uniform.default.min.css" rel="stylesheet" type="text/css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link href="/Finance/assets/admin/pages/css/login.css" rel="stylesheet" type="text/css"/>
<!-- END PAGE LEVEL SCRIPTS -->
<!-- BEGIN THEME STYLES -->
<link href="/Finance/assets/global/css/components-rounded.css" id="style_components-rounded" rel="stylesheet" type="text/css"/>
<link href="/Finance/assets/global/css/plugins.css" rel="stylesheet" type="text/css"/>
<link href="/Finance/assets/admin/layout/css/layout.css" rel="stylesheet" type="text/css"/>
<link href="/Finance/assets/admin/layout/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
<link href="/Finance/assets/admin/layout/css/custom.css" rel="stylesheet" type="text/css"/>
<!-- END THEME STYLES -->
<link rel="shortcut icon" href="favicon.ico"/>
<script src="/Finance/assets/global/plugins/jquery-2.1.4.js" type="text/javascript"></script>
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
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="login">
<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
<div class="menu-toggler sidebar-toggler">
</div>
<!-- END SIDEBAR TOGGLER BUTTON -->
<!-- BEGIN LOGO -->
<div class="logo">
	<a href="index.html">
	<img src="/Finance/assets/admin/layout/img/logo-big.png" alt=""/>
	</a>
</div>
<!-- END LOGO -->
<!-- BEGIN LOGIN -->
<div class="content">
	<!-- BEGIN LOGIN FORM -->
	<form class="login-form" action="/Finance/login_check" method="post">
		<h3 class="form-title">登录</h3>
		<div class="alert alert-danger display-hide">
			<button class="close" data-close="alert"></button>
			<span>
			请输入用户名和密码： </span>
		</div>
		<div class="form-group">
			<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
			<label class="control-label visible-ie8 visible-ie9">username</label>
			<input class="form-control form-control-solid placeholder-no-fix" type="text" autocomplete="off" placeholder="用户名" name="username"/>
		</div>
		<div class="form-group">
			<label class="control-label visible-ie8 visible-ie9">password</label>
			<input class="form-control form-control-solid placeholder-no-fix" type="password" autocomplete="off" placeholder="密码" name="password"/>
		</div>
		<div class="form-actions">
			<button type="submit" class="btn btn-success uppercase">登录</button>
			<label class="rememberme check">
			<input type="checkbox" name="remember" value="1"/>记住我 </label>
			<a href="javascript:;" id="forget-password" class="forget-password">忘记密码？</a>
		</div>
		
		<div class="create-account">
			<p>
				<a href="javascript:;" id="register-btn" class="uppercase">创建新账号</a>
			</p>
		</div>
	</form>
	<!-- END LOGIN FORM -->
	<!-- BEGIN FORGOT PASSWORD FORM -->
	<form class="forget-form" action="index.html" method="post">
		<h3>忘记密码？</h3>
		<p>
			 请输入您的邮箱地址重置密码。
		</p>
		<div class="form-group">
			<input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="邮箱地址" name="email"/>
		</div>
		<div class="form-actions">
			<button type="button" id="back-btn" class="btn btn-default">返回</button>
			<button type="submit" class="btn btn-success uppercase pull-right">提交</button>
		</div>
	</form>
	<!-- END FORGOT PASSWORD FORM -->
	<!-- BEGIN REGISTRATION FORM -->
	<form class="register-form" action="index.html" method="post">
		<h3>注册</h3>
		<p class="hint">
			 请在下面填写您的个人信息：
		</p>
		<div class="form-group">
			<label class="control-label visible-ie8 visible-ie9">Full Name</label>
			<input class="form-control placeholder-no-fix" type="text" placeholder="姓名" name="fullname"/>
		</div>
		<div class="form-group">
			<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
			<label class="control-label visible-ie8 visible-ie9">Email</label>
			<input class="form-control placeholder-no-fix" type="text" placeholder="邮箱" name="email"/>
		</div>		
		
		<p class="hint">
			 请在下面填写您的账号信息：
		</p>
		<div class="form-group">
			<label class="control-label visible-ie8 visible-ie9">Username</label>
			<input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="用户名" name="username"/>
		</div>
		<div class="form-group">
			<label class="control-label visible-ie8 visible-ie9">Password</label>
			<input class="form-control placeholder-no-fix" type="password" autocomplete="off" id="register_password" placeholder="登录密码" name="password"/>
		</div>
		<div class="form-group">
			<label class="control-label visible-ie8 visible-ie9">Re-type Your Password</label>
			<input class="form-control placeholder-no-fix" type="password" autocomplete="off" placeholder="请再次输入密码" name="rpassword"/>
		</div>
		<!--  
		<div class="form-group margin-top-20 margin-bottom-20">
			<label class="check">
			<input type="checkbox" name="tnc"/> I agree to the <a href="#">
			Terms of Service </a>
			& <a href="#">
			Privacy Policy </a>
			</label>
			<div id="register_tnc_error">
			</div>
		</div>
		-->
		<div class="form-actions">
			<button type="button" id="register-back-btn" class="btn btn-default">返回</button>
			<button type="submit" id="register-submit-btn" class="btn btn-success uppercase pull-right">提交</button>
		</div>
	</form>
	<!-- END REGISTRATION FORM -->
</div>
<div class="copyright">
	 2015 @ created by sdyang
</div>
<!-- END LOGIN -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="/Finance/assets/global/plugins/respond.min.js"></script>
<script src="/Finance/assets/global/plugins/excanvas.min.js"></script> 
<![endif]-->

<script src="/Finance/assets/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
<script src="/Finance/assets/global/plugins/bootstrap.min.js" type="text/javascript"></script>
<script src="/Finance/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="/Finance/assets/global/plugins/jquery.cokie.min.js" type="text/javascript"></script>
<script src="/Finance/assets/global/plugins/jquery.uniform.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="/Finance/assets/global/plugins/jquery.validate.min.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="/Finance/assets/global/scripts/metronic.js" type="text/javascript"></script>
<script src="/Finance/assets/admin/layout/scripts/layout.js" type="text/javascript"></script>
<script src="/Finance/assets/admin/layout/scripts/demo.js" type="text/javascript"></script>
<script src="/Finance/assets/admin/pages/scripts/login.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script>
jQuery(document).ready(function() {     
	Metronic.init(); // init metronic core components
	Layout.init(); // init current layout
	Login.init();
	Demo.init();
});
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>