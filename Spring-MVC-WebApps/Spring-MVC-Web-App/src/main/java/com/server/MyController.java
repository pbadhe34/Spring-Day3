 
package com.server; 
 
 

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

 

 
public class MyController implements Controller 
{

    

	/**
	 *ModelAndView Controller.handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public ModelAndView handleRequest
	(	HttpServletRequest request,
		HttpServletResponse response)throws ServletException, IOException 
		{
		System.out.println("MyController - returning work view");

		return new ModelAndView("work.jsp");
	    }

}
