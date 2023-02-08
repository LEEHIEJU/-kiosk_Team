package kr.rok.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.rok.kiosk.service.MenuService;

@Controller
public class MenuController {
	@Autowired
	private MenuService MenuService;

	@GetMapping("/menu")
	public String selectList() {

		return "menu";
	}

}
