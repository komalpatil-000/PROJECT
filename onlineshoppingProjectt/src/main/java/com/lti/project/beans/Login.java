package com.lti.project.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="LOGINS")
public class Login {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="logins_seq")
	@SequenceGenerator(name="logins_seq",sequenceName="logins_seq",allocationSize=1 )
	@Column(name="LOGIN_ID")
	private int loginId;
	@NonNull
	@Column(name="FNAME")
	private String fName;
	
	@Column(name="LNAME")
	private String lName;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="CONTACT")
	private long contact;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="ADDRESS")
	private String address;

	public Login(int loginId, String fName, String lName, String email, long contact, String password,
			String address) {
		super();
		this.loginId = loginId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.contact = contact;
		this.password = password;
		this.address = address;
	}

	public Login() {
		super();
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "\nLogin [loginId=" + loginId + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", contact="
				+ contact + ", password=" + password + ", address=" + address + "]";
	}
	
	
	
	
	
}
