package kr.hizju.cafekiosk.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hizju.cafekiosk.dao.AdminDAO;
import kr.hizju.cafekiosk.vo.AdminVO;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDAO adminDAO;

	@Override
	public AdminVO pw(String adminpw) {
		try {
			return adminDAO.pw(adminpw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
