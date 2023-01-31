package kr.rok.kiosk.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.rok.kiosk.vo.OrderCodeVO;

@Mapper
@Repository("OrderCode")
public interface OrderCodeDAO {
	public List<OrderCodeVO> OrderCodeList() throws SQLException;
}
