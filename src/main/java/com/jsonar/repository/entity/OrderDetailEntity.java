/**
 * 
 */
package com.jsonar.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * @author Renata
 *
 */
@Entity
@Table(name="orderdetails")
@NamedQuery(name = "OrderDetailEntity.findDetail", 
query= "SELECT d FROM com.jsonar.repository.entity.OrderDetailEntity d "
		+ " inner join d.productEntity "
		+ "where d.orderNumber=:orderNumber "
		)
public class OrderDetailEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "orderNumber")
	private Integer orderNumber;

	@Column(name = "quantityOrdered")
	private Integer  quantityOrdered;

	@Column(name = "priceEach")
	private Double  priceEach;

	@Column(name = "orderLineNumber")
	private String  orderLineNumber;

	@OneToOne
	@JoinColumn(name="productCode")
	private ProductEntity	productEntity;

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

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}
}
