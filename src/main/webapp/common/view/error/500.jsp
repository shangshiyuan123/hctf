<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML>
<html>
<head>
<title>出错了</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="<%=path %>/common/view/css/style.css">
</head>
<body>
<div class="wrap">
	<h1>javakc</h1>
	<div class="banner">
		<img src="<%=path %>/common/view/images/500.png" alt="" />
	</div>
	<div class="page">
		<h2>姐们,他出错了!</h2>
	</div>
	<div class="footer">
		<p>返回 <a href="<%=path %>/index.jsp" target="_top">首页</a></p>
	</div>
</div>
</body>
</html>

