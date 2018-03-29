/**
 * 
 */
package com.jsonar.model;

import java.io.Serializable;

import com.jsonar.repository.entity.ProductEntity;

/**
 * @author Renata
 *
 */
public class OrderDetailModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer orderNumber;
	private Integer  quantityOrdered;
	private Double  priceEach;
	private String  orderLineNumber;
	private ProductEntity	product;
	
	
	public Integer getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public Integer getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(Integer quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public Double getPriceEach() {
		return priceEach;
	}
	public void setPriceEach(Double priceEach) {
		this.priceEach = priceEach;
	}
	public String getOrderLineNumber() {
		return orderLineNumber;
	}
	public void setOrderLineNumber(String orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}
	public ProductEntity getProduct() {
		return product;
	}
	public void setProduct(ProductEntity product) {
		this.product = product;
	}
	
	
}
