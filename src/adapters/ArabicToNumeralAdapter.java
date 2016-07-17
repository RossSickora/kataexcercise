package adapters;

public class ArabicToNumeralAdapter {

	public static String adapt(int valueToAdapt) {
		String anAdaptedValue = "";
		for (int i = 1; i <= valueToAdapt; i++) {
			if(i < 4){
				anAdaptedValue = anAdaptedValue.concat("I");
			}
			else{
				anAdaptedValue = "IV";
			}
			
		}
		return anAdaptedValue;
	}

}
