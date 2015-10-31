<div id="menu"></div>
<script src="/Finance/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script>
//查询菜单信息
$(function(){ 
	$.ajax({	   
	   type: 'get',
	   url:'/Finance/menu',
	   success: function(data) {		       	   
	       $('#menu').append(data)  
	    }
	   
	}); 
});
</script>