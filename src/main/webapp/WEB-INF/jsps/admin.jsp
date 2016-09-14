<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/admin.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/easyui/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/easyui/jquery.easyui.min.js"></script>


</head>
<body class="easyui-layout">

<div data-options="region:'north',title:'header',split:true,noheader:true" style="height:60px;background:#666;">
	<div class="logo">后台管理</div>
	<div class="logout">您好，<?php echo $_SESSION['admin']?> | <a href="admin/logout">退出</a></div>
</div>   
<div data-options="region:'south',title:'footer',split:true,noheader:true" style="height:35px;line-height:30px;text-align:center;">
	&copy;2009-2015 瓢城 Web 俱乐部. Powered by PHP and EasyUI.
</div>    
<div data-options="region:'west',title:'导航',split:true,iconCls:'icon-world'" style="width:180px;padding:10px;">
<ul id="nav"></ul>
</div>   
<div data-options="region:'center'" style="overflow:hidden;">
	<div id="tabs">
		<div title="起始页" iconCls="icon-house" style="padding:0 10px;display:block;">
			欢迎来到后台管理系统！
		</div>
	</div>
</div> 
</body>

<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/admin.js"></script>
</html>