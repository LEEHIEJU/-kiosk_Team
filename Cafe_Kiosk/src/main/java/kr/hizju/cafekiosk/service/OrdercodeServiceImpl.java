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
	
	// 주문화면(매장/포장)
	@Override
	public void orderpage(OrderCodeVO orderCodeVO) {
		try {
			ordercodeDAO.orderpage(orderCodeVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 주문내역
	@Override
	public List<OrderNumVO> orderhistory(String ordernum) {
		List<OrderNumVO> orderdetaillist = null;
		try {
			orderdetaillist = ordercodeDAO.orderhistory(ordernum);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return orderdetaillist;
	}

	// 주문하기(메뉴)
	@Override
	public void orderdetail(OrderNumVO orderNumVO) {
		try {
			ordercodeDAO.orderdetail(orderNumVO);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}

	@Override
	public void orderupdate(OrderNumVO orderNumVO) {
		try {
			ordercodeDAO.orderupdate(orderNumVO);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void orderdelete(String ordernum) {
		try {
			ordercodeDAO.orderdelete(ordernum);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
