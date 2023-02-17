package kr.hizju.cafekiosk.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hizju.cafekiosk.service.DrinkSizeService;
import kr.hizju.cafekiosk.vo.DrinkSizeVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DrinkSizeController {

	@Autowired
	private DrinkSizeService drinkSizeService;

	@GetMapping("/drinksize")
	public List<DrinkSizeVO> sizeup(@RequestParam String drinksizetype) {
		log.info("음료사이즈 {} =", drinksizetype);
		List<DrinkSizeVO> drinkSizeVO = drinkSizeService.sizeup(drinksizetype);
		return drinkSizeVO;
	}
	
}
