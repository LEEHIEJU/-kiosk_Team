package kr.hizju.cafekiosk.service;

import java.util.List;
import java.util.Map;

import kr.hizju.cafekiosk.vo.MenuVO;

public interface MenuService {

	List<MenuVO> menulist();

	// 저장하기
	boolean insert(Map<String, Object> menuMap);

	// 수정하기
	boolean update(Map<String, Object> menuMap);

	// 삭제하기
	boolean delete(Map<String, Object> menuMap);

}
