package com.cat.img;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService {
	
	@Autowired
	FiledsRepository filedsRepository;
	
	
	public void save(String oriname, String url, String Desc) {
		Image i = new Image();
		
		i.setFileOriName(oriname);
		i.setFileUrl(url);
		i.setImgDesc(Desc);
		filedsRepository.save(i);
	}
	
	
	
	public String uploadfile(MultipartFile file) throws IOException{
		file.transferTo(new File("C:\\bootworkspace\\TumblCat\\src\\main\\resources\\static\\img\\" + file.getOriginalFilename()));
		String fileurl = "C:\\bootworkspace\\TumblCat\\src\\main\\resources\\static\\img\\" + file.getOriginalFilename();
		return fileurl;
	}

}
