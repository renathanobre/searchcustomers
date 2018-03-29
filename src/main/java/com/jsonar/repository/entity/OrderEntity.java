/**
 * 
 */
package com.jsonar.repository.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
@Table(name="orders")
@NamedQuery(name = "OrderEntity.findOrderCustomer", 
query= "SELECT o FROM com.jsonar.repository.entity.OrderEntity o where customerNumber=:customerNumber order by o.orderDate")
public class OrderEntity implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "orderNumber")
	private Integer orderNumber;
 
	@Column(name = "orderDate")
	private Date  orderDate;
	
	@Column(name = "requiredDate")
	private Date  requiredDate;
	
	@Column(name = "shippedDate")
	private Date  shippedDate;
	
	@Column(name = "status")
	private String  status;
	
	@OneToOne
	@JoinColumn(name="customerNumber")
	private CustomerEntity	customerEntity;

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

	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

}
