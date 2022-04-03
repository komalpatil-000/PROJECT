package com.lti.project.beans;

import javax.persistence.*;
import javax.persistence.Entity;


@Entity
@Table(name="ADMINS")
public class Admin {
	
	@Id
	@Column(name="A_ID")
	private int aId;
	
	@Column(name="A_NAME")
	private String aName;
	
	@Column(name="A_UID")
	private String aUid;
	
	@Column(name="A_PASSWORD")
	private String aPassword;
	
	@Column(name="A_CONTACT")
	private long aContact;
	
	@Column(name="A_EMAIL")
	private String aEmail;
	

	public Admin(int aId, String aName, String aUid, String aPassword, long aContact, String aEmail) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.aUid = aUid;
		this.aPassword = aPassword;
		this.aContact = aContact;
		this.aEmail = aEmail;
	}
	public Admin() {
		super();
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaUid() {
		return aUid;
	}
	public void setaUid(String aUid) {
		this.aUid = aUid;
	}
	public String getaPassword() {
		return aPassword;
	}
	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
	}
	public long getaContact() {
		return aContact;
	}
	public void setaContact(long aContact) {
		this.aContact = aContact;
	}
	public String getaEmail() {
		return aEmail;
	}
	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}
	@Override
	public String toString() {
		return "\nAdmin [aId=" + aId + ", aName=" + aName + ", aUid=" + aUid + ", aPassword=" + aPassword + ", aContact="
				+ aContact + ", aEmail=" + aEmail + "]";
	}
	
	

}
