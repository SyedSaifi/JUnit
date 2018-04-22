package com.example.Testsuits;

public class MessageUtil {

	private String message;

	public MessageUtil(String message) {
		this.message = message;
	}

	public String printMessage() {
		return message;
	}
	
	public String printMessageEx() {
		int z= 1/0;
		return "";
	}

	public String salutationMessage() {
		message = "Hi! " + message;
		return message;
	}
}
