package com.easyui.dto;

import java.util.List;

/**
 * 后台向前台返回JSON，用于easyui的datagrid
 * 
 * @author zh
 * 
 */
public class DataGrid<T> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long total;	// 总记录数
	private List<T> rows;	// 每行记录
	
	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}


}
