package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.hizju.cafekiosk.vo.MenuVO;

@Mapper
public interface MenuDAO {

	List<MenuVO> menulist() throws SQLException;
	
	// 검색하기
	void menusearch(MenuVO menuVO) throws SQLException;

	// 저장하기
	void insert(MenuVO menuVO) throws SQLException;

	// 수정하기
	void update(MenuVO menuVO) throws SQLException;

	// 삭제하기
	void delete(int idx) throws SQLException;

}
