package kr.hizju.cafekiosk.service;

import java.util.List;

import kr.hizju.cafekiosk.vo.DrinksizeVO;
import kr.hizju.cafekiosk.vo.MenuVO;

public interface MenuService {

	// 커피 메뉴 보여주기
	List<MenuVO> menulist();
	
	// 음료 사이즈 별 가격 확인하기
	List<DrinksizeVO> drinksizevo(String foodnum);
	
	// 하나의 메뉴 보여주기
	List<MenuVO> menuinfo(String foodnum);
	
	// 메뉴 카테고리
	List<MenuVO> menucategory(String foodtype);


}
