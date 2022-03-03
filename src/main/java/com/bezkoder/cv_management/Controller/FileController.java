package com.bezkoder.cv_management.Controller;

import java.io.IOException;

import com.bezkoder.cv_management.Service.FileService;
import com.bezkoder.cv_management.Utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping(value = "/api/v1/files")
public class FileController {

	@Autowired
	private FileService fileService;

	@PostMapping(value = "/fileCV")
	public ResponseEntity<?> upLoadImage(@RequestParam(name = "fileCV") MultipartFile filecv) throws IOException {

		if (!new FileUtils().isTypeFilePdf(filecv)) {
			return new ResponseEntity<>("File must be PDF!", HttpStatus.UNPROCESSABLE_ENTITY);
		}	
		
		return new ResponseEntity<>(fileService.uploadFileCv(filecv), HttpStatus.OK);
	}
}
