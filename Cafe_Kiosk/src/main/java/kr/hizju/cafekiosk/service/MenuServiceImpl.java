package kr.hizju.cafekiosk.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hizju.cafekiosk.dao.MenuDAO;
import kr.hizju.cafekiosk.vo.DrinksizeVO;
import kr.hizju.cafekiosk.vo.MenuVO;

@Service("menuService")
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDAO menuDAO;

	@Override
	public List<MenuVO> menulist() {
		List<MenuVO> list = null;
		try {
			list = menuDAO.menulist();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<DrinksizeVO> drinksizevo(String foodnum) {
		List<DrinksizeVO> drinksizelist = null;
		try {
			drinksizelist = menuDAO.drinksizevo(foodnum);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return drinksizelist;
	}
	
	@Override
	public List<MenuVO> menuinfo(String foodnum) {
		List<MenuVO> menuVO = null;
		try {
			menuVO = menuDAO.menuinfo(foodnum);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return menuVO;
	}

	@Override
	public List<MenuVO> menucategory(String foodtype) {
		List<MenuVO> menucate = null;
		try {
			menucate = menuDAO.menucategory(foodtype);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return menucate;
	}

}
