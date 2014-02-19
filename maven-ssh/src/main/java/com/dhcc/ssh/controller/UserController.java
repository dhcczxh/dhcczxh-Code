package com.dhcc.ssh.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhcc.ssh.entity.User;

/**
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("user")  
public class UserController {  
	  
	    // ajax请求一  
	    @RequestMapping("addUser")  
	    public void addUser(User user, HttpServletRequest request,  
	            HttpServletResponse response) {  
	        // 这里不能用单引号,无效,死的心都有  
	        System.out.println("过来了");  
	        String result = "{\"name\":\"" + user.getUserName() + "\"}";  
	        PrintWriter out = null;  
	        System.out.println(result);  
	        response.setContentType("application/json");  
	        try {  
	            out = response.getWriter();  
	            out.write(result);  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }  
	}  

