package input;

import java.io.PrintWriter;
import java.util.Scanner;

public class InputReceiver {
	
    
		

	public String receive(Scanner inputScanner, PrintWriter writer) {
		
		String scannedInput = inputScanner.next();
		writer.print(scannedInput);
		
		return scannedInput;
	}

}
