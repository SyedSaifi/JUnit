package com.example.Testsuits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit2 {
	String message = "Robert";	
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void TestSalutation() {
		message = "Hi! "+ message;
		assertEquals(message, messageUtil.salutationMessage());
	}
}
