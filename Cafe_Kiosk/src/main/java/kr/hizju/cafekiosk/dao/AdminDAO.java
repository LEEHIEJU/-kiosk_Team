package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import kr.hizju.cafekiosk.vo.AdminVO;
import kr.hizju.cafekiosk.vo.MenuVO;

@Mapper
public interface AdminDAO {
	
	// 관리자 로그인
	AdminVO pw(String adminpw) throws SQLException;
	
	// 메뉴 저장하기
	void insert(MenuVO menuVO) throws SQLException;

	// 메뉴 수정하기
	void update(MenuVO menuVO) throws SQLException;

	// 메뉴 삭제하기
	void delete(String foodnum) throws SQLException;

	

}
