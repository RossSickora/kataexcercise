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
	public void arabicOneToRomanNumeralOneTest() {
		assertEquals("I", adapter.adapt(1));
	}
	
	@Test
	public void arabicThreeToRomanNumeralThreeTest() {
		assertEquals("III", adapter.adapt(3));
	}
	
	@Test
	public void arabicFourToRomanNumeralFourTest() {
		assertEquals("IV", adapter.adapt(4));
	}
	
	@Test
	public void arabicFiveToRomanNumeralFiveTest() {
		assertEquals("V", adapter.adapt(5));
	}
	
	@Test
	public void arabicSixToRomanNumeralSixTest() {
		assertEquals("VI", adapter.adapt(6));
	}
	

}
