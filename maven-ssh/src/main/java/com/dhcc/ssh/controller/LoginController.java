package com.dhcc.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dhcc.ssh.service.IUserService;

/**
 * 
 * @author zhouxihua
 * @version
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private IUserService userService;
	
    @RequestMapping("/hanndleRequest")
	public ModelAndView handleRequest(@RequestParam("userName") String userName , @RequestParam("userPassword") String userPassword) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav=null;  
		mav = new ModelAndView();
		
		try{
			
			boolean bool = userService.verifyUserByUserNameAndPassword(userName, userPassword);
			if(bool){
				mav.setViewName("index");
				mav.addObject("msg","登录成功");
			}else{
				mav.setViewName("login");
				mav.addObject("msg","登录失败，请重新登录！");
			}
		}catch(RuntimeException e){
			mav.setViewName("login");
			mav.addObject("msg","登录超时！");
		}
		
		return mav ;
		
	}

}
