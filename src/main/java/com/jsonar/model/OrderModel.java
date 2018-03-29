/**
 * 
 */
package com.jsonar.model;

import java.io.Serializable;
import java.util.Date;



/**
 * @author Renata
 *
 */
public class OrderModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer orderNumber;
 	private Date  orderDate;
	private Date  requiredDate;
	private Date  shippedDate;
	private String  status;
	private Integer customerModel;
	
	public Integer getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getRequiredDate() {
		return requiredDate;
	}
	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}
	public Date getShippedDate() {
		return shippedDate;
	}
	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getCustomerModel() {
		return customerModel;
	}
	public void setCustomerModel(Integer customerModel) {
		this.customerModel = customerModel;
	}

	

}
