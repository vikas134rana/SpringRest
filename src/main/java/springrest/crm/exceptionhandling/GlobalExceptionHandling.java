package springrest.crm.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import springrest.crm.entity.CustomerErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandling {

	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handlingException(CustomerNotFoundException exp) {
		CustomerErrorResponse errorResponse = new CustomerErrorResponse(HttpStatus.NOT_FOUND.value(), exp.getMessage());
		ResponseEntity<CustomerErrorResponse> responseEntity = new ResponseEntity<CustomerErrorResponse>(errorResponse, HttpStatus.NOT_FOUND);
		return responseEntity;
	}

	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handlingException(Exception exp) {
		CustomerErrorResponse errorResponse = new CustomerErrorResponse(HttpStatus.BAD_REQUEST.value(), exp.getMessage());
		ResponseEntity<CustomerErrorResponse> responseEntity = new ResponseEntity<CustomerErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
		return responseEntity;
	}

}
