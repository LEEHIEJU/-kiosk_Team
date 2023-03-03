package kr.hizju.cafekiosk.service;

import kr.hizju.cafekiosk.vo.AdminVO;
import kr.hizju.cafekiosk.vo.MenuVO;

public interface AdminService {
	
	// 관리자 로그인
	AdminVO pw(String adminpw);
		
	// 메뉴 저장하기
	boolean insert(MenuVO menuVO);

	// 메뉴 수정하기
	boolean update(MenuVO menuVO);

	// 메뉴 삭제하기
	boolean delete(String foodnum);

}
