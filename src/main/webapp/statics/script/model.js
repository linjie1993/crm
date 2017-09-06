$(document).ready(function(){
	
	$(function(){
		var id = $("#rid").val();
		if(id==""||id==null){
			location.href = "login.jsp";
		}else{
			xianshi(parseInt(id));
		}
	});
	function xianshi(id){
		switch (id) {
		case 1:
			$("#sale").show();
			$("#customer").show();
			break;
		case 2:
			alert("该用户没有访问权限！");
			location.href = "login.jsp";
			break;
		case 3:
			$("#sale").show();
			$("#customer").show();
			$("#service").show();
			$("#tongji").show();
			$("#base").show();
			$("#right").show();
			break;
		case 4:
			$("#sale").show();
			$("#customer").show();
			$("#service").show();
			$("#tongji").show();
			$("#base").show();
			$("#right").show();
			break;
		default:
			alert("该用户没有访问权限！");
			location.href = "login.jsp";
			break;
		}
	}
});