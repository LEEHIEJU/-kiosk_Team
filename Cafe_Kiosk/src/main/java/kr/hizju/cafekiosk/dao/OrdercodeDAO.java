package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import kr.hizju.cafekiosk.vo.OrderCodeVO;
import kr.hizju.cafekiosk.vo.OrderNumVO;

@Mapper
public interface OrdercodeDAO {
	
	// 주문화면(매장/포장)
	void orderpage(OrderCodeVO orderCodeVO) throws SQLException;
	
	// 주문목록
	List<OrderNumVO> orderhistory(String ordernum) throws SQLException;
	
	// 주문하기(메뉴)
	void orderdetail(OrderNumVO orderNumVO) throws SQLException;

	// 주문수정
	void orderupdate(OrderNumVO orderNumVO) throws SQLException;
	
	// 주문 삭제
	void orderdelete(String ordernum) throws SQLException;
	
	

}
