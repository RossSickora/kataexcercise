package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import adapter.ArabicToNumeralAdapter;

public class ArabicToRomanNumeralTest {

	ArabicToNumeralAdapter adapter; 
	
	@Before
	public void setUp(){
		adapter = new ArabicToNumeralAdapter();
	}
	
	@Test
	public void arabicOneToRomanNumeralITest() {
		assertEquals("I", adapter.adapt(1));
	}
	
	@Test
	public void arabicThreeToRomanNumeralIIITest() {
		assertEquals("III", adapter.adapt(3));
	}
	
	@Test
	public void arabicFourToRomanNumeralIVTest() {
		assertEquals("IV", adapter.adapt(4));
	}
	
	@Test
	public void arabicFiveToRomanNumeralVTest() {
		assertEquals("V", adapter.adapt(5));
	}
	
	@Test
	public void arabicSixToRomanNumeralVITest() {
		assertEquals("VI", adapter.adapt(6));
	}
	
	@Test
	public void arabicNineToRomanNumeralIXTest(){
		assertEquals("IX", adapter.adapt(9));
	}

}
