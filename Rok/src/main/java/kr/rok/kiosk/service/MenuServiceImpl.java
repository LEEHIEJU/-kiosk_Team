package kr.rok.kiosk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.rok.kiosk.dao.MenuDAO;
import kr.rok.kiosk.vo.DrinkSizeVO;
import kr.rok.kiosk.vo.MenuVO;

@Service("MenuService")
public class MenuServiceImpl implements MenuServiceImpl{
	@Autowired
	private MenuDAO menuDAO;


}
