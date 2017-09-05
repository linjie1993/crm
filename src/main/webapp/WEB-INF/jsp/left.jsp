<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'left.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/font-awesome.min.css" rel="stylesheet">

<link rel="stylesheet" href="css/style.css" media="screen"
	type="text/css" />
<script src='js/jquery-1.8.3.js'></script>

<script src="js/index.js"></script>
<script type="text/javascript">
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
</script>
</head>

<body>
	<input id="rid" type="hidden" value="${user.URId}"/>
	<ul id="accordion" class="accordion">
		<li id="sale" style="display: none;">
			<div class="link">
				<i class="fa fa-mobile"></i>营销管理<i class="fa fa-chevron-down"></i>
			</div>
			<ul class="submenu">
				<li><a href="sale_list.action" target="show">销售机会管理</a></li>
				<li><a href="sale_dev.action" target="show">客户开发计划</a></li>
			</ul>
		</li>
		<li id="customer" style="display: none;">
			<div class="link">
				<i class="fa fa-mobile"></i>客户管理<i class="fa fa-chevron-down"></i>
			</div>
			<ul class="submenu">
				<li><a href="custom_info.action" target="show">客户信息管理</a></li>
				<li><a href="custom_erloss.action" target="show">客户流失管理</a></li>
			</ul>
		</li>
		<li id="service" style="display: none;">
			<div class="link">
				<i class="fa fa-mobile"></i>服务管理<i class="fa fa-chevron-down"></i>
			</div>
			<ul class="submenu">
				<li><a href="service_add.action" target="show">服务创建</a></li>
				<li><a href="service_point.action" target="show">服务分配</a></li>
				<li><a href="service_del.action" target="show">服务处理</a></li>
				<li><a href="service_send.action" target="show">服务反馈</a></li>
				<li><a href="service_save.action" target="show">服务归档</a></li>
			</ul>
		</li>
		<li id="tongji" style="display: none;"><div class="link">
				<i class="fa fa-mobile"></i>统计报表<i class="fa fa-chevron-down"></i>
			</div>
			<ul class="submenu">
				<li><a href="#">客户贡献分析</a></li>
				<li><a href="#">客户构成分析</a></li>
				<li><a href="#">客户服务分析</a></li>
				<li><a href="#">客户流失分析</a></li>
			</ul>
		</li>
		<li id="base" style="display: none;">
			<div class="link">
				<i class="fa fa-mobile"></i>基础数据<i class="fa fa-chevron-down"></i>
			</div>
			<ul class="submenu">
				<li><a href="base_list.action" target="show">数据字典管理</a></li>
				<li><a href="#">查询产品信息</a></li>
				<li><a href="#">查询库存信息</a></li>
			</ul>
		</li>
		<li id="right" style="display: none;">
			<div class="link">
				<i class="fa fa-mobile"></i>权限管理<i class="fa fa-chevron-down"></i>
			</div>
			<ul class="submenu">
				<li><a href="us_userlist.action" target="show">用户管理</a></li>
				<li><a href="us_rolelist.action" target="show">角色管理</a></li>
			</ul>
		</li>
	</ul>
</body>
</html>
