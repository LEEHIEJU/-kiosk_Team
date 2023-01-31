package kr.hizju.cafekiosk.vo;

import javax.swing.Spring;

import lombok.Data;

@Data
public class OrderNumVO {
	private int IDX;
	private int FOODSTOCK;
	private int ORDERCOUNT;
	private int ORDERNUM;
	private int FOODNUM;
	
	public OrderNumVO(int iDX, int fOODSTOCK, int oRDERCOUNT, int oRDERNUM, int fOODNUM) {
		super();
		IDX = iDX;
		FOODSTOCK = fOODSTOCK;
		ORDERCOUNT = oRDERCOUNT;
		ORDERNUM = oRDERNUM;
		FOODNUM = fOODNUM;
	}

	@Override
	public String toString() {
		return "OrderNum [IDX=" + IDX + ", FOODSTOCK=" + FOODSTOCK + ", ORDERCOUNT=" + ORDERCOUNT + ", ORDERNUM="
				+ ORDERNUM + ", FOODNUM=" + FOODNUM + "]";
	}
	
}
