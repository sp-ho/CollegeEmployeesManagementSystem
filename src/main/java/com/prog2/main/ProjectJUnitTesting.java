package com.prog2.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ProjectJUnitTesting {
	// since the testing code is always repeating, we DRY by:
	Department departmentSamples;
	
	// start this before each method starts to implement
	@BeforeAll
	static void setUp() { // must be void
		System.out.println("Testing begins...\n");
	}
	
	// print this line every time the test is successful
	@AfterEach
	void tearDownEach() {
		System.out.println("Successfully done\n"); 
	}
	
	// print this after all tests are done
	@AfterAll
	static void tearDown() { // must be void
		System.out.println("Done!!");
	}
	
	
	@Test
	void existedTeacherTest1() throws AlreadyExistsException {
		System.out.println("Test is running...");
		
		// create a teacher object
		Teacher teacher = new Teacher("aaa", "bbb", "male", "aaa@email.com", 
				"1234567", "1, street 1", "A120", 1, "Art", "Master", 40, true);
		
		// create a teacher array list
		ArrayList<Teacher> teacherList = new ArrayList<>();
		teacherList.add(teacher); // add teacher object into the array list
		
		// teacher exists in teacherList, return true
		boolean actual = Department.existedTeacher(teacher, teacherList);
		boolean expected = true;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void existedTeacherTest2() throws AlreadyExistsException {
		System.out.println("Test is running...");
		
		// create a teacher object
		Teacher teacher = new Teacher("aaa", "bbb", "male", "aaa@email.com", 
				"1234567", "1, street 1", "A120", 1, "Art", "Master", 40, true);
		
		// create a teacher array list
		ArrayList<Teacher> teacherList = new ArrayList<>();
		// add a different teacher object into the array list
		teacherList.add(new Teacher("ccc", "ddd", "female", "ccc@email.com", 
				"1234567", "2, street 2", "B223", 2, "History", "PhD", 20, false)); 
				
		// teacher does not exist in teacherList, return false
		boolean actual = Department.existedTeacher(teacher, teacherList);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void existedStaffTest() throws AlreadyExistsException {
		System.out.println("Test is running...");
		
		// create a staff object
		Staff staff = new Staff("eee", "fff", "male", "eee@email.com", "3456789", 
				"3, street 3", "D100", 1, "Admin", 40);
		
		// create a staff array list
		ArrayList<Staff> staffList = new ArrayList<>();
		staffList.add(staff); // add teacher object into the array list
		
		// staff exists in staffList, return true
		boolean actual = Department.existedStaff(staff, staffList);
		boolean expected = true;
		
		assertEquals(expected, actual);
	}

	@Test
	void teacherComputePayRollTest1() {
		System.out.println("Test is running...");
		
		// create a teacher object
		Teacher teacher = new Teacher("James", "Smith", "male", 
				"james@email.com", "5141234567", "111, st 1", 
				"A100", 1, "Fine Art", "Bachelor", 40, true);
		
		// full-time: 32 * getDegreeRate(degree) * 2 * 0.85
		// 32 * 42 * 2 * 0.85
		double actual = teacher.ComputePayRoll();
		double expected = 2284.7999999999997;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void teacherComputePayRollTest2() {
		System.out.println("Test is running...");
		
		// create a teacher object
		Teacher teacher = new Teacher("Selena", "Jean", "female", 
				"selena@email.com", "5144444444", "222, st 2", 
				"A200", 2, "Modern Art", "Master", 30, false);
		
		// part-time: getHoursWorked() * getDegreeRate(degree) * 2 * 0.76
		// 30 * 82 * 2 * 0.76
		double actual = teacher.ComputePayRoll();
		double expected = 3739.2;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void teacherDefineCategoryTest() {
		System.out.println("Test is running...");
		
		// create a teacher object
		Teacher teacher = new Teacher("Selena", "Jean", "female", 
				"selena@email.com", "5144444444", "222, st 2", 
				"A200", 2, "Modern Art", "Master", 30, false);
		
		// isFullTime is false, return "Part-time Teacher" string 
		String actual = teacher.defineCategory();
		String expected = "Part-time Teacher";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void teacherGetDegreeRateTest() {
		System.out.println("Test is running...");
		
		// getDegreeRate is a static method
		// PhD: 112, Master: 82, Bachelor: 42
		int actual = Teacher.getDegreeRate("bachelor");
		int expected = 42;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void staffComputePayRollTest1() {
		System.out.println("Test is running...");
		
		// create a staff object
		Staff staff = new Staff("eee", "fff", "male", "eee@email.com", "3456789", 
				"3, street 3", "D100", 1, "Admin", 40);
		
		// workload = 40 hours
		// 40 * 32 * 2 * 0.75
		double actual = staff.ComputePayRoll();
		double expected = 1920.0;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void staffComputePayRollTest2() {
		System.out.println("Test is running...");
		
		// create a staff object
		Staff staff = new Staff("eee", "fff", "male", "eee@email.com", "3456789", 
				"3, street 3", "D100", 1, "Admin", 45);
		
		// workload can't exceed 40 hours, so return 0
		double actual = staff.ComputePayRoll();
		double expected = 0.0;
				
		assertEquals(expected, actual);
	}
	
}

