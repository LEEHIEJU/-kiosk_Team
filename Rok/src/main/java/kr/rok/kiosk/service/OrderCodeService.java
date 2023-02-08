package kr.rok.kiosk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kr.rok.kiosk.dao.OrderCodeDAO;
import kr.rok.kiosk.vo.OrderCodeVO;

public interface OrderCodeService {
	public List<OrderCodeVO> OrderCodeList();
	
}

