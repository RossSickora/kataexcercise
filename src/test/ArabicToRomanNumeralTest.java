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
	
	@Test
	public void arabicTenToRomanNumeralXTest(){
		assertEquals("X", adapter.adapt(10));
	}
	
	@Test
	public void arabicElevenToRomanNumeralXITest(){
		assertEquals("XI", adapter.adapt(11));
	}
	
	@Test
	public void arabicFortyToRomanNumeralXLTest(){
		assertEquals("XL", adapter.adapt(40));
	}
	
	@Test
	public void arabicFiftyToRomanNumeralLTest(){
		assertEquals("L", adapter.adapt(50));
	}
	
	@Test
	public void arabicNinetyToRomanNumeralXCTest(){
		assertEquals("XC", adapter.adapt(90));
	}
	
	@Test
	public void arabicOneHundredToRomanNumeralCTest(){
		assertEquals("C", adapter.adapt(100));
	}
	
	@Test
	public void arabicFourHundredToRomanNumeralCDTest(){
		assertEquals("CD", adapter.adapt(400));
	}
	
	@Test
	public void arabicFiveHundredToRomanNumeralDTest(){
		assertEquals("D", adapter.adapt(500));
	}
	
	@Test
	public void arabicNineHundredToRomanNumeralCMTest(){
		assertEquals("CM", adapter.adapt(900));
	}
	
	@Test
	public void arabicOneThousandToRomanNumeralMTest(){
		assertEquals("M", adapter.adapt(1000));
	}

}
