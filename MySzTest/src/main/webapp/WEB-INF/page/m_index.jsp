<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <base href="/MySzTest/"> -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试</title>
</head>
<body>
	<form id="myform" action="user/put" method="post">
		<!-- action="user/put" method="post" -->
		<p>
			<input class="aid" name="aid" value="1000" />
		</p>
		<p>
			<input class="name" name="name" value="zhangsan" />
		</p>
		<p>
			<input class="pid" name="partner.pid" value="1001" />
		</p>
		<p>
			<input class="pname" name="partner.pname" value="lisi" />
		</p>
		<p>
			<a onclick="Put()" href="javascript:void(0)">提交</a>
		</p>
		<!-- <input type="submit" value="提 交"> -->
	</form>
	<jsp:include page="header.jsp" />
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
</body>
</html>