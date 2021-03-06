package com.dhcc.ssh.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @author zhouxihua
 * @version
 *
 */
@Controller

public class FileUpoadController {
	 @RequestMapping(value = "/formUpload", method = RequestMethod.POST)  
	    public String handleFormUpload(  
	        @RequestParam("file")  MultipartFile file) { 
	        if (!file.isEmpty()) {  
	            try {
					byte[] bytes = file.getBytes();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	           //在这里就可以对file进行处理了，可以根据自己的需求把它存到数据库或者服务器的某个文件夹  
	           return "redirect:uploadSuccess1.jsp";  
	       } else {  
	           return "redirect:uploadFailure.jsp";  
	       }  
	    }  
}
