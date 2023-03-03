package kr.hizju.cafekiosk.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hizju.cafekiosk.dao.AdminDAO;
import kr.hizju.cafekiosk.vo.AdminVO;
import kr.hizju.cafekiosk.vo.MenuVO;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDAO adminDAO;

	// 관리자 로그인
	@Override
	public AdminVO pw(String adminpw) {
		try {
			return adminDAO.pw(adminpw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// 관리자 메뉴 저장
	@Override
	public boolean insert(MenuVO menuVO) {
		try {
			adminDAO.insert(menuVO);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return true;
	}

	// 관리자 메뉴 수정
	@Override
	public boolean update(MenuVO menuVO) {
		try {
			adminDAO.update(menuVO);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return true;
	}

	// 관리자 메뉴 삭제
	@Override
	public boolean delete(String foodnum) {
		try {
			adminDAO.delete(foodnum);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return true;
	}

	

}
