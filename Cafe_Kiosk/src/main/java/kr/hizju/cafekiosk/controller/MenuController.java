package kr.hizju.cafekiosk.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.hizju.cafekiosk.service.MenuService;
import kr.hizju.cafekiosk.vo.MenuVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@RestController
@Slf4j
public class MenuController {

	@Autowired
	private MenuService menuService;

	@GetMapping("/menu")
	public List<MenuVO> menulist() {
		List<MenuVO> list = menuService.menulist();
		log.info("받은값 : {}", menuService.menulist());
		return list;
	}
	
	@GetMapping("/insertmenu")
	public boolean insert(Map<String, Object> menuMap) {
		menuService.insert(menuMap);
		log.info("저장값 : {}", menuService.menulist());

		return true;
	}

	@GetMapping("/updatemenu")
	public boolean update(Map<String, Object> menuMap) {
		menuService.update(menuMap);
		log.info("수정값 : {}", menuService.menulist());
		
		return true;
	}

	@GetMapping("/deletemenu")
	public boolean delete(Map<String, Object> menuMap) {
		menuService.delete(menuMap);
		log.info("삭제값 : {}", menuService.menulist());
		
		return true;
	}

}
