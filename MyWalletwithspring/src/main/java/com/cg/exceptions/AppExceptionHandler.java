package com.cg.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


//This class is not a controller, but an assistant to ALL controller within the Application
@ControllerAdvice
public class AppExceptionHandler {
	@ExceptionHandler({ApplicationException.class})
	public ResponseEntity<String> handleError(ApplicationException exception){
		return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}

}
