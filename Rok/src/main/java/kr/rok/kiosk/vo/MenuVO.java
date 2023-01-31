package kr.rok.kiosk.vo;

import javax.swing.Spring;

import lombok.Data;

@Data
public class MenuVO {
	private Spring foodnum;
	private Spring foodname;
	private Spring foodtype;
	private int foodprice;
	private Spring foodsoldout;
	private int foodlev;
	
	public MenuVO(Spring fOODNUM, Spring fOODNAME, Spring fOODTYPE, int fOODPRICE, Spring foodSOLDOUT, int fOODLEV) {
		super();
		foodnum = fOODNUM;
		foodname = fOODNAME;
		foodtype = fOODTYPE;
		foodprice = fOODPRICE;
		foodsoldout = foodSOLDOUT;
		foodlev = fOODLEV;
	}

	@Override
	public String toString() {
		return "Menu [FOODNUM=" + foodnum + ", FOODNAME=" + foodname + ", FOODTYPE=" + foodtype + ", FOODPRICE="
				+ foodprice + ", FoodSOLDOUT=" + foodsoldout + ", FOODLEV=" + foodlev + "]";
	}
	

}
