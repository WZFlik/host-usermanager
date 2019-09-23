package com.holt.bean;

import java.util.List;

/**
 * 封装了User的集合 和user总数
 * @author hot
 *
 */
public class EasyUIResult {
	
	//总条数
	private Long total;
	
	//数据列表
	private List<?> rows;
	
	public EasyUIResult() {
		super();
	}

	public EasyUIResult(Long total, List<?> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}


	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
