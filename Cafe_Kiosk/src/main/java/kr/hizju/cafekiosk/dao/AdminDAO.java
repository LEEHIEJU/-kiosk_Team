package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import kr.hizju.cafekiosk.vo.AdminVO;

@Mapper
public interface AdminDAO {
	
	AdminVO pw(String adminpw) throws SQLException;
	

}
