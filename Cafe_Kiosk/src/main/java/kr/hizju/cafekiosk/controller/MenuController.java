package kr.hizju.cafekiosk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.hizju.cafekiosk.service.MenuService;

@Controller
public class MenuController {

	@Autowired
	private MenuService menuService;

	@GetMapping("/menu")
	public String menulist() {

		return "menu";
	}
	
	@GetMapping("/search")
	public String menusearch() {

		return "search";
	}
	
	@GetMapping("/insert")
	public String insert() {

		return "insert";
	}
	
	@GetMapping("/update")
	public String update() {

		return "update";
	}
	
	@GetMapping("/delete")
	public String delete() {

		return "delete";
	}

}
