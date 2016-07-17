package adapter;

import java.util.LinkedHashMap;
import java.util.Map;

public class ArabicToNumeralAdapter {
		
	public String adapt(int valueToAdapt) {
		LinkedHashMap<Integer, String> arabicToNumeralMap = initializeArabicToRomanMap();
		String adaptedValue = "";
		for (Map.Entry<Integer, String> mapEntry : arabicToNumeralMap.entrySet()) {
			
			int countOfMatches = valueToAdapt/mapEntry.getKey();
			adaptedValue += addNumeralsForEachcountOfMatches(countOfMatches, mapEntry.getValue());
			//now we only need to populate numerals for the remainder
			valueToAdapt = valueToAdapt % mapEntry.getKey();
		}
		
		//I really would rather do this with a standard HashMap and a lambda, but I'll try to fiddle with that
		//more later
		/*arabicToNumeralMap.forEach((arabic,numeral) -> {
			int countOfMatches = valueToAdapt/arabic;
			adaptedValue = addNumerals(countOfMatches, numeral);
			valueToAdapt = valueToAdapt % arabic;
		});*/
		
		
		return adaptedValue;
	}
	
	/**
	 * I create a String of the same numeral the length of the countOfMatches being passed in
	 * @param countOfMatches
	 * @param numeral
	 * @return String
	 */
	private String addNumeralsForEachcountOfMatches(int countOfMatches, String numeral) {
	StringBuilder numeralsToReturn = new StringBuilder();
	if(numeral == null){
		return null;
	}
	for (int i = 1; i <= countOfMatches; i++) {
		numeralsToReturn.append(numeral);
	}
		
	return numeralsToReturn.toString();
}
/**
 * I initialize a LinkedHashMap which contains the direct mapping between integers and their numeral counterparts.
 * The map is initialized from largest to smallest because we must convert from largest to smallest values in 
 * converting to Roman Numerals
 * @return HashMap<Integer, String>
 */
	private LinkedHashMap<Integer, String> initializeArabicToRomanMap() {
		LinkedHashMap<Integer, String> aMapToInitialize = new LinkedHashMap<Integer, String>();
		
		aMapToInitialize.put(500, "D");
		aMapToInitialize.put(400, "CD");
		aMapToInitialize.put(100, "C");
		aMapToInitialize.put(90, "XC");
		aMapToInitialize.put(50, "L");
		aMapToInitialize.put(40, "XL");
		aMapToInitialize.put(10, "X");
		aMapToInitialize.put(9, "IX");
		aMapToInitialize.put(5, "V");
		aMapToInitialize.put(4, "IV");
		aMapToInitialize.put(1, "I");
		
		return aMapToInitialize;
	}

}
