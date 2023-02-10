package kr.hizju.cafekiosk.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	public void menusearch(MenuVO menuVO) {

	}

	@Override
	public void insert(MenuVO menuVO) {

	}

	@Override
	public void update(MenuVO menuVO) {

	}

	@Override
	public void delete(int idx) {

	}

}
