package com.ge.academy.contact_list.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 212565333 on 7/7/2016.
 */
public class ValidationException extends IllegalArgumentException {

	private Map<String, ArrayList<String>> fields;

	public ValidationException(Map<String, ArrayList<String>> fields) {
		this.fields = fields;
	}

	public Map<String, ArrayList<String>> getFields() {
		return fields;
	}

	public void setErrors(Map<String, ArrayList<String>> fields) {
		this.fields = fields;
	}
}
