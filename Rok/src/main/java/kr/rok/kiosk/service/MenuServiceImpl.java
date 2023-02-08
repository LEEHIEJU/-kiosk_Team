package kr.rok.kiosk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.rok.kiosk.dao.MenuDAO;
import kr.rok.kiosk.vo.MenuVO;

@Service("MenuService")
public class MenuServiceImpl implements MenuService{
	
	@Autowired
	private MenuDAO MenuServiceDAO;

	@Override
	public List<MenuVO> MenuList() {
		List<MenuVO> list = null;
		try {
			list = MenuServiceDAO.MenuList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
