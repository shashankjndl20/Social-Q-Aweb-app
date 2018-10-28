package com.upgrad.quora.api.response;

public class UserResponse {

	private String id;
	private String status;

	public UserResponse(String id, String status) {
		super();
		this.id = id;
		this.status = status;
	}

	public UserResponse() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
