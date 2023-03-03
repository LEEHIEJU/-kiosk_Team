package kr.hizju.cafekiosk.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminVO {
	
	private String adminpw;
	
	// 메뉴
	private String foodnum;
	private String foodname;
	private String foodtype;
	private int foodprice;
	private String foodsoldout;
	private int foodlev;
	private String image;

}
