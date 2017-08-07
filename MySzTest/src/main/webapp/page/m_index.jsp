<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试</title>
</head>
<body>
	<form id="myform" action="user/put" method="post"><!-- action="user/put" method="post" -->
		<input class="aid" name="aid" value="1000" /> 
		<input class="name"  name="name" value="zhangsan" />
		<input class="pid"  name="partner.pid" value="1001" /> 
		<input class="pname"  name="partner.pname" value="lisi" /> 
		<a onclick="Put()" href="javascript:void(0)">提交</a>
		<!-- <input type="submit" value="提 交"> -->
	</form>
	<jsp:include page="header.jsp"></jsp:include>
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
</body>
</html>