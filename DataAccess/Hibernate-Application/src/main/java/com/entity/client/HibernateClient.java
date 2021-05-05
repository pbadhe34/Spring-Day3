 
  
package com.entity.client;

 

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
 
 
public class HibernateClient {

	public static void main(String[] args) {
		Session session=null;	
		Transaction tx=null;
		Long personId=null;
		try{
		   session = HibernateUtil.getSessionFactory().openSession();
		   tx=  session.beginTransaction();//start a new transaction
		
		    
		    Employee pojo = new Employee();
		    pojo.setId(new Integer(5));
		    pojo.setName("Kaba");		     
		
	       session.save(pojo); 
	       session.flush();//fire the query
	      
	       
	       System.out.println("Employee saved with id  "+pojo.getId());
	       
	      Employee emp = (Employee) session.load(Employee.class, 5);
	      System.out.println("Employee name loaded is "+emp.getName());
	      
	      emp.setName("new name here");
	      tx.commit();//fire the query and commit
	      
	      session.close();
	      HibernateUtil.getSessionFactory().close();	      
		
		}
		catch(HibernateException he)
		{
			he.printStackTrace();
			tx.rollback();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			tx.rollback();
		}
		
		
	}
}
