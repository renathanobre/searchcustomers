/**
 * 
 */
package com.jsonar.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Renata
 *
 */
@Entity
@Table(name="customers")
 
@NamedQueries({
 
	@NamedQuery(name = "CustomerEntity.findAll",query= "SELECT c FROM CustomerEntity c order by c.codigo")
})
public class CustomerEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "customerNumber")
	private Integer codigo;
 
	@Column(name = "customerName")
	private String  customerName;
 
	@Column(name = "contactLastName")
	private String  contactLastName;
 
	@Column(name = "contactFirstName")
	private String	contactFirstName;
 
	@Column(name = "phone")
	private String  phone;
 
	@Column(name = "addressLine1")
	private String  addressLine1;
 
	@Column(name = "addressLine2")
	private String  addressLine2;
	
	@Column(name = "city")
	private String  city;
	
	@Column(name = "state")
	private String  state;
	
	@Column(name = "postalCode")
	private String  postalCode;
	
	@Column(name = "country")
	private String  country;
		
	@Column(name = "creditLimit")
	private String  creditLimit;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactLastName() {
		return contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	public String getContactFirstName() {
		return contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}
	
}
