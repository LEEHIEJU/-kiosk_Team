package kr.hizju.cafekiosk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

	@GetMapping("/search")
	public String menuSearch(Model model) {

		return "menuSearch";
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
