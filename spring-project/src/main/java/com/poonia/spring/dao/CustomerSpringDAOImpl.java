package com.poonia.spring.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.poonia.spring.model.Customer;
import com.poonia.spring.template.HibernateTemplate;

@Repository
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE, rollbackFor = HibernateException.class, timeout = 500)
public class CustomerSpringDAOImpl implements CustomerSpringDAO {
	public CustomerSpringDAOImpl() {

	}

	// Dependency Injection
	// Injecting The Sessionfatory based on the
	// Configuration in applicationContext.xml
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	// Declarative Transaction Management using AOP

	public void add(Customer customer) {
		/*
		 * SessionFactory sessionFactory= HibernateTemplate.getSessionFactory();
		 */

		/*
		 * try { session.beginTransaction();
		 */
		getCurrentSession().save(customer);
		/*
		 * session.getTransaction().commit(); } catch (HibernateException e) {
		 * e.printStackTrace(); session.getTransaction().rollback(); }
		 */

	}

	public void update(Customer customer) {
		/*
		 * SessionFactory sessionFactory= HibernateTemplate.getSessionFactory();
		 */

		/*
		 * try { session.beginTransaction();
		 */
		getCurrentSession().update(customer);
		/*
		 * session.getTransaction().commit(); } catch (HibernateException e) {
		 * e.printStackTrace(); session.getTransaction().rollback(); }
		 */
	}

	public void delete(int customerid) {
		/*
		 * SessionFactory sessionFactory= HibernateTemplate.getSessionFactory();
		 */

		/*
		 * try { session.beginTransaction();
		 */
		Customer customer = (Customer) getCurrentSession().load(Customer.class, customerid);
		getCurrentSession().delete(customer);
		/*
		 * session.getTransaction().commit(); } catch (HibernateException e) {
		 * e.printStackTrace(); session.getTransaction().rollback(); }
		 */
	}

	public Customer findById(int customerid) {
		/*
		 * SessionFactory sessionFactory= HibernateTemplate.getSessionFactory();
		 */
		/* session.beginTransaction(); */
		Customer customer = (Customer) getCurrentSession().get(Customer.class, customerid);
		/* session.getTransaction().commit(); */
		return customer;
	}

	public List<Customer> findAll() {
		/*
		 * SessionFactory sessionFactory=HibernateTemplate.getSessionFactory();
		 */

		/* session.beginTransaction(); */
		List<Customer> list = getCurrentSession().createQuery("from Customer").list();
		/* session.getTransaction().commit(); */
		return list;
	}

	public int[] executeBatch(Customer[] customer) {
		/*
		 * SessionFactory sessionFactory= HibernateTemplate.getSessionFactory();
		 */

		/*
		 * try { session.beginTransaction();
		 */
		for (int i = 0; i < customer.length; i++) {
			if (i % 5 == 0) {
				// 5, same as the JDBC batch size
				// flush a batch of inserts and release memory:
				getCurrentSession().flush();
				getCurrentSession().clear();
			}
			getCurrentSession().save(customer[i]);
		}
		/*
		 * session.getTransaction().commit(); }catch(HibernateException e){
		 * e.printStackTrace(); session.getTransaction().rollback(); }
		 */
		return null;
	}

}