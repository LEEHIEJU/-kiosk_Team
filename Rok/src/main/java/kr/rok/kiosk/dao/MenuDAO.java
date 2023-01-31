package kr.rok.kiosk.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.rok.kiosk.vo.MenuVO;

@Mapper
@Repository("MenuDAO")
public interface MenuDAO {
	public List<MenuVO> MenuList() throws SQLException;
}
