package adapters;

public class ArabicToNumeralAdapter {

	public static String adapt(int valueToAdapt) {
		String anAdaptedValue = "";
		for (int i = 1; i <= valueToAdapt; i++) {
			if(i < 4){
				anAdaptedValue = anAdaptedValue.concat("I");
			}
			else{
				switch (valueToAdapt) {
				case 4:
					anAdaptedValue = "IV";
					break;
				case 5:
					anAdaptedValue = "V";
					break;
				case 6:
					anAdaptedValue = "VI";
					break;
				default:
					break;
				}
			}
			
		}
		return anAdaptedValue;
	}

}
