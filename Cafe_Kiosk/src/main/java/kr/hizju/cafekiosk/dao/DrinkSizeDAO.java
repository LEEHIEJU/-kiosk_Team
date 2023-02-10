package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;
import java.util.List;

import kr.hizju.cafekiosk.vo.DrinkSizeVO;

public interface DrinkSizeDAO {

	// 1. 모두얻기
	List<DrinkSizeVO> drinksizelist() throws SQLException;
	
	void sizeup(DrinkSizeVO drinkSizeVO) throws SQLException;
	
	void iceup(DrinkSizeVO drinkSizeVO) throws SQLException;

}
