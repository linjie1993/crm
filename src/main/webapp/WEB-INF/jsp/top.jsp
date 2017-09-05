<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table width="100%">
		<tr >
			<td ><img src="images/logo.gif"></td>
			<td style="font-family:黑体;font-size:33px;font-weight:bold;text-align: center;"> 客户关系管理系统</td>	
			<td width="25%" align="right" style="font-size:12px; padding-right: 20px;" valign="bottom">当前用户：${user.UUsername}（${userRole.RName}）&nbsp;&nbsp; <a href="user_out.action">退出系统</a> </td>
		</tr>
	</table>
  </body>
</html>
