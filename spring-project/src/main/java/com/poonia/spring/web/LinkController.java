package com.poonia.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Web Component which can Handle HttpRequest & Generate HttpResponse
@Controller
public class LinkController {

	//http://127.0.0.1:8080/tesco/
	//This URI gets Mapped To home.jsp
	@RequestMapping(value="/")
	public ModelAndView mainPage()
	{
		return new ModelAndView("home");
	}
	
	//http://127.0.0.1:8080/tesco/indexes
		//This URI gets Mapped To home.jsp
		@RequestMapping(value="/index")
		public ModelAndView indexPage()
		{
			return new ModelAndView("home");
		}
	
}
