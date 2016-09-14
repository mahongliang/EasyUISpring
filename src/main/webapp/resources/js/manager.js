
	//请求地址
	var url;
	// 提示消息
	var mesTitle;

	////装载数据
	$(function(){
		$('#datagrid').datagrid({
			url : '/EasyUISpring/customer/datagrid',
			toolbar : '#toolbar',
			pagination : true,
			fit : true,
			fitColumns : true,
			
			rownumbers : true,
			striped : true,
			border : false,
		    nowrap : false,
			columns : [[
				{
					field : 'id',
					title : '编号',
					width : 100,
					checkbox : false,
				},
				{
					field : 'name',
					title : '名称',
					width : 100,
				},
				{
					field : 'address',
					title : '地址',
					width : 100,
				},
				{
					field : 'zipcode',
					title : '邮编',
					width : 100,
				},
				{
					field : 'fax',
					title : '传真',
					width : 100,
				},
			]],
		});
	});

	// 添加用户信息
	function addObject() {
		$('#dlg').dialog('open').dialog('setTitle', '新增用户');
		$('#fm').form('clear');
		url = "/EasyUISpring/customer/add";
		mesTitle = '新增用户成功';
	}

	// 编辑用户信息
	function editObject() {
		var row = $('#datagrid').datagrid('getSelected');
		if (row) {
			var id = row.id;
			$('#dlg').dialog('open').dialog('setTitle', '编辑用户');
			$('#fm').form('load', row);// 这句话有问题，第一次加载时正确的，第二次就出错了，还保持第一次的数据
			url = "/EasyUISpring/customer/edit?id=" + id;
			mesTitle = '编辑用户成功';
		} else {
			$.messager.alert('提示', '请选择要编辑的记录！', 'error');
		}
	}

	// 删除用信息
	function deleteObject() {
		var row = $('#datagrid').datagrid('getSelected');
		if (row) {
			var id = row.id;
			$('#dlg_delete').dialog('open').dialog('setTitle', '删除用户');
			$('#fm').form('load', row);// 这句话有问题，第一次加载时正确的，第二次就出错了，还保持第一次的数据
			url = "/EasyUISpring/customer/delete?id=" + id;
			mesTitle = '删除用户成功';
		} else {
			$.messager.alert('提示', '请选择要删除的记录！', 'error');
		}
	}

	// 保存添加、修改内容
	function saveObject() {
		$('#fm').form('submit', {
			url : url,
			onSubmit : function() {
				return $(this).form('validate');
			},
			success : function(result) {
				/* console.info(result); */
				var result = eval('(' + result + ')');
				if (result.success) {
					$('#dlg').dialog('close');
					$('#datagrid').datagrid('reload');
				} else {
					mesTitle = '新增用户失败';
				}
				$.messager.show({
					title : mesTitle,
					msg : result.msg
				});
			}
		});
	}

	// 提交删除内容
	function saveObject_del() {
		$('#fm').form('submit', {
			url : url,
			success : function(result) {
				var result = eval('(' + result + ')');
				if (result.success) {
					$('#dlg_delete').dialog('close');
					$('#datagrid').datagrid('reload');
				} else {
					mesTitle = '删除用户失败';
				}
				$.messager.show({
					title : mesTitle,
					msg : result.msg
				});
			}
		});
	}

	// 刷新
	function reload() {
		$('#datagrid').datagrid('reload');
	}

