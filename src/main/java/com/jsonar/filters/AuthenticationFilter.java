/**
 * 
 */
package com.jsonar.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsonar.model.UserModel;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/system")
public class AuthenticationFilter implements Filter {

	/**
	 * Default constructor. 
	 */
	public AuthenticationFilter() {
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpSession httpSession 				= ((HttpServletRequest) request).getSession(); 

		HttpServletRequest httpServletRequest   = (HttpServletRequest) request;

		HttpServletResponse httpServletResponse = (HttpServletResponse) response;

		if(httpServletRequest.getRequestURI().indexOf("index.xhtml") <= -1){

			UserModel usuarioModel =(UserModel) httpSession.getAttribute("userAuthenticated");

			if(usuarioModel == null){

				httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+ "/index.xhtml");

			}
			else{

				chain.doFilter(request, response);
			}
		}		
		else{

			chain.doFilter(request, response);
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
