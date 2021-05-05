 
 package com.server.controller;
 

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


 @Controller
public class MyController   
{  

	@RequestMapping("/work.htm")
	public ModelAndView handleMe()	  
		{
		System.out.println("MyController - returning work view");

		return new ModelAndView("work");
	    }

}
