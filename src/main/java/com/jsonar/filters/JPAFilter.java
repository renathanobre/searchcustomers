/**
 * 
 */
package com.jsonar.filters;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
/***
 * 
This filter will be called every faces servelet requirement
*@author Renata
***/
@WebFilter(servletNames ={ "Faces Servlet" })
public class JPAFilter implements Filter {
 
 
	private EntityManagerFactory entityManagerFactory;
 
	private String persistence_unit_name = "unit_app";
 
    public JPAFilter() {
 
    }
 
	public void destroy() {
 
		this.entityManagerFactory.close();
	}
 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
 
		/*ENTITYMANAGER*/
		EntityManager entityManager =  this.entityManagerFactory.createEntityManager();
 
		/*add request*/
		request.setAttribute("entityManager", entityManager);
 
		/*transaction begin*/
		entityManager.getTransaction().begin();
 
		/*faces servlet begin*/
		chain.doFilter(request, response);
 
		try {
 
			/*COMMIT*/
			entityManager.getTransaction().commit();
 
		} catch (Exception e) {
 
			/*rollback*/
			entityManager.getTransaction().rollback();
		}
		finally{
 
			/*close  entityManager*/
			entityManager.close();
		}
	}
 
	public void init(FilterConfig fConfig) throws ServletException {
 
		/*Creation entityManagerFactory with parameters defined at persistence.xml*/
		this.entityManagerFactory = Persistence.createEntityManagerFactory(this.persistence_unit_name); 
	}
 
}