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

}
