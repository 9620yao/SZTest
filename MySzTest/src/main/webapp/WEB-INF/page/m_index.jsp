<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <base href="/MySzTest/"> -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试</title>
<link href="">
</head>
<body>
	<!-- 添加数据部分 start -->
	<div class="addput">
		<form id="myform" action="user/put" method="post">
			<!-- action="user/put" method="post" -->
			<p>
			<h2>添加 个人 | 好友</h2>
			</p>
			<p>
				<label for="name">我的名字：</label> <input id="name" class="name"
					name="name" value="zhangsan" />
			</p>
			<p>
				<label for="pname">好友名字：</label> <input id="pname" class="pname"
					name="partner.pname" value="lisi" />
			</p>
			<p>
				<a onclick="Put()" href="javascript:void(0)">提交</a>
			</p>
			<!-- <input type="submit" value="提 交"> -->
		</form>
	</div>
	<!-- 添加数据部分 end -->
	<!--公共尾部 start -->
	<div class="divfoot">
		<jsp:include page="header.jsp" />
	</div>
	<!--公共尾部 end -->
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
</body>
</html>