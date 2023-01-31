package kr.rok.kiosk.vo;

import java.util.Date;

import javax.swing.Spring;

import lombok.Data;

@Data
public class OrderCode {
	private int ORDERNUM;
	private Spring ORDERWHERE;
	private Spring ORDERIN;
	private Date ORDERDATE;
	private Spring COUPON;
	
	public OrderCode(int oRDERNUM, Spring oRDERWHERE, Spring oRDERIN, Date oRDERDATE, Spring cOUPON) {
		super();
		ORDERNUM = oRDERNUM;
		ORDERWHERE = oRDERWHERE;
		ORDERIN = oRDERIN;
		ORDERDATE = oRDERDATE;
		COUPON = cOUPON;
	}

	@Override
	public String toString() {
		return "OrderCode [ORDERNUM=" + ORDERNUM + ", ORDERWHERE=" + ORDERWHERE + ", ORDERIN=" + ORDERIN
				+ ", ORDERDATE=" + ORDERDATE + ", COUPON=" + COUPON + "]";
	}
	
}
