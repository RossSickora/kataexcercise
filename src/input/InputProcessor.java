package input;

import java.io.PrintWriter;

import adapter.ArabicToNumeralAdapter;
import adapter.NumeralToArabicAdapter;

public class InputProcessor {

	public void process(String testInput, PrintWriter outputWriter) {
		
		if(isValidIntegerWithinString(testInput)){
			outputWriter.print(new ArabicToNumeralAdapter().adapt(Integer.parseInt(testInput))+"\n");
		}
		else if(isValidRomanNumeralString(testInput)){
			outputWriter.print(new NumeralToArabicAdapter().adapt(testInput)+"\n");
		}
		
		outputWriter.print("Application Terminated");

	}
	
	private boolean isValidIntegerWithinString(String stringToValidate){
		return stringToValidate.matches("^-?\\d+$");
	}
	
	private boolean isValidRomanNumeralString(String stringToValidate){
		return (stringToValidate.isEmpty() == false && stringToValidate.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"));
	}

}
