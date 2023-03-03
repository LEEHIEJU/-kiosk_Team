package kr.hizju.cafekiosk.service;

import java.util.List;

import kr.hizju.cafekiosk.vo.OrderCodeVO;
import kr.hizju.cafekiosk.vo.OrderNumVO;

public interface OrdercodeService {

	// 주문화면
	List<OrderCodeVO> orderpage(String orderwhere);

	// 주문내역
	List<OrderNumVO> orderhistory(String ordernum);

	// 주문하기(매장/포장)
	void orderinfo(OrderCodeVO orderCodeVO);

	// 주문하기(메뉴)
	void orderdetail(OrderNumVO orderNumVO);

	// 주문수정
	void orderupdate(OrderNumVO orderNumVO);

	// 주문 삭제
	void orderdelete(String ordernum);
}
