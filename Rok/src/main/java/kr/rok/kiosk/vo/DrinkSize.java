package kr.rok.kiosk.vo;

import javax.swing.Spring;

import lombok.Data;

@Data
public class DrinkSize {
	private int DRINKSIZEID;
	private Spring HOTSMALL; 
	private Spring ICESMALL;
	private Spring HOTLARGE;
	private Spring ICELARGE;
}
