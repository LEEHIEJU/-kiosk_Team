package kr.hizju.cafekiosk.service;

import java.util.List;

import kr.hizju.cafekiosk.vo.OrderCodeVO;
import kr.hizju.cafekiosk.vo.OrderNumVO;

public interface OrdercodeService {

	String today();

	// 주문화면
	List<OrderCodeVO> ordercodepage(String orderwhere);

	// 주문내역
	List<OrderNumVO> orderpage(String ordernum);

	// 주문정보
	void orderinfo(OrderCodeVO orderCodeVO);

	// 주문 상세정보
	void orderdetail(OrderNumVO orderNumVO);
}
