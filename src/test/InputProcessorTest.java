package test;

import static org.junit.Assert.assertEquals;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.Before;
import org.junit.Test;

import input.InputProcessor;

public class InputProcessorTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void processGracefulExitTest() {
		StringWriter writableOutput = new StringWriter();
		new InputProcessor().process("", new PrintWriter(writableOutput));
		
		assertEquals("Application Terminated", writableOutput.toString());
	}
	
	@Test
	public void processReturnValidArabicInputTranslatedToNumeralOutpuTest() {
		StringWriter writableOutput = new StringWriter();
		String testInput = "5";
		new InputProcessor().process(testInput, new PrintWriter(writableOutput));
		
		assertEquals("V\nApplication Terminated", writableOutput.toString());
	}
	
	@Test
	public void processReturnValidNumeralInputTranslatedToArabicOutpuTest() {
		StringWriter writableOutput = new StringWriter();
		String testInput = "V";
		new InputProcessor().process(testInput, new PrintWriter(writableOutput));
		
		assertEquals("5\nApplication Terminated", writableOutput.toString());
	}


}
