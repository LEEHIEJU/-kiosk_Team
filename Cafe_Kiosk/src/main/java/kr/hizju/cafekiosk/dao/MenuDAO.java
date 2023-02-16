package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.hizju.cafekiosk.vo.MenuVO;

@Mapper
public interface MenuDAO {
	
    // 전체 메뉴 보여주기
	List<MenuVO> menulist() throws SQLException;

	// 하나의 메뉴만 보여주기
	MenuVO menuinfo(String foodnum) throws SQLException;
	
	// 저장하기
	void insert(MenuVO menuVO) throws SQLException;

	// 수정하기
	void update(MenuVO menuVO) throws SQLException;

	// 삭제하기
	void delete(String foodnum) throws SQLException;

}
