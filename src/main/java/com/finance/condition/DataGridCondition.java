package com.finance.condition;

public class DataGridCondition {

	private int currentPage;

	private int rows;

	private int offset;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getOffset() {
		return offset;
	}

	private void setOffset(int offset) {
		this.offset = offset;
	}
	
	
	public void calculateOffset(){
		
		this.setOffset((this.getCurrentPage() - 1 ) * this.getRows());
	}

}
