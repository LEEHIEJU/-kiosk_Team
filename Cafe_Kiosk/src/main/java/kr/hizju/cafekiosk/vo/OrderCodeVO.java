package kr.hizju.cafekiosk.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCodeVO {
	private int ordernum;
	private String orderwhere; // 매장 or 포장
	private String orderin; // 주문완료
	private Date orderdate; // 주문날짜
	private String coupon;
	
}
