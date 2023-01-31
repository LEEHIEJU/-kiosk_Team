package kr.hizju.cafekiosk.vo;

import javax.swing.Spring;

import lombok.Data;

@Data
public class MenuVO {
	private Spring foddnum;
	private Spring foodname;
	private Spring foodtype;
	private int foddprice;
	private Spring foodsoldout;
	private int foodlev;
	
	public MenuVO(Spring foddnum, Spring foodname, Spring foodtype, int foddprice, Spring foodsoldout, int foodlev) {
		super();
		this.foddnum = foddnum;
		this.foodname = foodname;
		this.foodtype = foodtype;
		this.foddprice = foddprice;
		this.foodsoldout = foodsoldout;
		this.foodlev = foodlev;
	}

	@Override
	public String toString() {
		return "MenuVO [foddnum=" + foddnum + ", foodname=" + foodname + ", foodtype=" + foodtype + ", foddprice="
				+ foddprice + ", foodsoldout=" + foodsoldout + ", foodlev=" + foodlev + "]";
	}
	
	

}
