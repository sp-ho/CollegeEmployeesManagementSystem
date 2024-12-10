package com.prog2.main;

import java.io.Serializable;
import java.util.Objects;

public class Staff extends Person implements PayRoll, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// instance variables
	private int staffId;
	private String duty;
	private double workload;
	
	// default constructor
	public Staff() {}
	
	// generic constructor
	public Staff(String fname, String lname, String gender, String email, String phone, 
			String address, String office, int staffId, String duty, double workload) {
		super(fname, lname, gender, email, phone, address, office);
		this.staffId = staffId;
		this.duty = duty;
		this.workload = workload;
	}

	@Override
	public double ComputePayRoll() {
		double result = 0;
		if(getWorkload() > 40) {
			System.out.println("Workload cannot exceed 40 hours");
		} else {
			result = getWorkload() * 32 * 2 * 0.75; 
		}
		return result;
	}

	@Override
	public String defineCategory() {
		return "Full-time Staff";
	}

	public double getWorkload() {
		return workload;
	}

	public void setWorkload(double workload) {
		this.workload = workload;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Staff other = (Staff) obj;
		return Objects.equals(duty, other.duty)
				&& Double.doubleToLongBits(workload) == Double.doubleToLongBits(other.workload);
	}

	@Override
	public String toString() {
		return super.toString() + "staffId=" + getStaffId() + "\nduty=" + getDuty() 
				+ "\nworkload=" + getWorkload() + "\nSalary=" + ComputePayRoll() + "\n";
	}	
} // class closing
