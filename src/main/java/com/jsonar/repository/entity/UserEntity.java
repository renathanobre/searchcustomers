/**
 * 
 */
package com.jsonar.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Renata
 *
 */
@Table(name="users")
@Entity	
@NamedQuery(name = "UserEntity.findUser", 
		    query= "SELECT u FROM UserEntity u WHERE u.user = :user AND u.password = :password")
public class UserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="id")
	private String idCode;
 
	@Column(name="username")
	private String user;
 
	@Column(name="password")
	private String password;

	public String getIdCode() {
		return idCode;
	}

	public void setId_code(String idCode) {
		this.idCode = idCode;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
