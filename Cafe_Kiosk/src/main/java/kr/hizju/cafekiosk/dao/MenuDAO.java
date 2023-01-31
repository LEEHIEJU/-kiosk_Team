package kr.hizju.cafekiosk.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.hizju.cafekiosk.vo.DrinkSizeVO;
import kr.hizju.cafekiosk.vo.MenuVO;

@Mapper
@Repository("menuDAO")
public interface MenuDAO {

	List<MenuVO> selectList() throws SQLException;

	// 2. 저장하기
	void insert(DrinkSizeVO drinkSizeVO) throws SQLException;

	// <!-- 3. 수정하기 -->
	void update(DrinkSizeVO drinkSizeVO) throws SQLException;

	// <!-- 4. 삭제하기 -->
	void delete(int idx) throws SQLException;

}
