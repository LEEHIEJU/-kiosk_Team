package kr.hizju.cafekiosk.vo;

import java.util.Date;

import javax.swing.Spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCodeVO {
	private int ordernum;
	private String orderwhere;
	private String orderin;
	private Date orderdate;
	private String coupon;
	
	
	
}
