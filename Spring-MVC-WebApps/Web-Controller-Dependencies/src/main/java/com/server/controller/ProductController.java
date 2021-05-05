   package com.server.controller;
   
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.*;

import java.io.IOException;
import java.util.*;   
 
@Controller
public class ProductController  
{

    private ProductManager prodMan;

	@Autowired  //by constructor
	public ProductController(ProductManager manager) 
	{
		System.out.println("ProductController injectd with  Product Manager "+manager);
		prodMan = manager;
	}
	
	@RequestMapping("/products")
	public ModelAndView process()
		{
		System.out.println("ProductController - returning product view");

        
		String now = (new java.util.Date()).toString(); 
		Map myModel = new HashMap();
        myModel.put("MyDate", now);
        myModel.put("products", prodMan.getProducts());
        return new ModelAndView("productPage", "model", myModel); 	 
 

	   } 
	 


}
