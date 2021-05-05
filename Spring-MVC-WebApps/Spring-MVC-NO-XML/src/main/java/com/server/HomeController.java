package com.server;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
 
import org.springframework.stereotype.Controller;
 
import org.springframework.web.bind.annotation.RequestMethod;
 
import org.springframework.web.bind.annotation.ResponseBody;



//The spring app bootstrap without any xml
@Controller
@RequestMapping("/home")
public class HomeController  {
	 
	@RequestMapping(value="/update",method=RequestMethod.GET)
	//@ResponseBody
	public String getResponse(){
	//	return "Updating";
		return "home";
	}
}
/*public class HomeController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		return new ModelAndView("home");
	}

}*/