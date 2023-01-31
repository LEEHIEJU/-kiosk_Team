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
	
	public MenuVO(Spring foodnum, Spring foodname, Spring foodtype, int foodprice, Spring foodsoldout, int foodlev) {
		super();
		this.foodnum = foodnum;
		this.foodname = foodname;
		this.foodtype = foodtype;
		this.foodprice = foodprice;
		this.foodsoldout = foodsoldout;
		this.foodlev = foodlev;
	}

	@Override
	public String toString() {
		return "MenuVO [foodnum=" + foodnum + ", foodname=" + foodname + ", foodtype=" + foodtype + ", foodprice="
				+ foodprice + ", foodsoldout=" + foodsoldout + ", foodlev=" + foodlev + "]";
	}
	

}
