package kr.hizju.cafekiosk.service;


import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hizju.cafekiosk.dao.DrinkSizeDAO;
import kr.hizju.cafekiosk.vo.DrinkSizeVO;

@Service("drinkSizeService")
public class DrinkSizeServiceImpl implements DrinkSizeService {

	@Autowired
	private DrinkSizeDAO drinkSizeDAO;

	@Override
	public List<DrinkSizeVO> sizeup(String drinksizetype) {
		List<DrinkSizeVO> drinkSizeVO = null;
		try {
			drinkSizeVO = drinkSizeDAO.sizeup(drinksizetype);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return drinkSizeVO;
		
	}

	
}
