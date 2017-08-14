$('#picData').fileinput({
	language : 'zh',
	allowedFileExtensions : [ 'jpg', 'png', 'gif' ],
	textEncoding : 'UTF-8',
	dropZoneEnabled : true// 是否显示拖拽区域
});
$("#picData").on("fileuploaded", function(event, data, previewId, index) {
	// alert(data);
	$('#myModal').modal('hide');
});
$('#picData').on('fileerror', function(event, data, msg) {
	alert(msg);
});

$('#myModal').on('hidden.bs.modal', function() {
	// alert(1111);
	// alert(JSON.stringify($('. file-drop-zone').data()));
	// $(". file-drop-zone").removeData("bs.modal");
	// $(".alert").children().remove();
});
