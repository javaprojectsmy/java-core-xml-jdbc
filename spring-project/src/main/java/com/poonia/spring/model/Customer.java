package com.poonia.spring.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;







import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @author Yashwant
 *@version 1.8
 *@since 1.8
 *@see object
 *
 */
//This is a persistence class
@Entity

//Customer Class will be mapped to a table called hib_customer
@Table(name="hib_customer",schema="online")

public class Customer extends Object implements Comparable<Customer>,Serializable {
	//Id is mapped to Primary Key Column
	@Id
	@Column(name="customer_id")
	//auto generate id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="customer_name")
	private String name;
	
	@Column(name="customer_age")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date age;
	
	@OneToOne(fetch=FetchType.EAGER)
	@Cascade(value={CascadeType.ALL})
//	@Fetch(FetchMode.JOIN)
	@JoinColumn(name="ADDRESSID",nullable=true,insertable=true,updatable=true)
	private Address address;
	@OneToMany(cascade=javax.persistence.CascadeType.ALL)
	@JoinColumn(name="customer_id",nullable=false,updatable=false)
	private List<Contacts>list=new ArrayList<Contacts>();
	
	public Address getAddress() {
		return address;
	}


	public List<Contacts> getList() {
		return list;
	}


	public void setList(List<Contacts> list) {
		this.list = list;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public void setAge(Date age) {
		this.age = age;
	}


	public Customer(String name, Date age) {
		this.name = name;
		this.age = age;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param id customer id
	 * @param name customer name
	 * @param age customer age
	 */
	
	public Customer(int id,String name,Date age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	
	}

/**
 * 
 * @return customer ID
 */
public int getId()
{
	return this.id;
}
/**
 * 
 * @param id set the customer id
 */
public void setId(int id)
{
	this.id=id;
}

/**
 * 
 * @return customer name
 */
public String getName()
{
	return this.name;
}

/**
 * 
 * @param name set name
 */

public void setName(String name)
{
	this.name=name;
}

/**
 * 
 * @return customer age
 */




@Override
public String toString()
{
 StringBuilder builder=new StringBuilder();
 builder.append("[Customer ");
 builder.append(" id = ");
 builder.append(this.id);
 builder.append(" , Name = ");
 builder.append(this.name);
 builder.append(" , age = ");
 builder.append(this.age+"]");
 return builder.toString();
}


public Date getAge() {
	return age;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((age == null) ? 0 : age.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (!(obj instanceof Customer))
		return false;
	Customer other = (Customer) obj;
	if (age == null) {
		if (other.age != null)
			return false;
	} else if (!age.equals(other.age))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

public int compareTo(Customer o) {
	// TODO Auto-generated method stub
	return  (name).compareTo(o.getName());
}
}