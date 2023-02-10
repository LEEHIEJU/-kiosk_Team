package kr.hizju.cafekiosk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hizju.cafekiosk.dao.MenuDAO;
import kr.hizju.cafekiosk.vo.DrinkSizeVO;
import kr.hizju.cafekiosk.vo.MenuVO;

@Service("menuService")
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDAO menuDAO;

	@Override
	public List<MenuVO> menulist() {
		// TODO Auto-generated method stub
		return null;
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
