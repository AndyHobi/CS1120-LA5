package edu.wmich.cs1120.LA5;

public class PhoneNumberFormatException extends Exception{
	private String unformatedNumber;
	
	public String getNumber() {
		return unformatedNumber;
	}
}
