package org.dao;

 
 
import java.util.*;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

 
 
/**
 * Hibernate implementation of the UserDao.
 */

public class HibernateUserDao extends HibernateDaoSupport
implements UserDao
{
    public int add(User obj)
	{
          HibernateTemplate template = getHibernateTemplate();
          template.getSessionFactory().getCurrentSession().beginTransaction();
        
          Integer id = (Integer) template.save(obj);
         // template.flush();
          return id;
	}

    //UserDao implementations
     public User getUser(int id)
	 {
         HibernateTemplate template = getHibernateTemplate();
         User user = (User)template.get(User.class, new Integer(id));
         user.setName("New Name");
		 return user;
	 }

    public List getHighBalanceUsers(double bal)
	{
		/*
		 * HibernateTemplate template = getHibernateTemplate(); //Fire HQL Query and NOT
		 * sql query List result = template.find("from org.dao.User where balance >",new
		 * Double(bal));
		 */
      
     return null; 

	}
	 


     
}
