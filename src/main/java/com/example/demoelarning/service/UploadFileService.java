package com.example.demoelarning.service;

import java.io.IOException;


import org.springframework.web.multipart.MultipartFile;


public interface UploadFileService {
	public void uploadFile(MultipartFile file) throws IllegalStateException, IOException;

}
