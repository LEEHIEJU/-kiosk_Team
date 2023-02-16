package kr.hizju.cafekiosk.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kr.hizju.cafekiosk.dao.DrinkSizeDAO;
import kr.hizju.cafekiosk.vo.DrinkSizeVO;

public class DrinkSizeServiceImpl implements DrinkSizeService {

	@Autowired
	private DrinkSizeDAO drinkSizeDAO;

	@Override
	public List<DrinkSizeVO> drinksizelist() {
		List<DrinkSizeVO> sizelist = null;
		try {
			sizelist = drinkSizeDAO.drinksizelist();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return sizelist;
	}

	@Override
	public void sizeup(DrinkSizeVO drinkSizeVO) {

	}

	@Override
	public void iceup(DrinkSizeVO drinkSizeVO) {

	}

}
