package com.prog2.main;

public class AlreadyExistsException extends Exception{

	private static final long serialVersionUID = 1L;

	public AlreadyExistsException(String warning) {
		super(warning);
	}
	
	public AlreadyExistsException() {
		super();
	}
}
