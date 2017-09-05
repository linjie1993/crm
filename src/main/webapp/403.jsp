<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 自动跳转页面方法1 -->
<%-- <meta http-equiv="refresh" content="5;url=${pageContext.request.contextPath }/index.jsp">  --%>
<title>403</title>

</head>
<body>
	<p>
		Full authentication is required to access this resource. <a
			href="${pageContext.request.contextPath }/login.jsp" id="url">系统入口</a>
	</p>
	<div>
		<span id="sub-text"></span>如果不跳转，请点击上面链接
	</div>
</body>
<!-- 页面跳转 -->
<script src="${pageContext.request.contextPath }/statics/script/jump.js"></script>
</html>
