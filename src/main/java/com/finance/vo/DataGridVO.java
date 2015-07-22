package com.finance.vo;

import java.util.List;

/**
 * 
 * @author sdyang
 * @date 2015年7月2日 下午4:23:57
 */
public class DataGridVO {

	private int total;

	private List<?> rows;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
