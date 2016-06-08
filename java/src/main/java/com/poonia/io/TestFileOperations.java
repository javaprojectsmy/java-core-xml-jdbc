package com.poonia.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestFileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (InputStream in = new FileInputStream("./src/com/java8/tesco/core/Customer.java")) {
			byte bytes[] = new byte[2 * 1024];
			int data = 0;
			while ((data = in.read(bytes)) > 0) {
				System.out.println(new String(bytes, 0, data - 1));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
