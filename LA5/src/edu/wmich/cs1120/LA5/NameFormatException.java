package edu.wmich.cs1120.LA5;

public class NameFormatException extends Exception{
	private String name;
	
	NameFormatException(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	//String name;
	
	
	
}
