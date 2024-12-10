package com.prog2.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UtilityMethods {
	// find current working directory for relative path
//    static String path = System.getProperty("user.dir") + "\\deptDirectory.ser";
	static String path = "./dd.ser";

	// static serialize methods
	public static void serialization(ArrayList<Department> departments) {

		try (FileOutputStream fos = new FileOutputStream(path)) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(departments);
		} catch (FileNotFoundException e1) {
			System.out.println("File not found");
			throw new RuntimeException(e1);
		} catch (IOException e2) {
			System.out.println("I/O error");
//			e2.printStackTrace();
		} catch (Exception e3) {
//			e3.printStackTrace();
		}
	}

	// static deserialize methods
	public static ArrayList<Department> deserialization() {

		ArrayList<Department> a = null;
		// comment line 39 and uncomment line 41-45 on first time running
//		ArrayList<Department> a = new ArrayList<Department>();
//		a.add(new Department(1, "Art", new ArrayList<Teacher>(), new ArrayList<Staff>()));
//		a.add(new Department(2, "Statistics", new ArrayList<Teacher>(), new ArrayList<Staff>()));
//		a.add(new Department(3, "Engineering", new ArrayList<Teacher>(), new ArrayList<Staff>()));
//		a.add(new Department(4, "Mechanical", new ArrayList<Teacher>(), new ArrayList<Staff>()));
		
		try (FileInputStream fis = new FileInputStream(path)) {
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println("In deserialization...");
			a = (ArrayList<Department>) ois.readObject();
//			System.out.println(a);
		} catch (ClassNotFoundException e1) {
			a = null;
			e1.printStackTrace();
		} catch (IOException e2) {
			a = null;
			// System.out.println("I/O error");
			e2.printStackTrace();
		} catch (Exception e3) {
			e3.printStackTrace();
			a = null;
		}
		return a;
	}
} // class closing
