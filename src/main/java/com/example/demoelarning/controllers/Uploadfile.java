package com.example.demoelarning.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demoelarning.service.UploadFileService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/upload")
public class Uploadfile {
	
	@Autowired
	UploadFileService uploadfile;
	@PostMapping
	public void uploadFile(@RequestBody MultipartFile file) throws IllegalStateException, IOException {
		this.uploadfile.uploadFile(file);

		
	}


}
