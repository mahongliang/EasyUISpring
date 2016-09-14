$(function() {

	$("#nav").tree({
		lines : true,
		data : [ {
			"id" : 1,
			"text" : "实时监控",
			"state" : "open",
			"iconCls" : "icon-system",
			"children" : [ {
				"id" : 101,
				"text" : "卷绕车间监控",
				"state" : "open",
				"iconCls" : "icon-manager",
				"attributes" : {
					"myurl" : "/EasyUISpring/admin/customlist"
				},
			}, {
				"id" : 101,
				"text" : "包膜车间监控",
				"state" : "open",
				"iconCls" : "icon-manager",
				"attributes" : {
					"myurl" : "/EasyUISpring/admin/test1"
				},
			}, {
				"id" : 101,
				"text" : "分选车间监控",
				"state" : "open",
				"iconCls" : "icon-manager",
				"attributes" : {
					"myurl" : "/EasyUISpring/admin/test2"
				},
			} ]
		} ],
		onClick : function(node) {
			if (node.attributes.myurl) {
				if ($('#tabs').tabs('exists', node.text)) {
					$('#tabs').tabs('select', node.text);
				} else {
					$('#tabs').tabs('add', {
						title : node.text,
						iconCls : node.iconCls,
						closable : true,
						href : node.attributes.myurl
					});
				}
			}
		}
	});

	$('#tabs').tabs({
		fit : true,
		border : false,
	});
});