package com.company.vehicleservice.exception;

public class EmailAlreadyPresentException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmailAlreadyPresentException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmailAlreadyPresentException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public EmailAlreadyPresentException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public EmailAlreadyPresentException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public EmailAlreadyPresentException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
