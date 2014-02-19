package com.dhcc.ssh.dao;

import com.dhcc.ssh.entity.User;

/**
 * @author zhouxihua
 */

public interface IUserDao {
	/**
	 * 
	 * @param user
	 * @return User
	 */
public User addUser(User user);
/**
 * @param userName
 * @return User
 */
public User queryUserByuserName(String userName);
}
