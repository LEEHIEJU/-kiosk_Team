package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.hizju.cafekiosk.vo.AdminVO;

@Mapper
@Repository("adminDAO")
public interface AdminDAO {
	
	List<AdminVO> admin() throws SQLException;
	

}
