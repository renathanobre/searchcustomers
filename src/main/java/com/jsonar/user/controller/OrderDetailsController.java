/**
 * 
 */
package com.jsonar.user.controller;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.jsonar.model.OrderDetailModel;
import com.jsonar.repository.OrderDetailRepository;

/**
 * @author Renata
 *
 */
@Named(value="orderDetailsController")
@ViewScoped
public class OrderDetailsController  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject transient
	private OrderDetailModel orderDetailModel;

	@Produces 
	private List<OrderDetailModel> ordersDetail;	

	@Inject transient
	private OrderDetailRepository orderDetailRepository;
		
	public OrderDetailModel getOrderDetailModel() {
		return orderDetailModel;
	}

	public void setOrderDetailModel(OrderDetailModel orderDetailModel) {
		this.orderDetailModel = orderDetailModel;
	}

	public List<OrderDetailModel> getOrdersDetail() {
		return ordersDetail;
	}

	public void setOrderDetail(List<OrderDetailModel> ordersDetail) {
		this.ordersDetail = ordersDetail;
	}

	public OrderDetailRepository getOrderDetailRepository() {
		return orderDetailRepository;
	}

	public void setOrdersDetailRepository(OrderDetailRepository ordersDetailRepository) {
		this.orderDetailRepository = ordersDetailRepository;
	}

	public List<OrderDetailModel> getOrdersDetailProducts(int orderNumber){
		
		return orderDetailRepository.getOrdersDetail(orderNumber);
	}
	
	public String showOrdersDetail(int orderNumber){
		
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("codigoOrder", orderNumber);
		
		return "/system/ordersDetail?faces-redirect=true&codigoOrder="+orderNumber;
		
	}

}
