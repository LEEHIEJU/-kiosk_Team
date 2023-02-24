package kr.hizju.cafekiosk.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hizju.cafekiosk.dao.OrdercodeDAO;
import kr.hizju.cafekiosk.vo.OrderCodeVO;
import kr.hizju.cafekiosk.vo.OrderNumVO;

@Service("ordercodeService")
public class OrdercodeServiceImpl implements OrdercodeService {

	@Autowired
	private OrdercodeDAO ordercodeDAO;
	
	@Override
	public List<OrderCodeVO> ordercodepage(String orderwhere) {
		List<OrderCodeVO> orderList = null;
		try {
			orderList = ordercodeDAO.ordercodepage(orderwhere);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return orderList;
	}

	@Override
	public String today() {
		String result = null;
		try {
			result = ordercodeDAO.today();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<OrderNumVO> orderpage(String ordernum) {
		List<OrderNumVO> orderdetaillist = null;
		try {
			orderdetaillist = ordercodeDAO.orderpage(ordernum);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return orderdetaillist;
	}

	@Override
	public void orderinfo(OrderCodeVO orderCodeVO) {
		try {
			ordercodeDAO.orderinfo(orderCodeVO);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void orderdetail(OrderNumVO orderNumVO) {
		try {
			ordercodeDAO.orderdetail(orderNumVO);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
	

}
