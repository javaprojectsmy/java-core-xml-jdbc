package com.poonia.spring.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.poonia.spring.dao.CustomerSpringDAO;
import com.poonia.spring.model.Address;
import com.poonia.spring.model.Contacts;
import com.poonia.spring.model.Customer;
import com.poonia.spring.template.HibernateTemplate;

public class HibernateClient {

	public static void main(String[] args) {
		CustomerSpringDAO dao = new CustomerSpringDAO() {

			public void update(Customer customer) {
				// TODO Auto-generated method stub

			}

			public Customer findById(int customerid) {
				// TODO Auto-generated method stub
				return null;
			}

			public List<Customer> findAll() {
				// TODO Auto-generated method stub
				return null;
			}

			public int[] executeBatch(Customer[] customer) {
				// TODO Auto-generated method stub
				return null;
			}

			public void delete(int customerid) {
				// TODO Auto-generated method stub

			}

			public void add(Customer customer) {
				// TODO Auto-generated method stub

			}
		};
		/*
		 * Customer customer=new Customer(); customer.setName("Yashwant");
		 * customer.setAge(new Date()); dao.add(customer);
		 */

		/*
		 * Customer customer=dao.findByID(1); customer.setName("King");
		 * dao.update(customer);
		 */
		// dao.delete(1);

		/*
		 * Customer customers[]={new Customer("Name1",new Date()), new
		 * Customer("Name2",new Date()), new Customer("Name3",new Date()), new
		 * Customer("Name4",new Date()) };
		 */
		Customer customer = new Customer("Aman", new Date());
		Address address = new Address(3233, "WhiteField", "Blore", "karna", "India", 560390, 2);
		customer.setAddress(address);
		/*
		 * List<Contacts> ct=new ArrayList<Contacts>(); ct=customer.getList();
		 * Iterator<Contacts> iter=ct.iterator();
		 * 
		 * System.out.println(iter.next().getContactId());
		 */
		customer.getList().add(new Contacts(1234122378L, "abc@abc.com"));
		customer.getList().add(new Contacts(9874234338L, "cde@cde.com"));
		customer.getList().add(new Contacts(3424453378L, "klm@klm.com"));
		// List<Customer>list=dao.findAll();
		/*
		 * for(Customer c:list) { System.out.println(c); } dao.add(customer);
		 * Customer customer1=dao.findByID(14); dao.executeBatch(customers);
		 * System.out.println(); System.out.println(customer1+" "
		 * +customer1.getAddress());
		 */
		dao.add(customer);
		HibernateTemplate.getSessionFactory().close();

	}

}
