package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.hizju.cafekiosk.vo.DrinksizeVO;
import kr.hizju.cafekiosk.vo.MenuVO;

@Mapper
public interface MenuDAO {
	
	// 커피 메뉴 보여주기
	List<MenuVO> menulist() throws SQLException;
	
	// 음료 사이즈 확인하기
	List<DrinksizeVO> drinksizevo(String foodnum) throws SQLException;

	// 하나의 메뉴만 보여주기
	List<MenuVO> menuinfo(String foodnum) throws SQLException;
	
	// 음료 사이즈 업(가격)
	List<MenuVO> sizeup(String drinksizetype) throws SQLException;
	
	// 메뉴 카테고리
	List<MenuVO> menucategory(String foodtype) throws SQLException;
	
	// 저장하기
	void insert(MenuVO menuVO) throws SQLException;

	// 수정하기
	void update(MenuVO menuVO) throws SQLException;

	// 삭제하기
	void delete(String foodnum) throws SQLException;

}
