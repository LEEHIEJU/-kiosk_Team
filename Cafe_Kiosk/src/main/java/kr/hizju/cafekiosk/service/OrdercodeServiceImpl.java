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
	public List<OrderCodeVO> orderpage(String orderwhere) {
		List<OrderCodeVO> orderList = null;
		try {
			orderList = ordercodeDAO.orderpage(orderwhere);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return orderList;
	}
	
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
