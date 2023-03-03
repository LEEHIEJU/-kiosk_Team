package kr.hizju.cafekiosk.controller;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.hizju.cafekiosk.service.AdminService;
import kr.hizju.cafekiosk.vo.MenuVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class AdminController {

	@Autowired
	private AdminService adminService;

	// 관리자 로그인
	@GetMapping("/admin")
	public String pw(Model model) {
		model.addAttribute("serverTime", LocalDateTime.now());
		model.addAttribute("adminVO", adminService.pw("1234"));
		log.info("받은값 : {}", adminService.pw("1234"));
		return "Admin";
	}
	
	// 관리자 메뉴 저장
	@ResponseBody
	@PostMapping("/insertmenu") // post : 입력
	public String insert(@ModelAttribute MenuVO menuVO) {
		log.info("저장값 : {}", menuVO);
		adminService.insert(menuVO);
		return "Admin";
	}
	// 관리자 메뉴 수정
	@ResponseBody
	@PutMapping("/updatemenu") // put : 수정
	public String update(@ModelAttribute MenuVO menuVO) {
		log.info("수정값 : {}", menuVO);
		adminService.update(menuVO);
		
		return "Admin";
	}
	// 관리자 메뉴 삭제
	@ResponseBody
	@DeleteMapping("/deletemenu") // delete : 삭제
	public String delete(@RequestParam String foodnum) {
		log.info("삭제값 : {}", foodnum);
		adminService.delete(foodnum);
		
		return "Admin";
	}

}
