package edu.wmich.cs1120.LA5;

public class NameFormatException extends Exception{

	String name;
	
	NameFormatException(String name) {
		this.name = name;
	}
	
}
