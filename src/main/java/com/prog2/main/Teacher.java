package com.prog2.main;

import java.io.Serializable;
import java.util.Objects;

public class Teacher extends Person implements PayRoll, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// instance variables
	private int teacherId;
	private String specialty;
	private String degree;
	private int degreeRate;
	private double hoursWorked;
	private boolean isFullTime;
	
	// default constructor
	public Teacher () {}
	
	// generic constructor
	public Teacher(String fname, String lname, String gender, String email, 
			String phone, String address, String office, int teacherId, 
			String specialty, String degree, double hoursWorked, boolean isFullTime) {
		super(fname, lname, gender, email, phone, address, office);
		this.teacherId = teacherId;
		this.specialty = specialty;
		this.degree = degree;
		this.hoursWorked = hoursWorked;
		this.isFullTime = isFullTime;
	}

	@Override
	public double ComputePayRoll() {
		if(isFullTime()) {
			return 32 * getDegreeRate(degree) * 2 * 0.85;
		} else
		return getHoursWorked() * getDegreeRate(degree) * 2 * 0.76;
	}
	
	// static getDegreeRate
	public static int getDegreeRate(String degree) {
		String deg = degree.toUpperCase();
		
		switch (deg){
		case "PHD": {
			return 112;
			}
		case "MASTER":{
			return 82;
			}
		case "BACHELOR":{
			return 42;
			}
		default: 
			return 0;
		}
	}

	@Override
	public String defineCategory() {
		if(isFullTime) {
			return "Full-time Teacher";
		}
		return "Part-time Teacher";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return degreeRate == other.degreeRate && Objects.equals(degree, other.degree)
				&& Double.doubleToLongBits(hoursWorked) == Double.doubleToLongBits(other.hoursWorked)
				&& isFullTime == other.isFullTime && Objects.equals(specialty, other.specialty);
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getdegree() {
		return degree;
	}

	public void setdegree(String degree) {
		this.degree = degree;
	}
	
	public void setDegreeRate(int degreeRate) {
		this.degreeRate = degreeRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public boolean isFullTime() {
		return isFullTime;
	}

	public void setFullTime(boolean isFullTime) {
		this.isFullTime = isFullTime;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}	
	
	@Override
	public String toString() {
		return super.toString() + "teacherId=" + getTeacherId() + "\nspecialty=" + getSpecialty()
				+ "\ndegree=" + getdegree() + "\ndegreeRate=" + getDegreeRate(degree) 
				+ "\nhoursWorked=" + getHoursWorked() + "\nisFullTime=" + isFullTime 
				+ "\nSalary=" + ComputePayRoll() + "\n";
	}
} // class closing
