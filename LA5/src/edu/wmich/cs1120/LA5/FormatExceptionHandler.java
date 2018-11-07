package edu.wmich.cs1120.LA5;

import java.io.FileNotFoundException;

public class FormatExceptionHandler implements IFormatExceptionHandler {

	@Override
	public void handleFileNotFoundException(FileNotFoundException e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handlePhoneNumberFormatException(PhoneNumberFormatException e) {
		String ufNumber = e.getNumber();
		int count = 0;
		char[] charArray = new char[ufNumber.length()];
		int[] intArray = new int[9];
		
		for(int i = 0; i < ufNumber.length(); i++) {
			charArray[i] = new Character(ufNumber.charAt(i));
		}
		
		for(int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
				case 0:
					intArray[count] = charArray[i];
					count ++;
					break;
				case 1:
					intArray[count] = charArray[i];
					count ++;
					break;
				case 2:
					intArray[count] = charArray[i];
					count ++;
					break;
				case 3:
					intArray[count] = charArray[i];
					count ++;
					break;
				case 4:
					intArray[count] = charArray[i];
					count ++;
					break;
				case 5:
					intArray[count] = charArray[i];
					count ++;
					break;
				case 6:
					intArray[count] = charArray[i];
					count ++;
					break;
				case 7:
					intArray[count] = charArray[i];
					count ++;
					break;
				case 8:
					intArray[count] = charArray[i];
					count ++;
					break;
				case 9:
					intArray[count] = charArray[i];
					count ++;
					break;
			}
		}
		
		System.out.println("(" + intArray[0] + intArray[1] + intArray[2] + ")" +
						    intArray[3] + intArray[4] + intArray[5] + "-" + 
				            intArray[6] + intArray[7] + intArray[8] + intArray[9]);
		
	}

	@Override
	public void handleEmailFormatException(EmailAddressFormatException e) {
		String email = e.getEmail();
		email.toLowerCase();
		System.out.println(email);
	}

	@Override
	public void handleNameFormatException(NameFormatException e) {
		String ufName = e.getName();
		String[] stringArray = new String[ufName.length()];
		
		ufName.toLowerCase();
		stringArray = ufName.split(" ");
		stringArray[0] = ufName.substring(0, 1).toUpperCase() + ufName.substring(1);
		stringArray[1] = ufName.substring(0, 1).toUpperCase() + ufName.substring(1);
		System.out.println(stringArray[0] + " " + stringArray[1]);
		
	}

}
