package kr.rok.kiosk.vo;

import javax.swing.Spring;

import lombok.Data;

@Data
public class OrderNum {
	private int IDX;
	private int FOODSTOCK;
	private int ORDERCOUNT;
	private int ORDERNUM;
	private int FOODNUM;
	
	public OrderNum(int iDX, int fOODSTOCK, int oRDERCOUNT, int oRDERNUM, int fOODNUM) {
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
