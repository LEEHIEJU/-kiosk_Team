package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;
import java.util.List;

import kr.hizju.cafekiosk.vo.OrderNumVO;

public interface OrdernumDAO {

	List<OrderNumVO> selectList() throws SQLException;
	
}
