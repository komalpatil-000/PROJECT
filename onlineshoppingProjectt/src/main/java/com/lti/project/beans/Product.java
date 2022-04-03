package com.lti.project.beans;

import javax.persistence.*;

@Entity
@Table(name="PRODUCTS")
public class Product {
	
	@Id
	@Column(name="PRD_ID")
	private int prdId;

	@Column(name="PRD_NAME")
	private String prdName;
	
	@Column(name="PRD_PRICE")
	private long prdPrice;
	
	@Column(name="CATEGORY")
	private String category;
	
	@Column(name="R_ID")
	private int rId;
	
	
	public Product(int prdId, String prdName, long prdPrice, String category, int rId) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.category = category;
		this.rId = rId;
	}
	public Product() {
		super();
	}
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public double getPrdPrice() {
		return prdPrice;
	}
	public void setPrdPrice(long prdPrice) {
		this.prdPrice = prdPrice;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	@Override
	public String toString() {
		return "\nProduct [prdId=" + prdId + ", prdName=" + prdName + ", prdPrice=" + prdPrice + ", category=" + category
				+ ", rId=" + rId + "]";
	}
	
	

	
	
}
