package kr.hizju.cafekiosk.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderNumVO {
	private int idx;
	private int foodstock;
	private int ordercount;
	private int ordernum;
	private int foodnum;
	
	
}
