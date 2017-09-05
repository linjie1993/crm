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

<title>客户关系管理系统</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<script type="text/javascript" src="easyui/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="easyui/js/jquery.easyui.min.js"></script>
<script type="text/javascript">
	
</script>
</head>

<body class="easyui-layout">
	<div data-options="region:'north',border:false"
		style="height:60px;background:#B3DFDA;padding:0px"><jsp:include page="top.jsp"></jsp:include></div>
	<div data-options="region:'west',split:true,title:'导航菜单'"
		style="width:200px;padding:10px;"><jsp:include page="left.jsp"></jsp:include></div>
	<div data-options="region:'south',border:false"
		style="height:30px;background:#A9FACD;padding:0px;"><jsp:include page="foot.jsp"></jsp:include></div>
	<div data-options="region:'center'"style="width:100%; height:100%;"><iframe width="100%" height="100%" name="show" src="a_main.action"></iframe></div>
</body>

</html>
