package counterHW;

public class Main {
	static final int RANDON_RANGE = 50;
	public static void main (String[] args) {
	
		int randomNumber = generateNumber();
		System.out.println(
			    is2DigitInDecimal(randomNumber)
			        ? "A szám decimálisan ábrázolva 2 jegyű: " + randomNumber
			        : "Nem kétjegyű az adott szám: " + randomNumber
			);
		System.out.println(
			    is2DigitInDecimal(randomNumber)
			        ? "Az érték 40 százaléka nagyobb vagy egyenlő mint 12: " + Math.round(randomNumber*0.4f)
			        : "A 40 százaléka kisebb mint 12: " +  Math.round(randomNumber*0.4f)
			);
		System.out.println(
			    is2DigitInDecimal(randomNumber)
			        ? "A szám osztható 5-tel: " + randomNumber
			        : "A szám nem osztható 5-tel: " + randomNumber
			);
		
	}
	
	static int generateNumber() {
		int randomNumber = (int)(Math.random() * RANDON_RANGE) + 1;
	    return randomNumber;
	}
	
	static boolean is2DigitInDecimal(int param) {
		return param >= 10 && param <= 99;
	}
	
	static boolean calculate40Percent(int param) {
		return param*0.4f >= 12;
	}
	
	static boolean isDivisibleByFive(int param) {
		return param % 5 == 0;
	}
	
}
//comment
