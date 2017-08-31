<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="album/css/lightgallery.css" />
<link type="text/css" rel="stylesheet" href="album/css/demo-gallery.css" />
<title>相册展示</title>
</head>
<body>
	<div class="demo-gallery">
		<ul id="lightgallery">
			<li data-src="img/1.jpg"><a href="javascript:void(0)"> <img
					src="img/1.jpg">
			</a></li>
			<li data-src="img/2.jpg"><a href="javascript:void(0)"> <img
					src="img/2.jpg">
			</a></li>
		</ul>
	</div>

	<!-- <div id="lightgallery">
		<a href="img/1.jpg"> <img src="img/thumb-1.jpg" />
		</a> <a href="img/2.jpg"> <img src="img/thumb-2.jpg" /></a>
	</div> -->

	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="album/js/lightgallery.min.js"></script>
	<script type="text/javascript" src="album/js//jquery.mousewheel.min.js"></script>
	<script type="text/javascript" src="album/js/lg-thumbnail.min.js"></script>
	<script type="text/javascript" src="album/js/lg-fullscreen.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#lightgallery").lightGallery();
		});
	</script>
</body>
</html>