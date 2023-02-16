package kr.hizju.cafekiosk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.hizju.cafekiosk.service.MenuService;
import kr.hizju.cafekiosk.vo.MenuVO;
import lombok.extern.slf4j.Slf4j;

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
	
	@GetMapping("/menuone")
	public MenuVO menuVO(@RequestParam String foodnum) {
		log.info("받은값 : {}", foodnum);
		MenuVO menuVO = menuService.menuinfo(foodnum);
		return menuVO;
	}
	
	@PostMapping("/insertmenu")
	public String insert(@ModelAttribute MenuVO menuVO) {
		log.info("저장값 : {}", menuVO);
		menuService.insert(menuVO);

		return "main";
	}

	@PutMapping("/updatemenu")
	public boolean update(@ModelAttribute MenuVO menuVO) {
		log.info("수정값 : {}", menuVO);
		menuService.update(menuVO);
		
		return true;
	}

	@DeleteMapping("/deletemenu")
	public boolean delete(@RequestParam String foodnum) {
		log.info("삭제값 : {}", foodnum);
		menuService.delete(foodnum);
		
		return true;
	}

}
