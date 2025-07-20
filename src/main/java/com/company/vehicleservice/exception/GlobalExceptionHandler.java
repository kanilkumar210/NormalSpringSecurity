package com.company.vehicleservice.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.company.vehicleservice.model.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();

		ex.getBindingResult().getFieldErrors()
				.forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));

		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(EmailAlreadyPresentException.class)
	public ErrorResponse handleEmailAlreadyPresentException(EmailAlreadyPresentException ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError("Internal Server Error");
		errorResponse.setMessage(ex.getMessage());
		errorResponse.setTimestamp(LocalDateTime.now());
		errorResponse.setHttpStatus(HttpStatus.NOT_FOUND);

		logger.error(ex.getMessage());

		return errorResponse;
	}

	@ExceptionHandler(InvalidVehicleId.class)
	public ErrorResponse handleInvalidVehicleId(InvalidVehicleId ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError("Internal Server Error");
		errorResponse.setMessage(ex.getMessage());
		errorResponse.setTimestamp(LocalDateTime.now());
		errorResponse.setHttpStatus(HttpStatus.NOT_FOUND);

		logger.error(ex.getMessage());

		return errorResponse;
	}
}
