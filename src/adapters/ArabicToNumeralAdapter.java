package adapters;

public class ArabicToNumeralAdapter {

	public static String adapt(int valueToAdapt) {
		String anAdaptedValue = "";
		for (int i = 0; i < valueToAdapt; i++) {
			anAdaptedValue = anAdaptedValue.concat("I");
			
		}
		return anAdaptedValue;
	}

}
