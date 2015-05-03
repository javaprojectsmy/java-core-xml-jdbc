package com.poonia.spring.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="hib_contacts",schema="online")
public class Contacts {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long contactId;
	private long phonenumber;
	private String emails;
	public Contacts() {
		// TODO Auto-generated constructor stub
	}
	public Contacts(long phonenumber, String emails) {
		this.phonenumber = phonenumber;
		this.emails = emails;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id",nullable=false,insertable=false,updatable=false)
	private Customer customer;
	public long getContactId() {
		return contactId;
	}
	public void setContactId(long contactId) {
		this.contactId = contactId;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmails() {
		return emails;
	}
	public void setEmails(String emails) {
		this.emails = emails;
	}

}
