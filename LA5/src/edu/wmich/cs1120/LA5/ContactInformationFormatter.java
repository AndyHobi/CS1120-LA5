package edu.wmich.cs1120.LA5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContactInformationFormatter implements IContactInformationFormatter {

	@Override
	public void readContactInformation(String[] filePaths) {

		for (String filePath : filePaths) {

			formatContactInformation(filePath);
			System.out.println();
		}

	}

	@Override
	public void formatContactInformation(String fileName) {

		File file = new File(fileName);
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(file);

			String name = inputFile.nextLine();
			String number = inputFile.nextLine();
			String email = inputFile.nextLine();

			try {
				formatName(name);
			} catch (NameFormatException e) {
				FormatExceptionHandler.handleNameFormatException(e);
			}

			try {
				formatPhoneNumber(number);
			} catch (PhoneNumberFormatException e) {
				FormatExceptionHandler.handlePhoneNumberFormatException(e);
			}

			try {
				formatEmail(email);
			} catch (EmailAddressFormatException e) {
				FormatExceptionHandler.handleEmailFormatException(e);
			}

		} catch (FileNotFoundException e1) {
			FormatExceptionHandler.handleFileNotFoundException(e1);
		}
	}

	@Override
	public void formatEmail(String email) throws EmailAddressFormatException {

		if (email.toLowerCase().compareTo(email) == 0) {
			System.out.println(email);
		} else {
			throw new EmailAddressFormatException(email);
		}

	}

	@Override
	public void formatPhoneNumber(String phoneNumber) throws PhoneNumberFormatException {

		phoneNumber = phoneNumber.trim();

		if (phoneNumber.length() == 14) {

			char[] formatTemplate = "(###) ###-####".toCharArray();

			for (int i = 0; i < 14; i++) {

				if (formatTemplate[i] == '#') {
					switch (phoneNumber.charAt(i)) {

					case '0':
					case '1':
					case '2':
					case '3':
					case '4':
					case '5':
					case '6':
					case '7':
					case '8':
					case '9':
						break;

					default:
						throw new PhoneNumberFormatException(phoneNumber);
					}
				} else {
					if (formatTemplate[i] != phoneNumber.charAt(i)) {
						throw new PhoneNumberFormatException(phoneNumber);
					}
				}
			}
		}

		throw new PhoneNumberFormatException(phoneNumber);

	}

	@Override
	public void formatName(String name) throws NameFormatException {

		name = name.trim();

		String[] FLName = name.split(" ");

		if (FLName[0].charAt(0) >= 'A' && FLName[0].charAt(0) <= 'Z') {
			if (FLName[1].charAt(0) >= 'A' && FLName[1].charAt(0) <= 'Z') {
				if (FLName[0].substring(1).compareTo(FLName[0].toLowerCase().substring(1)) == 0) {
					if (FLName[1].substring(1).compareTo(FLName[1].toLowerCase().substring(1)) == 0) {
						System.out.println(name);
						return;
					}
				}
			}
		}

		throw new NameFormatException(name);

	}

}
