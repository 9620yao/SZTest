$('#picData').fileinput({
	language : 'zh',
	uploadUrl : "img/add",
	uploadExtraData : {"uid" : 1},
	allowedFileExtensions : [ 'jpg', 'png', 'gif' ],
	textEncoding : 'UTF-8',
});
$("#picData").on("fileuploaded", function(event, data, previewId, index) {
	alert(data);
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
