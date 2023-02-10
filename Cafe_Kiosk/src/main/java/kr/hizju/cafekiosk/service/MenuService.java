package kr.hizju.cafekiosk.service;

import java.util.List;

import org.springframework.ui.Model;

import kr.hizju.cafekiosk.vo.MenuVO;

public interface MenuService {

	List<MenuVO> menulist();

	// 검색하기
	void menusearch(MenuVO menuVO);

	// 저장하기
	void insert(MenuVO menuVO);

	// 수정하기
	void update(MenuVO menuVO);

	// 삭제하기
	void delete(int idx);

}
