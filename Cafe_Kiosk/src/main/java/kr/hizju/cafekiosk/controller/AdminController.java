package kr.hizju.cafekiosk.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.hizju.cafekiosk.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;

	@GetMapping("/")
	public String adminpw() {
		
		return "adminpw";
	}
}
