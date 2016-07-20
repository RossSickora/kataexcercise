package input;

import java.io.PrintWriter;

import adapter.ArabicToNumeralAdapter;
import adapter.NumeralToArabicAdapter;

public class InputProcessor {

	public void process(String testInput, PrintWriter outputWriter) {
		
		if(testInput.matches("^-?\\d+$")){
			outputWriter.print(new ArabicToNumeralAdapter().adapt(Integer.parseInt(testInput))+"\n");
		}
		else if(testInput.isEmpty() == false && testInput.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")){
			outputWriter.print(new NumeralToArabicAdapter().adapt(testInput)+"\n");
		}
		
		outputWriter.print("Application Terminated");

	}


}
