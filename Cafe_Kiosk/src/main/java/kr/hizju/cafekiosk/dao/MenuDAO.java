package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.hizju.cafekiosk.vo.MenuVO;

@Mapper
public interface MenuDAO {

	List<MenuVO> menulist() throws SQLException;

	// 저장하기
	void insert(Map<String, Object> menuMap) throws SQLException;

	// 수정하기
	void update(Map<String, Object> menuMap) throws SQLException;

	// 삭제하기
	void delete(Map<String, Object> menuMap) throws SQLException;

}
