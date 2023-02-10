package kr.hizju.cafekiosk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.hizju.cafekiosk.vo.AdminVO;

public interface AdminService {
	
	List<AdminVO> admin();

}
