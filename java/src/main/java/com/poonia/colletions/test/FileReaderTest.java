package com.poonia.colletions.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader objReader = null;
		try {
			String value;
			objReader = new BufferedReader(new FileReader("C:/Users/i318422/Desktop/For_Sale.txt"));
			while ((value = objReader.readLine()) != null) {
				System.out.println(value);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			if (objReader != null) {
				try {
					objReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
