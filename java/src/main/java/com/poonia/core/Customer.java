package com.poonia.core;

import java.io.Serializable;


@SuppressWarnings("serial")
public class Customer extends Object implements Comparable <Customer> ,Serializable{
private int customerNumber;
private String customerName;
private int contact;



//default constructor
public Customer(){}


public Customer(int id,String name,int age){
	
	this.id=id;
	this.age=age;
	this.name=name;
	
}
/**
 * 
 * @param id customer id
 * @param name customer name
 * @param age customer age
 */

public int getId(){
return this.id;
}

public void setId(int id)
{
	this.id=id;
	
}

/**
 * 
 * @return customer id
 */
public String getName(){
return this.name;
}
/**
 * 
 * @param name set the customer name
 */
public void setName(String name)
{
	this.name=name;
	
}

/**
 * 
 * @return customer name
 */

public int getAge(){
return this.age;
}
/**
 * 
 * @param age set of customer age
 */
public void setAge(int age)
{
	this.age=age;
	
}
/**
 * @param return age of customer
 */
//default equals compair only reference // if we need to compair other things then need to override
// polymorphic behaviour // overriding equals method 
/*public boolean equals(Object object){
	if(this==object)/// false when same object are passed (like c1.equals(c1))
		return false;
    if(object==null)//
    	return false;
    if(!(object instanceof Customer))//
    	return false;
    //reference casting
    Customer other=(Customer)object;
    if(this.age==other.age)
    	return true;
    if(this.id==other.id)
    	return true;
    if(this.name.equals(other.name))
    	return true;
    
    
    
	return false;
}*/
@Override
public String toString(){
	StringBuilder builder=new StringBuilder();
	builder.append("[Customer");
	builder.append("id=");
	builder.append(this.id);
	builder.append(", name =");
	builder.append(this.name);
	builder.append(", age =");
	builder.append(this.age);
	 return builder.toString();
	
}
public int compareTo(Customer o){
	return((name).compareTo(o.getName()));
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
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
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	if (age != other.age)
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
}
