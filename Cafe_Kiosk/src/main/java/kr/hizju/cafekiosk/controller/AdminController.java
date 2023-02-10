package kr.hizju.cafekiosk.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.hizju.cafekiosk.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("serverTime", LocalDateTime.now());

		return "admin";
	}
}
