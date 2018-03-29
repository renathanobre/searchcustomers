/**
 * 
 */
package com.jsonar.utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
/**
 * @author Renata
 *
 */
public class Utils {

	public static EntityManager JpaEntityManager(){

		FacesContext facesContext = FacesContext.getCurrentInstance();

		ExternalContext externalContext = facesContext.getExternalContext();

		HttpServletRequest request  = (HttpServletRequest)externalContext.getRequest();

		return (EntityManager)request.getAttribute("entityManager");
	} 
	//Show message
	public static void message(String message){

		FacesContext facesContext = FacesContext.getCurrentInstance();

		facesContext.addMessage(null, new FacesMessage("Alert",message));
	}

	//Show message
	public static void messageAtention(String message){

		FacesContext facesContext = FacesContext.getCurrentInstance();

		facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Atention:", message));
	}

	//Show message
	public static void messageInfo(String message){

		FacesContext facesContext = FacesContext.getCurrentInstance();

		facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "", message));
	}
}