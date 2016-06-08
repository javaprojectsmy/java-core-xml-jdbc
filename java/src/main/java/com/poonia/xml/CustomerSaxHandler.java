package com.poonia.xml;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;
import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class CustomerSaxHandler extends DefaultHandler {

	private Stack<String> elementStack = new Stack<String>();
	private Stack<Object> objectStack = new Stack<Object>();
	private List<Customer> customers = new ArrayList<Customer>();

	public List<Customer> getCustomers() {
		return customers;
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {

		this.elementStack.push(qName);
		if ("tesco:Customer".equals(qName)) {
			Customer customer = new Customer();
			this.objectStack.push(customer);
			// this.customers.add(customer);
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		this.elementStack.pop();
		if ("tesco:Customer".equals(qName)) {
			Object object = this.objectStack.pop();
			if ("tesco:Customer".equals(qName)) {
				Customer customer = (Customer) object;
				this.customers.add(customer);
			}
		}
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String value = new String(ch, start, length);
		if (value.length() == 0) {
			return;// ignore white spaces
		}
		if ("tesco:id".equals(currentElement())
				&& "tesco:Customer".equals(currentElementParent())) {
			Customer customer = (Customer) this.objectStack.peek();
			customer.setId(new Integer(value));
		} else if ("tesco:name".equals(currentElement())
				&& "tesco:Customer".equals(currentElementParent())) {
			Customer customer = (Customer) this.objectStack.peek();
			customer.setName((value));
		}
		if ("tesco:dob".equals(currentElement())
				&& "tesco:Customer".equals(currentElementParent())) {
			Customer customer = (Customer) this.objectStack.peek();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			try {

				customer.setDob(format.parse(value));
			} catch (ParseException e) {

				e.printStackTrace();
			}

		}
	}

	private String currentElement() {
		return this.elementStack.peek();
	}

	private String currentElementParent() {
		if (this.elementStack.size() < 1)
			return null;

		return this.elementStack.get(this.elementStack.size() - 2);
	}
}
