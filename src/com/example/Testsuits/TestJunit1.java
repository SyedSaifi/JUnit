package com.example.Testsuits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit1 {
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test(timeout = 1000)
	public void TestMessage() {
		assertEquals(message, messageUtil.printMessage());
	}

	@Test(expected = ArithmeticException.class)
	public void testPrintMessage() {
		messageUtil.printMessageEx();
		assertEquals(message, messageUtil.printMessage());
	}
}
