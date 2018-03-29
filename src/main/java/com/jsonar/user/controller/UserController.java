/**
 * 
 */
package com.jsonar.user.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
 
import org.apache.commons.lang3.StringUtils;

import com.jsonar.model.UserModel;
import com.jsonar.repository.UserRepository;
import com.jsonar.repository.entity.UserEntity;
import com.jsonar.utils.*;
 

/**
 * @author Renata
 *
 */

@Named(value="userController")
@SessionScoped
public class UserController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private UserModel userModel;
 
	@Inject
	private UserRepository userRepository;
 
	@Inject
	private UserEntity userEntity;
	
	
	public UserModel getUserModel() {
		return userModel;
	}
	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}
 
	public UserModel getUserSession(){
 
		FacesContext facesContext = FacesContext.getCurrentInstance();
 
		return (UserModel)facesContext.getExternalContext().getSessionMap().get("userAuthenticated");
	}
 
	public String logout(){
 
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
 
		return "/index.xhtml?faces-redirect=true";
	}
	public String login(){
 
		if(StringUtils.isEmpty(userModel.getUser()) || StringUtils.isBlank(userModel.getUser())){
 
			Utils.message("Please inform username!");
			return null;
		}
		else if(StringUtils.isEmpty(userModel.getPassword()) || StringUtils.isBlank(userModel.getPassword())){
 
			Utils.message("Please inform password!");
			return null;
		}
		else{	
 
			userEntity = userRepository.userValidate(userModel);
 
			if(userEntity!= null){
 
				userModel.setPassword(null);
				userModel.setIdCode((userEntity.getIdCode()));
 
 
				FacesContext facesContext = FacesContext.getCurrentInstance();
 
				facesContext.getExternalContext().getSessionMap().put("userAuthenticated", userModel);
 
 
				return "system/searchCustomer?faces-redirect=true";
			}
			else{
 
				Utils.message("Not possible log in with this user and password!");
				return null;
			}
		}
	}

}
