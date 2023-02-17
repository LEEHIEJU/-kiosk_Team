package kr.hizju.cafekiosk.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrinkSizeVO {
	private String foodnum;
	private String drinksizetype;
	private int plusprice;

	
}
