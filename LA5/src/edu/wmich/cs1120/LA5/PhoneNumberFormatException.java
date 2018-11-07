package edu.wmich.cs1120.LA5;

public class PhoneNumberFormatException extends Exception{
	
	private String unformattedNumber;
	
	PhoneNumberFormatException(String number) {
		unformattedNumber = number;
	}
	
	public String getNumber() {
		return unformattedNumber;
	}
}
