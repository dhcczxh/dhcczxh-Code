package com.dhcc.ssh.dao.impl;

//import java.awt.List;

import org.hibernate.Query;
//import org.hibernate.Session;
import org.hibernate.SessionFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

import com.dhcc.ssh.dao.IUserDao;
import com.dhcc.ssh.entity.User;

/**
 * 
 * @author zhouxihua
 *@version
 */

@Repository
public class UserDaoImpl implements IUserDao{
    @Autowired
	private SessionFactory sessionFactory ;
    
    

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
	     sessionFactory.getCurrentSession().save(user);
		return user;
	}

	@Override
	public User queryUserByuserName(String userName) {
		 
		// TODO Auto-generated method stub
		
		User user = null ;
		String hql = "from User user where user.userName = :userName";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		query.setString("userName", userName);
		/*java.util.List list = query.list();  // 用list方法返回多个值
		//List list = session.createQuery("from Student").list();
		for(int i=0;i<list.size();i++){
			user = (User)list.get(i);
			System.out.print(user.getUserId()+" ");
			System.out.print(user.getUserName()+" ");
			System.out.print(user.getUserPassword()+" ");
			
			System.out.println();
		}	*/	

		//当确定只有一个对象时有
		user = (User) query.uniqueResult();
		return user ;
	}

}
