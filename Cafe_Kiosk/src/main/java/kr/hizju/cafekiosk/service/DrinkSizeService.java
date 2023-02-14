package kr.hizju.cafekiosk.service;

import java.util.List;

import kr.hizju.cafekiosk.vo.DrinkSizeVO;

public interface DrinkSizeService {
	
	List<DrinkSizeVO> drinksizelist();
	
	void sizeup(DrinkSizeVO drinkSizeVO);
	
	void iceup(DrinkSizeVO drinkSizeVO);

}
