package com.multi.test100;

public class PageVO2 {
	private int start;
	private int end;
	private int page;

	public void setStartEnd() {
		start = 1 + (page - 1) * 20;
		// 1page : 1 + (1-1) *5 = start 1
		// 2page : 1 + (2-1) * 5 = start 6
		end = page * 20;
		// 1page : 1*5 = end 5
		// 2page : 2*5 = end 10
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "PageVO [start=" + start + ", end=" + end + ", page=" + page + "]";
	}



}
