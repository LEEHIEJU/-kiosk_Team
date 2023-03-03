package kr.hizju.cafekiosk.vo;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderNumVO {
	private int idx; // 영수증 번호(pk)
	private int foodstock; // 메뉴 개수
	private int totalprice; // 총 결제 금액
	private int ordernum; // 주문번호(fk)
	private int foodnum; // 메뉴 id(fk)
	
	// 주문화면
	private String orderwhere; // 매장 or 포장
	private Date orderdate; // 주문 날짜
	private String coupon; // 쿠폰 사용여부
	
	// 메뉴(db로부터 꺼내올 값)
	private String foodname;
	private String foodtype;
	private int foodprice;
	
	
}
