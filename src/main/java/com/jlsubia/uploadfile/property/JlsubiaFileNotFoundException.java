package com.jlsubia.uploadfile.property;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class JlsubiaFileNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JlsubiaFileNotFoundException(String message) {
        super(message);
    }

    public JlsubiaFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
