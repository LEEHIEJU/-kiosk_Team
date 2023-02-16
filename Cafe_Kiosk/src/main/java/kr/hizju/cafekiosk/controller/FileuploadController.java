package kr.hizju.cafekiosk.controller;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.annotation.Resource;
import kr.hizju.cafekiosk.vo.FileuploadVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class FileuploadController {

	// application.properties에 등록된 파일의 경로를 가져온다.
		@Value("${spring.servlet.multipart.location}")
		String filePath;

		@GetMapping("/uploadForm")
		public String uploadForm() {
			return "uploadForm";
		}

		@PostMapping("/upload")
		// 업로드하는 파일들을 MultipartFile 형태의 파라미터로 전달된다.
		public String upload(@RequestParam MultipartFile[] uploadfile, Model model)
				throws IllegalStateException, IOException {
			List<FileuploadVO> list = new ArrayList<>();
			for (MultipartFile file : uploadfile) {
				if (!file.isEmpty()) {
					// UUID를 이용해 unique한 파일 이름을 만들어준다.
					FileuploadVO vo = new FileuploadVO(UUID.randomUUID().toString(), file.getOriginalFilename(), file.getContentType());
					list.add(vo);

					File newFileName = new File(vo.getId() + "_" + vo.getFilename());
					// 전달된 내용을 실제 물리적인 파일로 저장해준다.
					file.transferTo(newFileName);
				}
			}
			model.addAttribute("files", list);
			return "result";
		}


		@GetMapping("/download")
		public ResponseEntity<Resource> download(@ModelAttribute FileuploadVO vo) throws IOException {
			Path path = Paths.get(filePath + "/" + vo.getId() + "_" + vo.getFilename());
			log.info("경로 : " + path.toString());
			String contentType = Files.probeContentType(path);
			// header를 통해서 다운로드 되는 파일의 정보를 설정한다.
			HttpHeaders headers = new HttpHeaders();
			headers.setContentDisposition(ContentDisposition.builder("attachment").filename(vo.getFilename(), StandardCharsets.UTF_8).build());
			headers.add(HttpHeaders.CONTENT_TYPE, contentType);

			Resource resource = (Resource) new InputStreamResource(Files.newInputStream(path));
			return new ResponseEntity<>(resource, headers, HttpStatus.OK);
		}
	}
