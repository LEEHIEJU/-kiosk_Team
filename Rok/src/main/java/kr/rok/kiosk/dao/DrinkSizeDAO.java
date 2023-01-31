package kr.rok.kiosk.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.rok.kiosk.vo.DrinkSizeVO;

@Mapper
@Repository("DrinkSize")
public interface DrinkSizeDAO {
	public List<DrinkSizeVO> DrinkSizeList() throws SQLException;
}
