package com.prog2.main;

import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Department implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// instance variables
	private int deptId;
	private String deptName;
	private ArrayList<Teacher> teachers;
	private ArrayList<Staff> staffs;
	
	// default constructor
	public Department () {}
	
	// generic constructor
	public Department(int deptId, String deptName, ArrayList<Teacher> teachers, ArrayList<Staff> staffs) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.teachers = teachers;
		this.staffs = staffs;
	}
	
	// getters and setters
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}

	public ArrayList<Staff> getStaffs() {
		return staffs;
	}

	public void setStaffs(ArrayList<Staff> staffs) {
		this.staffs = staffs;
	}

	@Override
	public String toString() {
		return "Department:\ndeptId=" + getDeptId() + "\ndeptName=" + getDeptName() 
				+ "\nteachers=" + getTeachers() + "\nstaffs=" + getStaffs() + "\n";
	}
	
	// check if teacher already existed
	public static boolean existedTeacher (Teacher teacher, 
			ArrayList<Teacher> teacherList) throws AlreadyExistsException {
		 
		for (int i = 0; i < teacherList.size(); i++) {
//			System.out.println(teacherList.get(i));
//			System.out.println(teacher);
			if(teacherList.get(i).getTeacherId() == teacher.getTeacherId()) {
				return true;
			}
		}
		return false;
	}
	
	// check if staff already existed
	public static boolean existedStaff(Staff staff, 
			ArrayList<Staff> staffList) throws AlreadyExistsException {
		 
		for (int i = 0; i < staffList.size(); i++) {
			if(staffList.get(i).getStaffId() == staff.getStaffId()) {
				return true;
			}
		}
		return false;
	}
	

	public static void addTeacher(Teacher teacher, ArrayList<Department> departments, 
			JTextField tfDeptId, JTextArea ta) throws AlreadyExistsException, InexistenceDeptException {
		boolean existed = false;
		for (int i = 0; i < departments.size(); i++) {
			if (Integer.valueOf(tfDeptId.getText()) == (departments.get(i).getDeptId())) {
				boolean isExisted = existedTeacher(teacher, departments.get(i).getTeachers());
				if (isExisted) {
					throw new AlreadyExistsException(
							ta.getText() + "Same teacher is already added.\n");
				} else {
					// if person is not existed, add to department array list
					departments.get(i).getTeachers().add(teacher);
					ta.setText(ta.getText() + "New teacher added.\n");
					existed = true;
				}
			}
		}
		if (!existed) {
			throw new InexistenceDeptException(ta.getText() + "Department not found.\n");
		}
	}
	
	public static void addDean(Dean dean, ArrayList<Department> departments, 
			JTextField tfDeptId, JTextArea ta) throws AlreadyExistsException, InexistenceDeptException {
		boolean existed = false;
		for (int i = 0; i < departments.size(); i++) {
			if (Integer.valueOf(tfDeptId.getText()) == (departments.get(i).getDeptId())) {
				boolean isExisted = existedTeacher(dean, departments.get(i).getTeachers());
				if (isExisted) {
					throw new AlreadyExistsException(
							ta.getText() + "Same dean is already added.\n");
				} else {
					// if person is not existed, add to department array list
					departments.get(i).getTeachers().add(dean);
					ta.setText(ta.getText() + "New dean added.\n");
					existed = true;
				}
			}
		}
		if (!existed) {
			throw new InexistenceDeptException(ta.getText() + "Department not found.\n");
		}
	}
	
	public static void addStaff(Staff staff, ArrayList<Department> departments, 
			JTextField tfDeptId, JTextArea ta) throws AlreadyExistsException, InexistenceDeptException {
		boolean existed = false;
		for (int i = 0; i < departments.size(); i++) {
			if (Integer.valueOf(tfDeptId.getText()) == (departments.get(i).getDeptId())) {
				boolean isExisted = existedStaff(staff, departments.get(i).getStaffs());
				if (isExisted) {
					throw new AlreadyExistsException(
							ta.getText() + "Same staff is already added.\n");
				} else {
					// if person is not existed, add to department array list
					departments.get(i).getStaffs().add(staff);
					ta.setText(ta.getText() + "New staff added.\n");
					existed = true;
				}
			}
		}
		if (!existed) {
			throw new InexistenceDeptException(ta.getText() + "Department not found.\n");
		}
	}
	
} // class closing

