package kr.rok.kiosk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.rok.kiosk.dao.DrinkSizeDAO;
import kr.rok.kiosk.vo.DrinkSizeVO;

@Service("DrinkSizeService")
public class DrinkSizeServiceImpl implements DrinkSizeService{
	
	@Autowired
	private DrinkSizeDAO DrinkSizeDAO;

	@Override
	public List<DrinkSizeVO> DrinkSizeList() {
		List<DrinkSizeVO> list = null;
		try {
			list = DrinkSizeDAO.DrinkSizeList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
