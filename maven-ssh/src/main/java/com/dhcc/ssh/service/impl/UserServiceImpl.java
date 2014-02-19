package com.dhcc.ssh.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.ssh.dao.IUserDao;
import com.dhcc.ssh.dao.impl.UserDaoImpl;
import com.dhcc.ssh.entity.User;
import com.dhcc.ssh.service.IUserService;

/**
 * 
 * @author zhouxihua
 *
 */
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
    private IUserDao userDao;

	@Override
	public boolean verifyUserByUserNameAndPassword(String userName,
			String userPassword) {
		User user = new User();
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		boolean bool=false ;
		//String 类型==比较的是他们的内存，equals比较值
		
		User user1 = null;
		try {
			user1 = userDao.queryUserByuserName(userName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("ERROR");
		}
		String s = user1.getUserPassword();
		if( s.equals(userPassword))
		{
			bool=true;
			
		}else
		{
			
		bool = false;
		
	}
		return bool;
	}

}
