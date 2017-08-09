/**
 * 
 * json对象转为字符串 JSON.stringify(jsonobj); 字符串转为json对象 JSON.parse(jsonstr);
 */
function getUser() {
	$.post("user/get", function(data) {
		alert(JSON.stringify(data));// json对象转为字符串 JSON.stringify(data);
	}, "json");
}
//getUser();
function Put() {
	// var aid = $(".aid").val();
	// var name = $(".name").val();
	// var pid = $(".pid").val();
	// var pname = $(".pname").val();
	// $.post("user/put", {
	// "aid" : aid,
	// "name" : name,
	// "partner.pid" : pid,
	// "partner.pname" : pname
	// }, function(data) {
	// alert(data);
	// }, "json");
	$("#myform").submit();
}