package kr.hizju.cafekiosk.vo;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
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
