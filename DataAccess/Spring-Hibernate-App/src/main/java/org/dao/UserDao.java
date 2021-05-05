package org.dao;

  
import java.util.*;
 

/**
 * Interface defining  data access methods for the
 * application.
 */

public interface UserDao 
{
  public User getUser(int id);

  public List getHighBalanceUsers(double bal);

  public int  add(User obj);
}
