package test;

import static org.junit.Assert.*;

import org.junit.Test;

import adapters.ArabicToNumeralAdapter;

public class ArabicToRomanNumeralTest {

	@Test
	public void arabicOneToRomanNumeralOnetest() {
		assertEquals("I", ArabicToNumeralAdapter.adapt(1));
	}

}
