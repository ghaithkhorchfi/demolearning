package com.example.demoelarning.serviceImpl;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demoelarning.service.UploadFileService;
@Service
public class UploadFileServiceImpl implements UploadFileService {

	@Override
	public void uploadFile(MultipartFile file) throws IllegalStateException, IOException {
		// TODO Auto-generated method stub
		file.transferTo(new File("D:\\uploadFile\\"+file.getOriginalFilename()));
		
	}

}
