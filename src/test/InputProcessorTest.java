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
	public void applicationGracefulExitTest() {
		StringWriter writableOutput = new StringWriter();
		new InputProcessor().process(new PrintWriter(writableOutput));
		
		assertEquals("Application Terminated", writableOutput.toString());
	}

}
