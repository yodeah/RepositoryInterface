package com.ge.academy.contact_list.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 212565333 on 7/7/2016.
 */
public class ValidationException extends IllegalArgumentException {

	private Map<String, ArrayList<String>> errors;

	public ValidationException(Map<String, ArrayList<String>> errors) {
		this.errors = errors;
	}

	public Map<String, ArrayList<String>> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, ArrayList<String>> errors) {
		this.errors = errors;
	}
}
