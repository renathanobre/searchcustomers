/**
 * 
 */
package com.jsonar.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.jsonar.model.OrderModel;
import com.jsonar.repository.entity.OrderEntity;
import com.jsonar.utils.Utils;

/**
 * @author Renata
 *
 */
public class OrderRepository {
	
	@Inject
	OrderEntity orderEntity;
 
	EntityManager entityManager;
 
		
	/***
	 * Method to search list of orders by customer
	 * @return ordersModel
	 */
	public List<OrderModel> getOrders(int customerid){
 
		List<OrderModel> ordersModel = new ArrayList<OrderModel>();
 
		entityManager =  Utils.JpaEntityManager();
 
		Query query = entityManager.createNamedQuery("OrderEntity.findOrderCustomer");
		query.setParameter("customerNumber", customerid);
 
		@SuppressWarnings("unchecked")
		Collection<OrderEntity> ordersEntity = (Collection<OrderEntity>)query.getResultList();
 
		OrderModel orderModel = null;
 
		for (OrderEntity orderEntity : ordersEntity) {
 
			orderModel = new OrderModel();
			orderModel.setOrderNumber(orderEntity.getOrderNumber());
			orderModel.setOrderDate(orderEntity.getOrderDate());
			orderModel.setRequiredDate(orderEntity.getRequiredDate());
			orderModel.setShippedDate(orderEntity.getShippedDate());
			orderModel.setStatus(orderEntity.getStatus());
			orderModel.setCustomerModel(orderEntity.getCustomerEntity().getCodigo());
		
			
			ordersModel.add(orderModel);
 
		}
 
		return ordersModel;
	
	}

}
