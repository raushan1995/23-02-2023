package com.cg.model;




public class Registration {
     
	private String fullName;
	private String emailId ;
	private String country;
	private int mobileNumber;
	
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(String fullName, String emailId, String country, int mobileNumber) {
		super();
		this.fullName = fullName;
		this.emailId = emailId;
		this.country = country;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Registration [fullName=" + fullName + ", emailId=" + emailId + ", country=" + country
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	
}
  