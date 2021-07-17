package com.ajdev.designpatterns.creation.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonDemo {

	public static void main(String[] args) {
		MySingleton single1 = MySingleton.getInstance();
		MySingleton single2 = MySingleton.getInstance();
		if (single1 == single2)
			System.out.println("true");
		else
			System.out.println("false");

		try {

			FileOutputStream fileOut = new FileOutputStream("out.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(single1);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		MySingleton single3 = null;
		 try {
	            FileInputStream fileIn = new FileInputStream("out.ser");
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	            single3 = (MySingleton) in.readObject();
	            in.close();
	            fileIn.close();
	        } catch (IOException i) {
	            i.printStackTrace();
	        } catch (ClassNotFoundException c) {
	            System.out.println("singletons.SingletonEnum class not found");
	            c.printStackTrace();
	        }
		 
		 if (single3 == single2)
				System.out.println("true");
			else
				System.out.println("false");
		 
		 
		 if (single3 == single1)
				System.out.println("true");
			else
				System.out.println("false");

	}

}
