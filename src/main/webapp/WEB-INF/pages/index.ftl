
<html>
<head>
<title>主页</title>
<link rel="stylesheet" type="text/css" href="/Finance/themes/easyui/default/easyui.css">
<link rel="stylesheet" type="text/css" href="/Finance/themes/easyui/icon.css"> 

<script type="text/javascript" src="/Finance/plugins/jquery-2.1.4.js"></script>
<script type="text/javascript" src="/Finance/plugins/jquery.easyui.min.js"></script>

<style>
*{
	font-size:12px;
}
body {
    font-family:verdana,helvetica,arial,sans-serif;
    padding:20px;
    font-size:12px;
    margin:0;
}
h2 {
    font-size:18px;
    font-weight:bold;
    margin:0;
    margin-bottom:15px;
}
.demo-info{
	padding:0 0 12px 0;
}
.demo-tip{
	display:none;
}
.panel-header11 {
  background-color: #E0ECFF;
  background: -webkit-linear-gradient(top,#EFF5FF 0,#E0ECFF 100%);
  background: -moz-linear-gradient(top,#EFF5FF 0,#E0ECFF 100%);
  background: -o-linear-gradient(top,#EFF5FF 0,#E0ECFF 100%);
  background: linear-gradient(to bottom,#EFF5FF 0,#E0ECFF 100%);
  background-repeat: repeat-x;
  filter: progid:DXImageTransform.Microsoft.gradient(startColorstr=#EFF5FF,endColorstr=#E0ECFF,GradientType=0);
}
</style>
<script>
	function addTab(title, url){
		if ($('#tt').tabs('exists', title)){
			$('#tt').tabs('select', title);
		} else {
			var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
			$('#tt').tabs('add',{
				title:title,
				content:content,
				closable:true
			});
		}
	}
</script>
</head>

<body class="easyui-layout">
	<div data-options="region:'north',collapsible:false" style="height:33px;overflow:visible;">
		<div class='panel-header11' style="width:100%;height:30px;border-bottom: 1px solid #E6EEF8;text-align: left;">
			${munehtml}
		</div>				
	</div>
	<div data-options="region:'west',split:true,title:'West'" style="width:150px;padding:10px;">west content</div>
	<div data-options="region:'center',border:false" style="overflow:hidden">
		<div id="tt" class="easyui-tabs" data-options="fit:true">
		<div title="主页"> </div>
		</div>
	</div>
	</div>
</body>


</html>
