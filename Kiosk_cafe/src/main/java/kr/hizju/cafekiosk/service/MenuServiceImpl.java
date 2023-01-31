package kr.hizju.cafekiosk.service;

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
	public List<MenuVO> selectList() {
		List<MenuVO> list = null;
		try {
			list = menuDAO.selectList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
