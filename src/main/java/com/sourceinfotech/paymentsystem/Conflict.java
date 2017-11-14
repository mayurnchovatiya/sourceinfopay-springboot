package com.sourceinfotech.paymentsystem;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * @author Ketan
 *
 */

@ResponseStatus(code=HttpStatus.CONFLICT)
public class Conflict extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public Conflict(String message) {
		super(message);
	}
	public Conflict(String message, Throwable cause) {
		super(message, cause);
	}
}
