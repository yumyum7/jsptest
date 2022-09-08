package com.cat.img;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MungController {
	
	
	private final ImageService imageService;
	
	@PostMapping("/upload")
	public String uploadFile(@RequestPart MultipartFile file, @RequestParam String fileDesc) throws IOException{
		String fileurl = imageService.uploadfile(file);	
		this.imageService.save(file.getOriginalFilename(),fileurl, fileDesc);
		return "img";
	}
	
	@GetMapping("/upload")
	public String uploadFile(){
		return "img";
	}
}
