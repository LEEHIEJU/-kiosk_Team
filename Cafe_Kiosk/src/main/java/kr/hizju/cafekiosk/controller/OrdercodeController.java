package kr.hizju.cafekiosk.controller;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hizju.cafekiosk.service.OrdercodeService;
import kr.hizju.cafekiosk.vo.OrderCodeVO;
import kr.hizju.cafekiosk.vo.OrderNumVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class OrdercodeController {

	@Autowired
	private OrdercodeService ordercodeService;

	@GetMapping("/")
	public String today(Model model) {
		log.info("severTime {} : ", LocalDateTime.now());
		model.addAttribute("serverTime", LocalDateTime.now());
		return "index";

	}

	@GetMapping("/ordercodepage")
	public List<OrderCodeVO> ordercodepage(String orderwhere) {
		List<OrderCodeVO> orderList = ordercodeService.ordercodepage(orderwhere);
		log.info("받은값 : {} ", orderwhere);
		return orderList;

	}

	@GetMapping("/orderpage")
	public List<OrderNumVO> orderpage(String ordernum) {
		List<OrderNumVO> orderdetaillist = ordercodeService.orderpage(ordernum);
		log.info("받은값 : {} ", ordernum);
		return orderdetaillist;

	}

	@PostMapping("/orderinfo") // post : 입력
	public String orderinfo(@ModelAttribute OrderCodeVO orderCodeVO) {
		log.info("저장값 : {}", orderCodeVO);
		 Calendar cal = Calendar.getInstance();
		 int year = cal.get(Calendar.YEAR);
		 String ym = year + new DecimalFormat("00").format(cal.get(Calendar.MONTH) + 1);
		 String ymd = ym +  new DecimalFormat("00").format(cal.get(Calendar.DATE));
		 String subNum = "";
		 
		 for(int i = 1; i <= 6; i ++) {
		  subNum += (int)(Math.random() * 10);
		 }
		 
		@SuppressWarnings("unused")
		String orderId = ymd + "_" + subNum;
		ordercodeService.orderinfo(orderCodeVO);
		return "Menu";
	}

	@PostMapping("/orderdetail") // post : 입력
	public String orderdetail(@ModelAttribute OrderNumVO orderNumVO) {
		log.info("저장값 : {}", orderNumVO);
		ordercodeService.orderdetail(orderNumVO);
		return "Menu";
	}

}
