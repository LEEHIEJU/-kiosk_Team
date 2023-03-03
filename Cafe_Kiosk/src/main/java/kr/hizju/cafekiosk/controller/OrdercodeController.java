package kr.hizju.cafekiosk.controller;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.hizju.cafekiosk.service.OrdercodeService;
import kr.hizju.cafekiosk.vo.OrderCodeVO;
import kr.hizju.cafekiosk.vo.OrderNumVO;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class OrdercodeController {

	@Autowired
	private OrdercodeService ordercodeService;

	// 주문화면
	@GetMapping("/")
	public String orderpage(Model model, String orderwhere) {
		List<OrderCodeVO> orderlist = ordercodeService.orderpage(orderwhere);
		model.addAttribute("orderpage", orderlist);
		return "OrderPage";

	}

	// 주문목록
	@GetMapping("/orderhistory")
	public String orderhistory(Model model, String ordernum) {
		List<OrderNumVO> orderhistorylist = ordercodeService.orderhistory(ordernum);
		log.info("받은값 : {} ", ordernum);
		model.addAttribute(ordernum, orderhistorylist);
		return "OrderPage";

	}

	// 주문하기(매장/포장)
	@PostMapping("/orderinfo") // post : 입력
	public String orderinfo(@ModelAttribute OrderCodeVO orderCodeVO) {
		log.info("저장값 : {}", orderCodeVO);
		ordercodeService.orderinfo(orderCodeVO);
		return "Menu";
	}

	// 주문하기(메뉴)
	@PostMapping("/orderinsert") // post : 입력
	public String orderdetail(@ModelAttribute OrderNumVO orderNumVO) {
		log.info("저장값 : {}", orderNumVO);
		// 주문번호 자동입력
		Calendar cal = Calendar.getInstance();
		 int year = cal.get(Calendar.YEAR);
		 String ym = year + new DecimalFormat("00").format(cal.get(Calendar.MONTH) + 1);
		 String ymd = ym +  new DecimalFormat("00").format(cal.get(Calendar.DATE));
		 String subNum = "";
		 
		 for(int i = 1; i <= 6; i ++) {
		// 랜덤으로 입력
		  subNum += (int)(Math.random() * 10);
		 }
		 
		@SuppressWarnings("unused")
		String orderId = ymd + "_" + subNum;
		ordercodeService.orderdetail(orderNumVO);
		return "Menu";
	}
	
	// 주문수정(메뉴)
	@PutMapping("/orderupdate")
	public String orderupdate(@ModelAttribute OrderNumVO orderNumVO) {
		log.info("수정값 : {}", orderNumVO);
		ordercodeService.orderupdate(orderNumVO);
		return "Menu";
	}
	
	// 주문삭제(메뉴)
	@DeleteMapping("/orderdelete")
	public String orderdelete(@ModelAttribute String ordernum) {
		log.info("삭제값 : {}", ordernum);
		ordercodeService.orderdelete(ordernum);
		return "Menu";
	}

}
