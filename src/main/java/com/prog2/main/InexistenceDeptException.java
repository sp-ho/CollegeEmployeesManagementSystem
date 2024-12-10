package com.prog2.main;

public class InexistenceDeptException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InexistenceDeptException (String warning) {
		super(warning);
	}
	
	public InexistenceDeptException() {
		super();
	}
	

}
