package com.poonia.spring.client;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.poonia.spring.dao.CustomerSpringDAO;
import com.poonia.spring.model.Address;
import com.poonia.spring.model.Contacts;
import com.poonia.spring.model.Customer;

public class SpringClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Start the IOC Container
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerSpringDAO dao =ioc.getBean(CustomerSpringDAO.class);
		
		Customer customer=new Customer("Yashwant",new Date());
		 Address address=new Address(1533,"WhiteField","Blore","karna","India",560390,2);
		 customer.setAddress(address);
		 
		 customer.getList().add(new Contacts(1234134378L,"avfbc@abc.com"));
		 customer.getList().add(new Contacts(9874877338L,"cdvvve@cde.com"));
		 customer.getList().add(new Contacts(9999993378L,"klwerm@klm.com"));
		 
		 dao.add(customer);

		
	}

}
