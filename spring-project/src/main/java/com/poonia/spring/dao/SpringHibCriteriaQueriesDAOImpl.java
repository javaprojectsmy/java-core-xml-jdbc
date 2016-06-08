package com.poonia.spring.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.poonia.spring.model.Customer;

@Component
@Transactional
public class SpringHibCriteriaQueriesDAOImpl implements SpringHibernateCriteriaQuriesDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Customer> findAll() {
		// TODO Auto-generated method stub

		return sessionFactory.getCurrentSession().createCriteria(Customer.class).list();
	}

	public List<Customer> pagination() {
		// TODO Auto-generated method stub
		int pageSize = 4;
		String countQ = "Select count(id) from Customer";
		Query countQuery = sessionFactory.getCurrentSession().createQuery(countQ);
		Long countResults = (Long) countQuery.uniqueResult();
		int lastPageNumber = (int) ((countResults / pageSize) + 1);
		Query selectQuery = sessionFactory.getCurrentSession().createQuery("From Customer");
		selectQuery.setFirstResult((lastPageNumber - 1) * pageSize);
		selectQuery.setMaxResults(pageSize);
		List<Customer> list = selectQuery.list();
		return list;
	}

	public Date projections() {
		return (Date) sessionFactory.getCurrentSession().createCriteria(Customer.class, "customer")
				.setProjection(Projections.min("age")).uniqueResult();
	}

	public void criteria1() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Customer.class, "customer");
		criteria.setFetchMode("customer.address", FetchMode.JOIN);
		criteria.createAlias("customer.address", "address");
		ProjectionList columns = Projections.projectionList().add(Projections.property("name"))
				.add(Projections.property("address.city"));
		criteria.setProjection(columns);
		List<Object[]> list = criteria.list();
		for (Object[] objects : list) {
			for (Object object : objects) {
				System.out.println(object);
			}
		}
	}

}
