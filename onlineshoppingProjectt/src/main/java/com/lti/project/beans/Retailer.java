package com.lti.project.beans;

import javax.persistence.*;

@Entity
@Table(name="RETAILERS")
public class Retailer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ret_seq")
	@SequenceGenerator(name="ret_seq",sequenceName="ret_seq",allocationSize=1 )
	@Column(name="R_ID")
	private int rId;
	
	@Column(name="R_NAME")
	private String rName;
	
	@Column(name="R_EMAIL")
	private String rEmail;
	
	@Column(name="R_UID")
	private String rUid;
	
	@Column(name="R_PASSWORD")
	private String rPassword;
	
	@Column(name="A_ID")
	private int aId;
	
//
	//@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	//@JoinColumn(name="A_Id")
//  private Admin admin;
//

	public int getrId() {
		return rId;
	}


	public void setrId(int rId) {
		this.rId = rId;
	}


	public String getrName() {
		return rName;
	}


	public void setrName(String rName) {
		this.rName = rName;
	}


	public String getrEmail() {
		return rEmail;
	}


	public void setrEmail(String rEmail) {
		this.rEmail = rEmail;
	}


	public String getrUid() {
		return rUid;
	}


	public void setrUid(String rUid) {
		this.rUid = rUid;
	}


	public String getrPassword() {
		return rPassword;
	}


	public void setrPassword(String rPassword) {
		this.rPassword = rPassword;
	}


	public int getaId() {
		return aId;
	}


	public void setaId(int aId) {
		this.aId = aId;
	}

//
//	public Admin getAdmin() {
//		return admin;
//	}
//
//
//	public void setAdmin(Admin admin) {
//		this.admin = admin;
//	}
//

	public Retailer(int rId, String rName, String rEmail, String rUid, String rPassword, int aId) {
		super();
		this.rId = rId;
		this.rName = rName;
		this.rEmail = rEmail;
		this.rUid = rUid;
		this.rPassword = rPassword;
		this.aId = aId;
		
	}


	public Retailer() {
		super();
	}


	@Override
	public String toString() {
		return "Retailer [rId=" + rId + ", rName=" + rName + ", rEmail=" + rEmail + ", rUid=" + rUid + ", rPassword="
				+ rPassword + ", aId=" + aId +"]";
	}
	
	
	
	
	
	
	
}
