/**
 * 
 */
package com.jsonar.model;

import java.io.Serializable;

/**
 * @author Renata
 *
 */
public class ProductModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer productCode;
	private String  productName;
	private String  productScale;
	private String  productVendor;
	private String  productDescription;
	private int     quantityInStock;
	private Double  buyPrice;
	private Double  MSRP;
	public Integer getProductCode() {
		return productCode;
	}
	public void setProductCode(Integer productCode) {
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
