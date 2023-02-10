package kr.hizju.cafekiosk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hizju.cafekiosk.dao.AdminDAO;
import kr.hizju.cafekiosk.vo.AdminVO;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDAO adminDAO;

	@Override
	public List<AdminVO> admin() {
		return null;
	}
	

}
