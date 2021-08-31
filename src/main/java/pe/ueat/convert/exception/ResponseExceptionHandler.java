package pe.ueat.convert.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import pe.ueat.convert.controller.response.Response;



@ControllerAdvice
public class ResponseExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(ResponseExceptionHandler.class);
 
	@ExceptionHandler(MethodArgumentNotValidException.class)
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {

		LOGGER.error("HE FIELD \"" + ex.getBindingResult().getFieldError().getField().toUpperCase() + "\" " + 
				ex.getBindingResult().getFieldError().getDefaultMessage().toUpperCase());
		return new ResponseEntity<>(new Response(
				"THE FIELD " + ex.getBindingResult().getFieldError().getField().toUpperCase() + " " + 
						ex.getBindingResult().getFieldError().getDefaultMessage().toUpperCase()), 
				HttpStatus.BAD_REQUEST);
	}
	


	
	
}
