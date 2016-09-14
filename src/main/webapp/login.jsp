<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/login.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/easyui/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/login.js"></script>
</head>
<body>

<div id="login">
	<p>管理员帐号：<input type="text" id="manager" class="textbox"></p>
	<p>管理员密码：<input type="password" id="password" class="textbox"></p>
</div>

<div id="btn">
	<a href="#" class="easyui-linkbutton">登录</a>
</div>

</body>

</html>