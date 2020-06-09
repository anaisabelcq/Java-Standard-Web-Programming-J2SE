package ar.com.educacionit.services.exceptions;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 4722448153897365378L;

	public ServiceException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}
}
