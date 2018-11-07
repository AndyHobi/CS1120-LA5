package edu.wmich.cs1120.LA5;

import java.io.FileNotFoundException;

public class FormatExceptionHandler implements IFormatExceptionHandler {

	@Override
	public void handleFileNotFoundException(FileNotFoundException e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handlePhoneNumberFormatException(PhoneNumberFormatException e) {
		string unformatedNumber = e.getNumber();
		
		
	}

	@Override
	public void handleEmailFormatException(EmailAddressFormatException e) {
		String email = e.getEmail();
		email.toLowerCase();
		System.out.println(email);
	}

	@Override
	public void handleNameFormatException(NameFormatException e) {
		// TODO Auto-generated method stub
		
	}

}
