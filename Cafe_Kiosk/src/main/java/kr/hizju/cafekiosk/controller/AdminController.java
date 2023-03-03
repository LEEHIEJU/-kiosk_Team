package kr.hizju.cafekiosk.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;
import kr.hizju.cafekiosk.service.AdminService;
import kr.hizju.cafekiosk.vo.AdminVO;
import kr.hizju.cafekiosk.vo.MenuVO;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AdminController {
	
	@Autowired
	private AdminService adminService;

	// 관리자 로그인페이지
	@GetMapping("/admin")
	public ModelAndView pw(HttpSession session, AdminVO adminvo, ModelAndView mav) {
		String name = adminService.pw(adminvo);
		// 로그인 성공
		if(name != null) {
			session.setAttribute("admin", adminvo);
			mav.setViewName("/admin/adminhome"); // 관리자 페이지 이동
			mav.addObject("msg", "success");
		// 로그인 실패
		}else {
			mav.setViewName("/admin/adminlogin");// 로그인 페이지 이동
			mav.addObject("msg", "fail");
		}
		return mav;
	}
	
	/* url을 다르게 지정하여 페이지를 이동할건지? 여부 확인 후 입력
	   프론트에서 if문 써서 로그인 성공시 메뉴 저장
	*/
	
	// 관리자 메뉴 저장
	@PostMapping("/admin/insertmenu") // post : 입력
	public String insert(@ModelAttribute MenuVO menuVO) {
		log.info("저장값 : {}", menuVO);
		adminService.insert(menuVO);
		return "Admin";
	}
	// 관리자 메뉴 수정
	@PutMapping("/updatemenu") // put : 수정
	public String update(@ModelAttribute MenuVO menuVO) {
		log.info("수정값 : {}", menuVO);
		adminService.update(menuVO);
		
		return "Admin";
	}
	// 관리자 메뉴 삭제
	@DeleteMapping("/deletemenu") // delete : 삭제
	public String delete(@RequestParam String foodnum) {
		log.info("삭제값 : {}", foodnum);
		adminService.delete(foodnum);
		
		return "Admin";
	}

}
