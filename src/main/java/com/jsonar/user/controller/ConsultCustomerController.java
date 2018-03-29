/**
 * 
 */
package com.jsonar.user.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.jsonar.model.CustomerModel;
import com.jsonar.repository.CustomerRepository;

/**
 * @author Renata
 *
 */
@Named(value="consultCustomerController")
@ViewScoped 
public class ConsultCustomerController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject transient
	private CustomerModel customerModel;

	@Produces 
	private List<CustomerModel> customers;	

	@Inject transient
	private CustomerRepository customerRepository;
	
	 private List<CustomerModel> filteredCustomers;

	public List<CustomerModel> getFilteredCustomers() {
		return filteredCustomers;
	}

	public void setFilteredCustomers(List<CustomerModel> filteredCustomers) {
		this.filteredCustomers = filteredCustomers;
	}

	/***
	 *Load customer in initializationCARREGA AS PESSOAS NA INICIALIZAÇÃO 
	 */
	@PostConstruct
	public void init(){
		
		//Return customers
		this.customers = customerRepository.getCustomers();
	}

	public CustomerModel getCustomerModel() {
		return customerModel;
	}

	public void setCustomerModel(CustomerModel customerModel) {
		this.customerModel = customerModel;
	}

	public List<CustomerModel> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerModel> customers) {
		this.customers = customers;
	}

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}

