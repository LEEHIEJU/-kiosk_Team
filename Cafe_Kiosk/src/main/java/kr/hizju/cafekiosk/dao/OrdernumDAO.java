package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.hizju.cafekiosk.vo.OrderNumVO;

@Mapper
public interface OrdernumDAO {

	List<OrderNumVO> selectList() throws SQLException;
	
}
