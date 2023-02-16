package kr.hizju.cafekiosk.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileuploadVO {

	private String id; // 유니크한 파일 이름을 만들기 위한 속성
	private String filename; // 실제 파일 이름
	private String contentType; // 파일 종류
	
}
