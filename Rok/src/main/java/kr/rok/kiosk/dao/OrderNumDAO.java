package kr.rok.kiosk.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.rok.kiosk.vo.OrderNumVO;

@Mapper
@Repository("OrderNum")
public interface OrderNumDAO {
	public List<OrderNumVO> OrderNumList() throws SQLException;
}
