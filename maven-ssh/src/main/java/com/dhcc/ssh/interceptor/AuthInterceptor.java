package com.dhcc.ssh.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * 
 * @author Administrator
 * @创建时间 
 *
 */
@Component
public class AuthInterceptor extends HandlerInterceptorAdapter{

	    @Override  
	    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {  
	        System.out.println("===========HandlerInterceptor1 preHandle");  
	        return true;  
	    }  
	    @Override  
	    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {  
	        System.out.println("===========HandlerInterceptor1 postHandle");  
	    }  
	    @Override  
	    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {  
	        System.out.println("===========HandlerInterceptor1 afterCompletion");  
	    }  

}
