package adapter;

import java.util.LinkedHashMap;

public class NumeralToArabicAdapter {

	public int adapt(String numeral) {
		LinkedHashMap<Character, Integer> numeralToArabicMap = initializeRomanToArabicMap();
		int arabicValue = 0;
		int previousValue = 0;
		for(int characterIndex = numeral.length()-1; characterIndex >= 0 ; characterIndex--){
			char currentCharacter = numeral.charAt(characterIndex);
			int tempValue = numeralToArabicMap.get(currentCharacter);
			if(tempValue < previousValue){
				arabicValue = arabicValue-tempValue;
			}
			else{
				arabicValue = arabicValue + tempValue;
			}
			previousValue = tempValue;
		}
		return arabicValue;
	}
	
	
		
	private LinkedHashMap<Character, Integer> initializeRomanToArabicMap() {
		LinkedHashMap<Character, Integer> aMapToInitialize = new LinkedHashMap<Character, Integer>();
		
		aMapToInitialize.put('X', 10);
		aMapToInitialize.put('V', 5);
		aMapToInitialize.put('I', 1);
		
		return aMapToInitialize;
	}

}
