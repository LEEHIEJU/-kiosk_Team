package kr.rok.kiosk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.rok.kiosk.dao.OrderCodeDAO;
import kr.rok.kiosk.vo.OrderCodeVO;

@Service("ordercode")
public class OrderCodeServiceImpl implements OrderCodeService {
	@Autowired
	private OrderCodeDAO orderCodeDAO;

	@Override
	public List<OrderCodeVO> OrderCodeList() {
		List<OrderCodeVO> list = null;
		try {
			list = orderCodeDAO.OrderCodeList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}