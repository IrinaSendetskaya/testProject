package by.htp.carparking.web.util;

public class ValidateNullParamException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2413478517043978019L;

	public ValidateNullParamException() {
		super();
		
	}

	public ValidateNullParamException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		
	}

	public ValidateNullParamException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ValidateNullParamException(String arg0) {
		super(arg0);
	}

	public ValidateNullParamException(Throwable arg0) {
		super(arg0);
	}

}
