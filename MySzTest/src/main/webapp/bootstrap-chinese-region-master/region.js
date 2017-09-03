$.getJSON('bootstrap-chinese-region-master/sql_areas.json', function(data) {
	for (var i = 0; i < data.length; i++) {
		var area = {
			id : data[i].id,
			name : data[i].cname,
			level : data[i].level,
			parentId : data[i].upid
		};
		data[i] = area;
	}
	$('.bs-chinese-region').chineseRegion('source', data).on('completed.bs.chinese-region',function(e,areas){
	    //areas是已选择的地区数据，按先选择的在最前的方式排序。
		alert(JSON.stringify(areas));
	});;
});
/*$('.bs-chinese-region').chineseRegion('source',data).on('completed.bs.chinese-region',function(e,areas){
    //areas是已选择的地区数据，按先选择的在最前的方式排序。
	alert(JSON.stringify(areas));
});*/