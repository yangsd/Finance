<!DOCTYPE html>
<html lang="en">
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8"/>
<title>Metronic | Pages - Lock Screen 1</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<meta content="" name="description"/>
<meta content="" name="author"/>
<!-- BEGIN GLOBAL MANDATORY STYLES -->

<link href="/Finance/assets/global/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link href="/Finance/assets/global/css/simple-line-icons.min.css" rel="stylesheet" type="text/css"/>
<link href="/Finance/assets/global/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="/Finance/assets/global/css/uniform.default.min.css" rel="stylesheet" type="text/css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link href="/Finance/assets/admin/pages/css/lock.css" rel="stylesheet" type="text/css"/>
<!-- END PAGE LEVEL STYLES -->
<!-- BEGIN THEME STYLES -->
<link href="/Finance/assets/global/css/components-rounded.css" id="style_components-rounded" rel="stylesheet" type="text/css"/>
<link href="/Finance/assets/global/css/plugins.css" rel="stylesheet" type="text/css"/>
<link href="/Finance/assets/admin/layout/css/layout.css" rel="stylesheet" type="text/css"/>
<link href="/Finance/assets/admin/layout/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
<link href="/Finance/assets/admin/layout/css/custom.css" rel="stylesheet" type="text/css"/>
<!-- END THEME STYLES -->
<link rel="shortcut icon" href="favicon.ico"/>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body>
<div class="page-lock">
	<div class="page-logo">
		<a class="brand" href="index.html">
		<img src="/Finance/assets/admin/layout/img/logo-big.png" alt="logo"/>
		</a>
	</div>
	<div class="page-body">
		<div class="lock-head">
			 Locked
		</div>
		<div class="lock-body">
			<div class="pull-left lock-avatar-block">
				<img src="/Finance/assets/admin/pages/media/profile/photo3.jpg" class="lock-avatar">
			</div>
			<form class="lock-form pull-left" action="/Finance/login_check" method="post">
				<h4>Admin</h4>
				<div class="form-group">
					<input  type="text" name="username" value="admin" style="display:none;"/>				
					<input class="form-control placeholder-no-fix" type="password" autocomplete="off" placeholder="Password" name="password"/>
				</div>
				<div class="form-actions">
					<button type="submit" class="btn btn-success uppercase">Login</button>
				</div>
			</form>
		</div>
		<div class="lock-bottom">
			<a href="/Finance/login">Not Amanda Smith?</a>
		</div>
	</div>
	<div class="page-footer-custom">
		 2014 &copy; Metronic. Admin Dashboard Template.
	</div>
</div>
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="/Finance/assets/global/plugins/respond.min.js"></script>
<script src="/Finance/assets/global/plugins/excanvas.min.js"></script> 
<![endif]-->
<script src="/Finance/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="/Finance/assets/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
<script src="/Finance/assets/global/plugins/bootstrap.min.js" type="text/javascript"></script>
<script src="/Finance/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="/Finance/assets/global/plugins/jquery.uniform.min.js" type="text/javascript"></script>
<script src="/Finance/assets/global/plugins/jquery.cokie.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="/Finance/assets/global/plugins/jquery.backstretch.min.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<script src="/Finance/assets/global/scripts/metronic.js" type="text/javascript"></script>
<script src="/Finance/assets/admin/layout/scripts/demo.js" type="text/javascript"></script>
<script src="/Finance/assets/admin/layout/scripts/layout.js" type="text/javascript"></script>
<script>
jQuery(document).ready(function() {    
	Metronic.init(); // init metronic core components
	Layout.init(); // init current layout
	Demo.init();
});
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>