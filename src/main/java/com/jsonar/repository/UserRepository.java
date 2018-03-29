/**
 * 
 */
package com.jsonar.repository;

import java.io.Serializable;

import javax.persistence.Query;
 
import com.jsonar.model.UserModel;
import com.jsonar.repository.entity.UserEntity;
import com.jsonar.utils.Utils;
 

/**
 * @author Renata
 *
 */
public class UserRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	 
	public UserEntity userValidate(UserModel userModel){
 
		try {
 
			//QUERY (UserEntity.findUser) 	
			Query query = Utils.JpaEntityManager().createNamedQuery("UserEntity.findUser");
 
			//Parameters QUERY
			query.setParameter("user", userModel.getUser());
			query.setParameter("password", userModel.getPassword());
 
			//Return user
			return (UserEntity)query.getSingleResult();
 
		} catch (Exception e) {
 
			return null;
		}
 
	}
}
