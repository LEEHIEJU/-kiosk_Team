package kr.hizju.cafekiosk.vo;

import javax.swing.Spring;

import lombok.Data;

@Data
public class MenuVO {
	private Spring FOODNUM;
	private Spring FOODNAME;
	private Spring FOODTYPE;
	private int FOODPRICE;
	private Spring FoodSOLDOUT;
	private int FOODLEV;
	
	public MenuVO(Spring fOODNUM, Spring fOODNAME, Spring fOODTYPE, int fOODPRICE, Spring foodSOLDOUT, int fOODLEV) {
		super();
		FOODNUM = fOODNUM;
		FOODNAME = fOODNAME;
		FOODTYPE = fOODTYPE;
		FOODPRICE = fOODPRICE;
		FoodSOLDOUT = foodSOLDOUT;
		FOODLEV = fOODLEV;
	}

	@Override
	public String toString() {
		return "Menu [FOODNUM=" + FOODNUM + ", FOODNAME=" + FOODNAME + ", FOODTYPE=" + FOODTYPE + ", FOODPRICE="
				+ FOODPRICE + ", FoodSOLDOUT=" + FoodSOLDOUT + ", FOODLEV=" + FOODLEV + "]";
	}
	

}
