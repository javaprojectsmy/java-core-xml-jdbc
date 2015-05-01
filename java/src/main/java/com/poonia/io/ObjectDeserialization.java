package com.poonia.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.util.LinkedHashMap;
import java.util.Map;

import com.poonia.core.*;

public class ObjectDeserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis=new FileInputStream("tmp.obj");
				ObjectInputStream ois=new ObjectInputStream(fis)){
			 @SuppressWarnings("unchecked")
			Map<Integer,Customer>map=(Map<Integer,Customer>)ois.readObject();
			 System.out.println(map);
		}
		catch(IOException | ClassNotFoundException e){
			e.printStackTrace();
		}

	}

}
