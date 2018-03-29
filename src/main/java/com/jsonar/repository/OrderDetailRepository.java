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

import com.jsonar.model.OrderDetailModel;
import com.jsonar.repository.entity.OrderDetailEntity;
import com.jsonar.utils.Utils;

/**
 * @author Renata
 *
 */
public class OrderDetailRepository {

	@Inject
	OrderDetailEntity orderDetailEntity;

	EntityManager entityManager;

	/***
	 * Method to search orders detail
	 * @return ordersDetailModel
	 */

	public List<OrderDetailModel> getOrdersDetail(int orderNumber){

		List<OrderDetailModel> ordersDetailModel = new ArrayList<OrderDetailModel>();

		entityManager =  Utils.JpaEntityManager();

		Query query = entityManager.createNamedQuery("OrderDetailEntity.findDetail");
		query.setParameter("orderNumber", orderNumber);

		@SuppressWarnings("unchecked")
		Collection<OrderDetailEntity> ordersDetailEntity = (Collection<OrderDetailEntity>)query.getResultList();

		OrderDetailModel orderDetailModel = null;

		for (OrderDetailEntity orderDetailEntity : ordersDetailEntity) {

			orderDetailModel = new OrderDetailModel();
			orderDetailModel.setOrderNumber(orderDetailEntity.getOrderNumber());
			orderDetailModel.setOrderLineNumber(orderDetailEntity.getOrderLineNumber());
			orderDetailModel.setPriceEach(orderDetailEntity.getPriceEach());
			orderDetailModel.setQuantityOrdered(orderDetailEntity.getQuantityOrdered());
			orderDetailModel.setProduct(orderDetailEntity.getProductEntity());


			ordersDetailModel.add(orderDetailModel);

		}

		return ordersDetailModel;

	}

}
