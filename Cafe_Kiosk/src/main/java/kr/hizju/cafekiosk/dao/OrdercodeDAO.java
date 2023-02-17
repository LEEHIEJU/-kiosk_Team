package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.hizju.cafekiosk.vo.OrderCodeVO;

@Mapper
public interface OrdercodeDAO {
	
	String today() throws SQLException;
	
	List<OrderCodeVO> ordercodepage(String orderwhere) throws SQLException;

}
