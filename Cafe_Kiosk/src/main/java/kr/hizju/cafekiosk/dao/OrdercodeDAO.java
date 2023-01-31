package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;
import java.util.List;

import kr.hizju.cafekiosk.vo.OrderCodeVO;

public interface OrdercodeDAO {
	
	List<OrderCodeVO> selectList() throws SQLException;

}
