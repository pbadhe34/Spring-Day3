package com.server.controller;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class ProductManager implements Serializable 
{   
	private List products; 

	///private final List<Product> products = new //ArrayList<Product>();

	/*@Autowired
	public void init(Product p1,) */
	
    @Autowired
	public void setProducts(List p)
	{       
		products = p; 
	}  
	public List getProducts()
	{       
		return products; 
	} 
	 
}