package edu.wmich.cs1120.LA5;

import java.io.FileNotFoundException;

public class FormatExceptionHandler {

	public static void handleFileNotFoundException(FileNotFoundException e) {
		System.out.println("Error of file " + e.getMessage() );
		
	}

	public static void handlePhoneNumberFormatException(PhoneNumberFormatException e) {
		String ufNumber = e.getNumber();
		//System.out.println("system format execption check " + ufNumber);
		int count = 0;
		char[] charArray = new char[ufNumber.length()];
		int[] intArray = new int[10];
		
		for(int i = 0; i < 10; i++) {
			intArray[i] = 0;
		}
		
		for(int i = 0; i < ufNumber.length(); i++) {
			charArray[i] = new Character(ufNumber.charAt(i));
		}
		
		for(int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
				case '0': //<------------ these need to be written as '0' because charArray[i] is char not int
					intArray[count] = charArray[i] - '0';
					count ++;
					break;
				case '1':
					intArray[count] = charArray[i] - '0';
					count ++;
					break;
				case '2':
					intArray[count] = charArray[i] - '0';
					count ++;
					break;
				case '3':
					intArray[count] = charArray[i] - '0';
					count ++;
					break;
				case '4':
					intArray[count] = charArray[i] - '0';
					count ++;
					break;
				case '5':
					intArray[count] = charArray[i] - '0';
					count ++;
					break;
				case '6':
					intArray[count] = charArray[i] - '0';
					count ++;
					break;
				case '7':
					intArray[count] = charArray[i] - '0';
					count ++;
					break;
				case '8':
					intArray[count] = charArray[i] - '0';
					count ++;
					break;
				case '9':
					intArray[count] = charArray[i] - '0';
					count ++;
					break;
			}
		}
		
		System.out.println("(" + intArray[0] + intArray[1] + intArray[2] + ")" +
						    intArray[3] + intArray[4] + intArray[5] + "-" + 
				            intArray[6] + intArray[7] + intArray[8] + intArray[9]);
		
	}

	
	public static void handleEmailFormatException(EmailAddressFormatException e) {
		//System.out.println("email exection formater");
		String email = e.getEmail();
		email = email.toLowerCase();
		System.out.println(email);
	}

	public static void handleNameFormatException(NameFormatException e) {
		String ufName = e.getName();
		String[] stringArray = new String[ufName.length()];
		
		ufName.toLowerCase();
		stringArray = ufName.split(" ");
		stringArray[0] = ufName.substring(0, 1).toUpperCase() + ufName.substring(1);
		stringArray[1] = ufName.substring(0, 1).toUpperCase() + ufName.substring(1);
		System.out.println(stringArray[0] + " " + stringArray[1]);
		
	}

}
