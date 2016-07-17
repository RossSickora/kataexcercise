package test;

import static org.junit.Assert.*;

import org.junit.Test;

import adapters.ArabicToNumeralAdapter;

public class ArabicToRomanNumeralTest {

	@Test
	public void arabicOneToRomanNumeralOneTest() {
		assertEquals("I", ArabicToNumeralAdapter.adapt(1));
	}
	
	@Test
	public void arabicThreeToRomanNumeralThreeTest() {
		assertEquals("III", ArabicToNumeralAdapter.adapt(3));
	}
	
	@Test
	public void arabicFourToRomanNumeralFourTest() {
		assertEquals("IV", ArabicToNumeralAdapter.adapt(4));
	}

}
