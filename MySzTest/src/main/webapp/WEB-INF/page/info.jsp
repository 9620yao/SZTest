<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>基本信息</title>
<link rel="stylesheet" type="text/css" href="uploader/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="bootstrap-chinese-region-master/css/bootstrap-chinese-region.css">
<link rel="stylesheet" type="text/css"
	href="bootstrap-datetimepicker-master/css/bootstrap-datetimepicker.min.css">
</head>
<body>
	<div class="container">
		<h1>Bootstrap Chinese Region</h1>
		<p>基于bootstrap的中国地区（行政区）选择器</p>
		<div class="row">
			<div class="col-md-6">
				<form action="">
					<div class="form-group">
						<label for="address">地区</label>
						<div class="bs-chinese-region flat dropdown" data-submit-type="id"
							data-min-level="1" data-max-level="3">
							<input type="text" class="form-control" name="address"
								id="address" placeholder="选择你的地区" data-toggle="dropdown"
								readonly="" value="440103">
							<div class="dropdown-menu" role="menu" aria-labelledby="dLabel">
								<div>
									<ul class="nav nav-tabs" role="tablist">
										<li role="presentation" class="active"><a
											href="#province" data-next="city" role="tab"
											data-toggle="tab">省份</a></li>
										<li role="presentation"><a href="#city"
											data-next="district" role="tab" data-toggle="tab">城市</a></li>
										<li role="presentation"><a href="#district"
											data-next="street" role="tab" data-toggle="tab">县区</a></li>
									</ul>
									<div class="tab-content">
										<div role="tabpanel" class="tab-pane active" id="province">--</div>
										<div role="tabpanel" class="tab-pane" id="city">--</div>
										<div role="tabpanel" class="tab-pane" id="district">--</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<p>
						<button class="btn btn-default" type="submit">提交</button>
					</p>
				</form>
			</div>
		</div>
	</div>

	<div>
		<div class="form-group">
			<label for="dtp_input2" class="col-md-2 control-label">Date
				Picking</label>
			<div class="input-group date form_date col-md-5" data-date=""
				data-date-format="dd MM yyyy" data-link-field="dtp_input2"
				data-link-format="yyyy-mm-dd">
				<input class="form-control" size="16" type="text" value="" readonly>
				<span class="input-group-addon"><span
					class="glyphicon glyphicon-remove"></span></span> <span
					class="input-group-addon"><span
					class="glyphicon glyphicon-calendar"></span></span>
			</div>
			<input type="hidden" id="dtp_input2" value="" /><br />
		</div>
	</div>

	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="uploader/bootstrap.min.js"></script>
	<script
		src="bootstrap-chinese-region-master/js/bootstrap-chinese-region.js"></script>
	<script src="bootstrap-datetimepicker-master/js/bootstrap-datetimepicker.min.js"></script>
	<script src="bootstrap-datetimepicker-master/js/bootstrap-datetimepicker.zh-CN.js"></script>
	<script src="bootstrap-chinese-region-master/region.js"></script>
	<script src="bootstrap-datetimepicker-master/datetimepicker.js"></script>
</body>
</html>