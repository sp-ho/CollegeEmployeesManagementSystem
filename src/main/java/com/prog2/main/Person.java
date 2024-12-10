package com.prog2.main;

import java.io.Serializable;
import java.util.Objects;

public abstract class Person implements Serializable {
	// instance variables
	private String fname;
	private String lname;
	private String gender;
	private String email;
	private String phone;
	private String address;
	private String office;
	
	// default constructor
	public Person() {}
	
	// generic constructor
	public Person(String fname, String lname, String gender, String email, 
			String phone, String address, String office) {
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.office = office;
	}
	
	public abstract String defineCategory();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Objects.equals(fname, other.fname) && Objects.equals(gender, other.gender)
				&& Objects.equals(lname, other.lname) && Objects.equals(office, other.office) && phone == other.phone;
	}

	@Override
	public String toString() {
		return "\nfname=" + fname + "\nlname=" + getLname() + "\ngender=" + getGender() 
				+ "\nemail=" + getEmail() + "\nphone=" + getPhone() + "\naddress=" + getAddress() + "\noffice=" + office + "\n";
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
	
} // class closing
