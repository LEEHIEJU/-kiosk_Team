package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.hizju.cafekiosk.vo.OrderCodeVO;
import kr.hizju.cafekiosk.vo.OrderNumVO;

@Mapper
public interface OrdercodeDAO {
	
	String today() throws SQLException;
	
	// 주문화면
	List<OrderCodeVO> ordercodepage(String orderwhere) throws SQLException;
	
	// 주문내역
	List<OrderNumVO> orderpage(String ordernum) throws SQLException;
	
	// 주문정보
	void orderinfo(OrderCodeVO orderCodeVO) throws SQLException;
	
	// 주문 상세정보
	void orderdetail(OrderNumVO orderNumVO) throws SQLException;
	

}
