package com.prog2.main;

public class Dean extends Teacher {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// default constructor
	public Dean() {}
	
	// generic constructor
	public Dean(String fname, String lname, String gender, String email, 
			String phone, String address, String office, int teacherId, 
			String specialty, String degree, double hoursWorked, boolean isFullTime) {
		super(fname, lname, gender, email, phone, address, office, 
				teacherId, specialty, degree, hoursWorked, isFullTime);
	}

	@Override
	public String toString() {
		return super.toString() + "\nDean:\nfname=" + getFname() + "\nlname=" + getLname() 
				+ "\ngender=" + getGender() + "\nemail=" + getEmail() 
				+ "\nphone=" + getPhone() + "\naddress=" + getAddress() 
				+ "\noffice=" + getOffice() + "\n";
	}
}
