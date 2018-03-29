/**
 * 
 */
package com.jsonar.repository.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Renata
 *
 */
@Entity
@Table(name="products")
public class ProductEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "productCode")
	private String productCode;
	
	@Column(name = "productName")
	private String  productName;
	
	@Column(name = "productScale")
	private String  productScale;
	
	@Column(name = "productVendor")
	private String  productVendor;
	
	@Column(name = "productDescription")
	private String  productDescription;
	
	@Column(name = "quantityInStock")
	private int quantityInStock;
	
	@Column(name = "buyPrice")
	private Double buyPrice;
	
	@Column(name = "MSRP")
	private Double MSRP;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductScale() {
		return productScale;
	}

	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	public String getProductVendor() {
		return productVendor;
	}

	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public Double getMSRP() {
		return MSRP;
	}

	public void setMSRP(Double mSRP) {
		MSRP = mSRP;
	}
	
	
	

}
