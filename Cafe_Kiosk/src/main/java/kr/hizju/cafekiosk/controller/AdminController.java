package kr.hizju.cafekiosk.controller;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.hizju.cafekiosk.service.AdminService;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class AdminController {

	@Autowired
	private AdminService adminService;

	@GetMapping("/")
	public String Admin(Model model) {
		model.addAttribute("serverTime", LocalDateTime.now());
		model.addAttribute("adminVO", adminService.pw("1234"));
		log.info("받은값 : {}", adminService.pw("1234"));
		return "Admin";
	}
}
