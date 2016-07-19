package adapter;

import java.util.LinkedHashMap;

public class NumeralToArabicAdapter {

	public int adapt(String numeral) {
		LinkedHashMap<String, Integer> numeralToArabicMap = initializeRomanToArabicMap();
		return numeralToArabicMap.get(numeral);
	}
	
	
	private LinkedHashMap<String, Integer> initializeRomanToArabicMap() {
		LinkedHashMap<String, Integer> aMapToInitialize = new LinkedHashMap<String, Integer>();
		
		aMapToInitialize.put("IV", 4);
		aMapToInitialize.put("III", 3);
		aMapToInitialize.put("I", 1);
		
		return aMapToInitialize;
	}

}
