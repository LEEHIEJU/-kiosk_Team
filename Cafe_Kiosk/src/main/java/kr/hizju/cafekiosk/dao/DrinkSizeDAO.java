package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import kr.hizju.cafekiosk.vo.DrinkSizeVO;

@Mapper
public interface DrinkSizeDAO {

	// 음료 사이즈 업
	DrinkSizeVO sizeup(String drinksizetype) throws SQLException;

}
