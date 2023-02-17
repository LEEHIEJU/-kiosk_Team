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

	@GetMapping("/menu") // get : 조회
	public List<MenuVO> menulist() {
		List<MenuVO> list = menuService.menulist();
		log.info("받은값 : {}", menuService.menulist());
		return list;
	}
	
	@GetMapping("/menuone")
	public List<MenuVO> menuVO(@RequestParam String foodnum) {
		log.info("받은값 : {}", foodnum);
		List<MenuVO> menuVO = menuService.menuinfo(foodnum);
		return menuVO;
	}
	
	@GetMapping("/drinksize")
	public List<MenuVO> sizeup(@RequestParam String drinksizetype) {
		log.info("음료사이즈 {} =", drinksizetype);
		List<MenuVO> menusize = menuService.sizeup(drinksizetype);
		return menusize;
	}
	
	@GetMapping("/menucategory")
	public List<MenuVO> menucate(@RequestParam String foodtype) {
		log.info("받은값 : {}", foodtype);
		List<MenuVO> menucate = menuService.menucategory(foodtype);
		return menucate;
	}
	
	
	@PostMapping("/insertmenu") // post : 입력
	public String insert(@ModelAttribute MenuVO menuVO) {
		log.info("저장값 : {}", menuVO);
		menuService.insert(menuVO);

		return "main";
	}

	@PutMapping("/updatemenu") // put : 수정
	public boolean update(@ModelAttribute MenuVO menuVO) {
		log.info("수정값 : {}", menuVO);
		menuService.update(menuVO);
		
		return true;
	}

	@DeleteMapping("/deletemenu") // delete : 삭제
	public boolean delete(@RequestParam String foodnum) {
		log.info("삭제값 : {}", foodnum);
		menuService.delete(foodnum);
		
		return true;
	}

}
