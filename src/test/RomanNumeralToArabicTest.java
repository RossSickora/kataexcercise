package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import adapter.NumeralToArabicAdapter;

public class RomanNumeralToArabicTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void ITo1Test() {
		assertEquals(1 ,new NumeralToArabicAdapter().adapt("I"));
	}
	
	@Test
	public void IIITo3Test() {
		assertEquals(3 ,new NumeralToArabicAdapter().adapt("III"));
	}

}
