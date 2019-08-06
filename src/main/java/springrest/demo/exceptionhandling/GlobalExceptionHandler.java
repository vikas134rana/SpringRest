package springrest.demo.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import springrest.demo.entity.StudentErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> exceptionHandling(StudentNotFoundException exp) {
		StudentErrorResponse errorResponse = new StudentErrorResponse(HttpStatus.NOT_FOUND.value(), exp.getMessage());
		ResponseEntity<StudentErrorResponse> responseEntity = new ResponseEntity<StudentErrorResponse>(errorResponse, HttpStatus.NOT_FOUND);
		return responseEntity;
	}

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> exceptionHandling(Exception exp) {
		StudentErrorResponse errorResponse = new StudentErrorResponse(HttpStatus.BAD_REQUEST.value(), exp.getMessage());
		ResponseEntity<StudentErrorResponse> responseEntity = new ResponseEntity<StudentErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
		return responseEntity;
	}

}
