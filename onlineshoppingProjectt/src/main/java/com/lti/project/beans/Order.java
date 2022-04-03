package com.lti.project.beans;

import javax.persistence.*;

@Entity
@Table(name="ORDERS")
public class Order {
	
	@Id
	@Column(name="ORD_ID")
	private int ordId;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@Column(name="LOGIN_ID")
	private int loginId;
	
	@Column(name="PRD_ID")
	private int prdId;
	
//	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
//	@JoinColumn(name="prd_Id")
//	private Product product;

	public int getOrdId() {
		return ordId;
	}

	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public int getPrdId() {
		return prdId;
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

//	public Product getProduct() {
//		return product;
//	}
//
//	public void setProduct(Product product) {
//		this.product = product;
//	}

	public Order(int ordId, int quantity, int loginId, int prdId) {
		super();
		this.ordId = ordId;
		this.quantity = quantity;
		this.loginId = loginId;
		this.prdId = prdId;
		
	}

	public Order() {
		super();
	}

	@Override
	public String toString() {
		return "\nOrder [ordId=" + ordId + ", quantity=" + quantity + ", loginId=" + loginId + ", prdId=" + prdId
				+ "]";
	}
	
	
	

}
