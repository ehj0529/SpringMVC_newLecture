package com.newlecture.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mv = new ModelAndView("index"); //dispatcher-servlet에 설정함. 나머지 부분.
		mv.addObject("data", "Hello Spring MVC ~~");
		//mv.setViewName("/WEB-INF/view/index.jsp");
		//viewResolver 기능을 사용하게 되면 "/WEB-INF/view/.../.jsp"를 생략 할수 있음.
		
		
		return mv;
	}

}
