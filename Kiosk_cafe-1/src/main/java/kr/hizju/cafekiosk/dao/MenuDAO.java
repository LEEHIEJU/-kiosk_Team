package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.hizju.cafekiosk.vo.MenuVO;

@Mapper
@Repository("menuDAO")
public interface MenuDAO {
	
	List<MenuVO> selectList() throws SQLException;
	

}
