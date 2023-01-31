package kr.hizju.cafekiosk.vo;

import lombok.Data;

@Data
public class AdminVO {
	
	private String adminpw;

	public AdminVO(String adminpw) {
		super();
		this.adminpw = adminpw;
	}

	@Override
	public String toString() {
		return "AdminVO [adminpw=" + adminpw + "]";
	}

}
