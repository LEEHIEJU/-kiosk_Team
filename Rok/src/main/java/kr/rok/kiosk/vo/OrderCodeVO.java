package kr.rok.kiosk.vo;

import java.util.Date;

import javax.swing.Spring;

import lombok.Data;

@Data
public class OrderCodeVO {
	private int ordernum;
	private Spring orderwhere;
	private Spring orderin;
	private Date orderdate;
	private Spring coupon;
	
	public OrderCodeVO(int ordernum, Spring orderwhere, Spring orderin, Date orderdate, Spring coupon) {
		super();
		this.ordernum = ordernum;
		this.orderwhere = orderwhere;
		this.orderin = orderin;
		this.orderdate = orderdate;
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "OrderCodeVO [ordernum=" + ordernum + ", orderwhere=" + orderwhere + ", orderin=" + orderin
				+ ", orderdate=" + orderdate + ", coupon=" + coupon + "]";
	}
	
	
}
