package kr.hizju.cafekiosk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.hizju.cafekiosk.service.MenuService;
import kr.hizju.cafekiosk.vo.DrinksizeVO;
import kr.hizju.cafekiosk.vo.MenuVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MenuController {

	@Autowired
	private MenuService menuService;

	@GetMapping(value = {"/menu"}) // get : 조회
	public String menulist(Model model) {
		List<MenuVO> list = menuService.menulist();
		log.info("리스트 : {}", menuService.menulist());
		model.addAttribute("menulist", list);
		return "Menu";
	}
	@ResponseBody
	@GetMapping(value = {"/menuSize"}) // get : 조회
	public List<DrinksizeVO> menuSize(@RequestParam() String foodnum) {
		log.info("받은값 : {}", foodnum);
		List<DrinksizeVO> drinksizelist = menuService.drinksizevo(foodnum);
		log.info("drinksizelist : {}", drinksizelist);
		return drinksizelist;
	}

	
	@GetMapping("/menuhigh")
	public String menuinfo(@RequestParam String foodprice, Model model) {
		log.info("받은값 : {}", foodprice);
		List<MenuVO> menuVO = menuService.menuinfo(foodprice);
		model.addAttribute("menuinfo", menuVO);
		return "Menu";
	}
	
	@GetMapping("/menucategory")
	public String menucate(@RequestParam String foodtype, Model model) {
		List<MenuVO> menucate = menuService.menucategory(foodtype);
		log.info("받은값 : {}", foodtype);
		model.addAttribute("menulist", menucate);
		return "Menu";
	}

}
