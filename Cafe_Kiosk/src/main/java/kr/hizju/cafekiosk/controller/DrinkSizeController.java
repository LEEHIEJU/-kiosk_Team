package kr.hizju.cafekiosk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.hizju.cafekiosk.service.DrinkSizeService;
import kr.hizju.cafekiosk.vo.DrinkSizeVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DrinkSizeController {

	@Autowired
	private DrinkSizeService drinkSizeService;

	@GetMapping("/drinksize") // get : 조회
	public List<DrinkSizeVO> drinksizelist() {
		log.info("받은값 : {}", drinkSizeService.drinksizelist());
		List<DrinkSizeVO> sizelist = drinkSizeService.drinksizelist();
		return sizelist;
	}
	
}
