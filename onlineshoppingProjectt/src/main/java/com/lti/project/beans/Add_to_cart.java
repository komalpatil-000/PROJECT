package com.lti.project.beans;

import javax.persistence.*;

@Entity
@Table(name="ADD_TO_CARTS1")
public class Add_to_cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tran_seq")
	@SequenceGenerator(name="tran_seq",initialValue = 1001, allocationSize=1 )
	@Column(name ="CART_ID")
	private int cartId;
	
	@Column(name ="LOGIN_ID")
	private int loginId;
	
	@Column(name ="PRD_ID")
	private int prdId;
	
	
	public Add_to_cart(int cartId, int loginId, int prdId) {
		super();
		this.cartId = cartId;
		this.loginId = loginId;
		this.prdId = prdId;
	}
	public Add_to_cart() {
		super();
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
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
	@Override
	public String toString() {
		return "\nAdd_to_cart [cartId=" + cartId + ", loginId=" + loginId + ", prdId=" + prdId + "]";
	}
	
	

}
