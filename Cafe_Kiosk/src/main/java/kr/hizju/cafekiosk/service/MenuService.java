package kr.hizju.cafekiosk.service;

import java.util.List;

import kr.hizju.cafekiosk.vo.DrinksizeVO;
import kr.hizju.cafekiosk.vo.MenuVO;

public interface MenuService {

	// 커피 메뉴 보여주기
	List<MenuVO> menulist();
	
	List<DrinksizeVO> drinksizevo(String foodnum);
	
	// 하나의 메뉴 보여주기
	List<MenuVO> menuinfo(String foodnum);
	
	// 음료 사이즈업(가격)
	List<MenuVO> sizeup(String drinksizetype);
	
	// 메뉴 카테고리
	List<MenuVO> menucategory(String foodtype);
	
	// 저장하기
	boolean insert(MenuVO menuVO);

	// 수정하기
	boolean update(MenuVO menuVO);

	// 삭제하기
	boolean delete(String foodnum);

}
