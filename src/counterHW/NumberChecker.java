package counterHW;

public class NumberChecker {
	static final int RANDOM_RANGE = 50;

	public static void main(String[] args) {
		int randomNumber = generateNumber();
		boolean isTwoDigit = is2DigitInDecimal(randomNumber);
		boolean isAtLeast40PercentOf12 = isFortyPercentAtLeastTwelve(randomNumber);
		boolean divisibleByFive = isDivisibleByFive(randomNumber);

		System.out.println(
			isTwoDigit
				? "A szám decimálisan ábrázolva 2 jegyű: " + randomNumber
				: "Nem kétjegyű az adott szám: " + randomNumber
		);

		System.out.println(
			isAtLeast40PercentOf12
				? "Az érték 40 százaléka nagyobb vagy egyenlő mint 12: " + Math.round(randomNumber * 0.4f)
				: "A 40 százaléka kisebb mint 12: " + Math.round(randomNumber * 0.4f)
		);

		System.out.println(
			divisibleByFive
				? "A szám osztható 5-tel: " + randomNumber
				: "A szám nem osztható 5-tel: " + randomNumber
		);
	}

	static int generateNumber() { return (int) (Math.random() * RANDOM_RANGE) + 1; }

	static boolean is2DigitInDecimal(int param) {
		 return (param >= 10 && param <= 99) || (param <= -10 && param >= -99);
	}

	static boolean isFortyPercentAtLeastTwelve(int param) {
		return param * 0.4f >= 12;
	}

	static boolean isDivisibleByFive(int param) {
		return param % 5 == 0;
	}
}