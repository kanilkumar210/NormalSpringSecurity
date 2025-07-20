package com.company.vehicleservice.model;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorResponse {

	private String error;
	private String message;
	private LocalDateTime timestamp;
	private HttpStatus httpStatus;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public ErrorResponse(String error, String message, LocalDateTime timestamp, HttpStatus httpStatus) {
		super();
		this.error = error;
		this.message = message;
		this.timestamp = timestamp;
		this.httpStatus = httpStatus;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public ErrorResponse() {
		super();
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

}
