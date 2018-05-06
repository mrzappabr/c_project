package br.com.mrzappa.c_project.util.exception;

public class UtilException extends Exception {


	private static final long serialVersionUID = 1L;

	public UtilException() {
		
	}

	public UtilException(String message) {
		super(message);
		
	}

	public UtilException(Throwable cause) {
		super(cause);
		
	}

	public UtilException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public UtilException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
