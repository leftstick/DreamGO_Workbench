package com.dreamworks.portal.exception;

public class ValidatorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8258660944239447689L;

	public ValidatorException() {
		super();
	}

	public ValidatorException(String msg) {
		super(msg);
	}

	public ValidatorException(Throwable ex) {
		super(ex);
	}

	public ValidatorException(Throwable ex, String msg) {
		super(msg, ex);
	}
}
