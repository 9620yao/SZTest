<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <base href="/MySzTest/"> -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试</title>
<link rel="stylesheet" type="text/css" href="uploader/bootstrap.min.css">
<link rel="stylesheet" type="text/css" media="all"
	href="uploader/css/fileinput.css">
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

	<!-- 文件上传 start-->
	<button type="button" class="btn btn-primary btn-lg"
		data-toggle="modal" data-target="#myModal">点击进行文件上传</button>
	<!-- 文件上传 end-->

	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true"
		data-backdrop="static">
		<div class="modal-dialog" style="width: 85%;">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">文件上传</h4>
				</div>
				<!-- 文件上传 start -->
				<div class="modal-body">
					<div class="alert">
						<form enctype="multipart/form-data" method="post">
							<input id="picData" name="picData" type="file" multiple>
							<input id="uid" name="uid" type="hidden" value="1">
						</form>
					</div>
				</div>
				<!-- 文件上传 end -->
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">退出</button>
				</div>
			</div>
		</div>
	</div>

	<div>
		<jsp:forward page="/WEB-INF/page/info.jsp"/>
	</div>
	<!--公共尾部 start -->
	<div class="divfoot">
		<jsp:include page="header.jsp" />
	</div>
	<!--公共尾部 end -->
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="uploader/bootstrap.min.js"></script>

	<script type="text/javascript" src="uploader/js/fileinput.js"></script>
	<script type="text/javascript" src="uploader/js/locales/zh.js"></script>

	<script type="text/javascript" src="uploader/upload.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
</body>
</html>