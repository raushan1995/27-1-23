package com.cg.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="TechReg")
public class Registration {

	
	private String fullName;
	private String emailId;
	private String password;
	private String mobileNumber;
	
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(String fullName, String emailId, String password, String mobileNumber) {
		super();
		this.fullName = fullName;
		this.emailId = emailId;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Registration [fullName=" + fullName + ", emailId=" + emailId + ", password=" + password
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	
}
