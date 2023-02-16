package kr.hizju.cafekiosk.service;

import java.util.List;

import kr.hizju.cafekiosk.vo.MenuVO;

public interface MenuService {

	// 전체 메뉴 보여주기
	List<MenuVO> menulist();

	// 하나의 메뉴 보여주기
	MenuVO menuinfo(String foodnum);
	
	// 메뉴 카테고리
	List<MenuVO> menucategory(String foodtype);
	
	// 저장하기
	boolean insert(MenuVO menuVO);

	// 수정하기
	boolean update(MenuVO menuVO);

	// 삭제하기
	boolean delete(String foodnum);

}
