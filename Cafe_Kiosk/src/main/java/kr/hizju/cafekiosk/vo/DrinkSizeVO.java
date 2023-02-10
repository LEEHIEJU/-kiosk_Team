package kr.hizju.cafekiosk.vo;

import javax.swing.Spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrinkSizeVO {
	private int drinksizeid;
	private String hotsmall; 
	private String icesmall;
	private String hotlarge;
	private String icelarge;

	
}
