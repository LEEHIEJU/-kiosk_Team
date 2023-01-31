package kr.hizju.cafekiosk.service;

import java.util.List;

import kr.hizju.cafekiosk.vo.DrinkSizeVO;
import kr.hizju.cafekiosk.vo.MenuVO;

public interface MenuService {

	List<MenuVO> selectList();

	// 2. 저장하기
	void insert(DrinkSizeVO drinkSizeVO);

	// <!-- 3. 수정하기 -->
	void update(DrinkSizeVO drinkSizeVO);

	// <!-- 4. 삭제하기 -->
	void delete(int idx);

}
