package edu.wmich.cs1120.LA5;

public class EmailAddressFormatException extends Exception{
	private String email;
	
	EmailAddressFormatException(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
}
