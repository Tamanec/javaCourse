package com.epam.school;

public class WrongeSearchParamException extends Exception {
	
	private String message = "";

	public WrongeSearchParamException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	

}
