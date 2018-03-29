/**
 * 
 */
package com.jsonar.user.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.jsonar.model.OrderModel;
import com.jsonar.repository.OrderRepository;

/**
 * @author Renata
 *
 */
@Named(value="consultOrderController")
@ViewScoped
public class OrderController  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject transient
	private OrderModel orderModel;

	@Produces 
	private List<OrderModel> orders;	

	@Inject transient
	private OrderRepository ordersRepository;


	public OrderModel getOrderModel() {
		return orderModel;
	}

	public void setOrderModel(OrderModel orderModel) {
		this.orderModel = orderModel;
	}

	public List<OrderModel> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderModel> orders) {
		this.orders = orders;
	}

	public OrderRepository getOrdersRepository() {
		return ordersRepository;
	}

	public void setOrdersRepository(OrderRepository ordersRepository) {
		this.ordersRepository = ordersRepository;
	}


	public List<OrderModel> getOrdersCustomer(int customerid){

		return ordersRepository.getOrders(customerid);
	}

	public void showOrdersCustomer(int customerid){

		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();

		try {
			ec.redirect(ec.getRequestContextPath()+ "/system/ordersCustomer.xhtml?faces-redirect=false&codigo="+customerid);
		} catch (IOException e) {

			e.printStackTrace();
		}


	}
	

}
