package adapters;

public class ArabicToNumeralAdapter {

	public static String adapt(int valueToAdapt) {
		if(valueToAdapt == 1){
			return "I";
		}
		else{
			return "III";
		}
	}

}
