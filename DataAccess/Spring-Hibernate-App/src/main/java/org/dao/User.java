package org.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 
@Entity
@Table(name="UserTable")
public class User
{
	
	 /* 
	 * Properties
	 */
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	private double balance; 

	 
	/** 
	 * Setters and getters for the properties
	 */
	public String getName()
	{
		return name;
	}
	public void setName(String n) 
	{
		this.name = n;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double bal)
	{
		this.balance = bal;
	}	 

}
