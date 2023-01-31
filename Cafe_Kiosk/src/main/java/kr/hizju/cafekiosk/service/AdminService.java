package kr.hizju.cafekiosk.service;

import java.util.List;

import kr.hizju.cafekiosk.vo.AdminVO;
import kr.hizju.cafekiosk.vo.MenuVO;

public interface AdminService {
	
	List<AdminVO> selectList();

}
