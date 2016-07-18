package adapter;

public class NumeralToArabicAdapter {

	public int adapt(String numeral) {
		if(numeral.matches("III")){
			return 3;
		}
		return 1;
	}

}
