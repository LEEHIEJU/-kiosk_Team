package kr.rok.kiosk.vo;

import lombok.Data;

@Data
public class OrderNumVO {
	private int idx;
	private int foodstock;
	private int ordercount;
	private int ordernum;
	private int foodnum;
	
	public OrderNumVO(int idx, int foodstock, int ordercount, int ordernum, int foodnum) {
		super();
		this.idx = idx;
		this.foodstock = foodstock;
		this.ordercount = ordercount;
		this.ordernum = ordernum;
		this.foodnum = foodnum;
	}

	@Override
	public String toString() {
		return "OrderNumVO [idx=" + idx + ", foodstock=" + foodstock + ", ordercount=" + ordercount + ", ordernum="
				+ ordernum + ", foodnum=" + foodnum + "]";
	}
	
}
