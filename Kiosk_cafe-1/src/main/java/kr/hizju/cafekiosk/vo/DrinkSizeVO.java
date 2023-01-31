package kr.hizju.cafekiosk.vo;

import javax.swing.Spring;

import lombok.Data;

@Data
public class DrinkSizeVO {
	private int DRINKSIZEID;
	private Spring HOTSMALL; 
	private Spring ICESMALL;
	private Spring HOTLARGE;
	private Spring ICELARGE;
}
