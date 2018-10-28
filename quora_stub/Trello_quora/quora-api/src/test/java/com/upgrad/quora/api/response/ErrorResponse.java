package com.upgrad.quora.api.response;

public class ErrorResponse {

	private String code = "";
	private String errorMessage = "";

	public ErrorResponse(String code, String errorMessage) {
		super();
		this.code = code;
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return code;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
