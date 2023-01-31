package kr.hizju.cafekiosk.service;

import java.util.List;

import kr.hizju.cafekiosk.vo.MenuVO;
import kr.hizju.cafekiosk.vo.OrderNumVO;

public interface OrdernumService {
	
	List<OrderNumVO> selectList();

}
