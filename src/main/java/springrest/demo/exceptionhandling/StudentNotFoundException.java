package springrest.demo.exceptionhandling;

public class StudentNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public StudentNotFoundException(String msg) {
		super(msg);
	}

}
