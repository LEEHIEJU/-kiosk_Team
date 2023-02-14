package kr.hizju.cafekiosk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.hizju.cafekiosk.vo.OrderCodeVO;

@Service("ordercodeservice")
public class OrdercodeServiceImpl implements OrdercodeService {

	@Override
	public List<OrderCodeVO> ordercodepage() {
		List<OrdercodeService> orderList = null;
		
		return orderList;
	}
	
	

}
