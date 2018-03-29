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

import com.jsonar.model.CustomerModel;
import com.jsonar.repository.entity.CustomerEntity;
import com.jsonar.utils.Utils;

/**
 * @author Renata
 *
 */
public class CustomerRepository {
	@Inject
	CustomerEntity customerEntity;
 
	EntityManager entityManager;
 
	/***
	 * Method to search customers
	 * @return customersModel
	 */
	public List<CustomerModel> getCustomers(){
 
		List<CustomerModel> customersModel = new ArrayList<CustomerModel>();
 
		entityManager =  Utils.JpaEntityManager();
 
		Query query = entityManager.createNamedQuery("CustomerEntity.findAll");
 
		@SuppressWarnings("unchecked")
		Collection<CustomerEntity> customersEntity = (Collection<CustomerEntity>)query.getResultList();
 
		CustomerModel customerModel = null;
 
		for (CustomerEntity customerEntity : customersEntity) {
 
			customerModel = new CustomerModel();
			customerModel.setCodigo(customerEntity.getCodigo());
			customerModel.setCustomerName(customerEntity.getCustomerName());
			customerModel.setContactFirstName(customerEntity.getContactFirstName());
			customerModel.setContactLastName(customerEntity.getContactLastName());
			customerModel.setPhone(customerEntity.getPhone());
			customerModel.setPhone(customerEntity.getPhone());
			customerModel.setAddressLine1(customerEntity.getAddressLine1());
			customerModel.setAddressLine1(customerEntity.getAddressLine1());
			customerModel.setAddressLine2(customerEntity.getAddressLine2());
			customerModel.setCity(customerEntity.getCity());
			customerModel.setState(customerEntity.getState());
			customerModel.setPostalCode(customerEntity.getPostalCode());
			customerModel.setCountry(customerEntity.getCountry());
			customerModel.setCreditLimit(customerEntity.getCreditLimit());
			
			customersModel.add(customerModel);
 
		}
 
		return customersModel;
	
	}
}
