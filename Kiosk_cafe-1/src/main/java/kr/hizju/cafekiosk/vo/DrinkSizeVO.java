package kr.hizju.cafekiosk.vo;

import javax.swing.Spring;

import lombok.Data;

@Data
public class DrinkSizeVO {
	private int drinksizeid;
	private Spring hotsmall; 
	private Spring icesmall;
	private Spring hotlarge;
	private Spring icelarge;
	
	public DrinkSizeVO(int drinksizeid, Spring hotsmall, Spring icesmall, Spring hotlarge, Spring icelarge) {
		super();
		this.drinksizeid = drinksizeid;
		this.hotsmall = hotsmall;
		this.icesmall = icesmall;
		this.hotlarge = hotlarge;
		this.icelarge = icelarge;
	}

	@Override
	public String toString() {
		return "DrinkSizeVO [drinksizeid=" + drinksizeid + ", hotsmall=" + hotsmall + ", icesmall=" + icesmall
				+ ", hotlarge=" + hotlarge + ", icelarge=" + icelarge + "]";
	}

	
}
