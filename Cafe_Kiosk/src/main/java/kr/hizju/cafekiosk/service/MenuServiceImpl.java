package kr.hizju.cafekiosk.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hizju.cafekiosk.dao.MenuDAO;
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
	public boolean insert(Map<String, Object> menuMap) {
		try {
			menuDAO.insert(menuMap);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean update(Map<String, Object> menuMap) {
		try {
			menuDAO.update(menuMap);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean delete(Map<String, Object> menuMap) {
		try {
			menuDAO.delete(menuMap);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return true;
	}

	
}
