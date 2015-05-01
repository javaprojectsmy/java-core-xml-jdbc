package com.poonia.xml;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class TestSaxParser {

	public static void main(String[] args) {
	        SAXParserFactory factory =SAXParserFactory.newInstance();
	        try (InputStream in=new FileInputStream("./src/com/java8/tesco/xml/customer.xml")){
				SAXParser saxParser=factory.newSAXParser();
				CustomerSaxHandler handler=new CustomerSaxHandler();
				saxParser.parse(in,handler);
				for(Customer c:handler.getCustomers()){
					System.out.println(c.getId()+" "+c.getName()+" "+c.getDob());
				}
				
			} catch (IOException |ParserConfigurationException |SAXException e) {
				e.printStackTrace();
			}

	        
	        
	        
	}

}
