package test;

import static org.junit.Assert.assertEquals;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import input.InputReceiver;

public class InputReceiverTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void ArabicInputWillMirrorOutputTest() {		
		String testString = "5";
		StringWriter writableOutput = new StringWriter();
		
		assertEquals("5", new InputReceiver().receive(new Scanner(testString), new PrintWriter(writableOutput)));
		
		assertEquals("5", writableOutput.toString());
	}
	
	@Test
	public void NumeralInputWillMirrorOutputTest() {
		String testString = "V";
		StringWriter writableOutput = new StringWriter();
		assertEquals("V", new InputReceiver().receive(new Scanner(testString), new PrintWriter(writableOutput)));
		
		assertEquals("V", writableOutput.toString());
	}
	

}
