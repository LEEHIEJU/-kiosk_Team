package kr.hizju.cafekiosk.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.hizju.cafekiosk.service.OrdercodeService;
import kr.hizju.cafekiosk.vo.OrderCodeVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@RestController
@Slf4j
public class OrdercodeController {
	
	@Autowired
	private OrdercodeService ordercodeService;

	@GetMapping("/")
	public List<OrderCodeVO> ordercodepage(Model model){
		List<OrderCodeVO> orderList = ordercodeService.ordercodepage();
		model.addAttribute("serverTime", LocalDateTime.now());
		log.info("주문화면 {} : ", ordercodeService.ordercodepage());
		
		return orderList;
		
	}

}
