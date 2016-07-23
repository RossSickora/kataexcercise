import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

import input.InputProcessor;
import input.InputReceiver;

public class RunningInMain {

	public static void main(String[] args) {
		InputProcessor aProcessor = new InputProcessor();
		StringWriter writableOutput = new StringWriter();
		InputReceiver receiver = new InputReceiver();
		Scanner inputScanner = new Scanner(System.in);
		receiver.receive(inputScanner, new PrintWriter(writableOutput));
		String inputToProcess = writableOutput.toString();
		writableOutput.flush();
		
		aProcessor.process(inputToProcess, new PrintWriter(writableOutput));
		System.out.println(writableOutput.toString());

	}

}
