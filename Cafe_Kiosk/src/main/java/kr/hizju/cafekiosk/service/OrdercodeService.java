package kr.hizju.cafekiosk.service;

import java.util.List;

import kr.hizju.cafekiosk.vo.OrderCodeVO;

public interface OrdercodeService {
	
	String today();
	
	List<OrderCodeVO> ordercodepage();

}
