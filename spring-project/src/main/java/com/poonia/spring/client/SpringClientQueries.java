package com.poonia.spring.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.poonia.spring.dao.SpringHibernateCriteriaQuriesDAO;
import com.poonia.spring.model.Customer;
import com.poonia.spring.model.Greeting;

public class SpringClientQueries {
	public static void main(String[] args) {

		ApplicationContext ioc = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		SpringHibernateCriteriaQuriesDAO dao = ioc
				.getBean(SpringHibernateCriteriaQuriesDAO.class);

		dao.criteria1();
		List<Customer> lst = dao.pagination();
		for (Customer c : lst)
			System.out.println(c);
		System.out.println(dao.projections());

//		Greeting gr = ioc.getBean(Greeting.class);
//		System.out.println(gr.greeting());

	}

}
