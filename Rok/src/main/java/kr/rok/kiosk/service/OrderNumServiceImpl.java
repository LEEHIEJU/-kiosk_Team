package kr.rok.kiosk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.rok.kiosk.dao.OrderNumDAO;
import kr.rok.kiosk.vo.OrderNumVO;

@Service("OrderNumService")
public class OrderNumServiceImpl implements OrderNumService{
	@Autowired
	private OrderNumDAO OrderNumDAO;

	@Override
	public List<OrderNumVO> OrderNumList() {
		List<OrderNumVO> list = null;
		try {
			list = OrderNumDAO.OrderNumList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	

}
