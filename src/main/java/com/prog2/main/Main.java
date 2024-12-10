package com.prog2.main;

import java.util.ArrayList;

public class Main {

	/**
	 * Write your test code below in the main.
	 *
	 */
	public static void main(String[] args) {
		
		// create array list of teachers
		ArrayList<Teacher> teachers = new ArrayList<>();
//		Teacher teacher1 = new Teacher("James", "Smith", "male", "james@email.com", 
//				"5141234567", "111, st 1", "A100", 1, "Fine Art", "Bachelor", 40, true);
//		Teacher teacher2 = new Teacher("Selena", "Jean", "female", "selena@email.com", 
//				"5144444444", "222, st 2", "A200", 2, "Modern Art", "Master", 30, false);
//		teachers.add(new Teacher("James", "Smith", "male", "james@email.com", 
//				"5141234567", "111, st 1", "A100", 1, "Fine Art", "Bachelor", 40, true));
//		teachers.add(teacher2);
//		System.out.println(teacher2.ComputePayRoll());
		
		// create array list of staffs
//		ArrayList<Staff> staffs = new ArrayList<>();
		Staff staff1 = new Staff("Jack", "Lee", "male", "jack@email.com", 
				"5143333333", "3, st 3", "S100", 1, "Admin", 45);
//		Staff staff2 = new Staff("Lora", "Max", "female", "lora@email.com", 
//				"5145555555", "555, st 5", "S200", 2, "Accounting", 40);
//		staffs.add(staff1);
//		staffs.add(staff2);
//		System.out.println(staff1.ComputePayRoll());
		
//		// create array list of departments
//		ArrayList<Department> departments = new ArrayList<>();
//		departments.add(new Department(1, "Art", teachers, staffs));
//		departments.add(new Department(2, "Statistics", teachers, staffs));
//		departments.add(new Department(3, "Engineering", teachers, staffs));
//		
//		// serialize array list of department 
//		UtilityMethods.Serialization(departments);
//		System.out.println(departments.toString());
//		
//		// deserialize saved array list of department
//		departments = UtilityMethods.Deserialization();
//		System.out.println(departments.toString());
	}

	
}
