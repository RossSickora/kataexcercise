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
	
	@Test
	public void IVTo4Test(){
		assertEquals(4 ,new NumeralToArabicAdapter().adapt("IV"));
	}
	
	@Test
	public void VTo5Test(){
		assertEquals(5 ,new NumeralToArabicAdapter().adapt("V"));
	}
	
	@Test
	public void VITo6Test(){
		assertEquals(6 ,new NumeralToArabicAdapter().adapt("VI"));
	}
	
	@Test
	public void IXTo9Test(){
		assertEquals(9 ,new NumeralToArabicAdapter().adapt("IX"));
	}
	
	@Test
	public void XTo10Test(){
		assertEquals(10 ,new NumeralToArabicAdapter().adapt("X"));
	}

	@Test
	public void XLTo40Test(){
		assertEquals(40 ,new NumeralToArabicAdapter().adapt("XL"));
	}

	@Test
	public void LTo50Test(){
		assertEquals(50 ,new NumeralToArabicAdapter().adapt("L"));
	}
	
	@Test
	public void XCTo90Test(){
		assertEquals(90 ,new NumeralToArabicAdapter().adapt("XC"));
	}

	@Test
	public void CTo100Test(){
		assertEquals(100 ,new NumeralToArabicAdapter().adapt("C"));
	}

}
