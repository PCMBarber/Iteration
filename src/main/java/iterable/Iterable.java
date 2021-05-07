package iterable;

public class Iterable {
	
	private static final String[] tensNames = {
			"",
			"",
		    "twenty",
		    "thirty",
		    "forty",
		    "fifty",
		    "sixty",
		    "seventy",
		    "eighty",
		    "ninety",
		    "hundred"
		  };

	private static final String[] numNames = {
			"",
		    "one",
		    "two",
		    "three",
		    "four",
		    "five",
		    "six",
		    "seven",
		    "eight",
		    "nine",
		    "ten",
		    "eleven",
		    "twelve",
		    "thirteen",
		    "fourteen",
		    "fifteen",
		    "sixteen",
		    "seventeen",
		    "eighteen",
		    "nineteen",
		    "twenty"
		  };

	public void printToTen() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(numberCalc(i));
		}
	}
	
	public void printToThousand() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println(numberCalc(i));
		}
	}
	
	public void printToOneHundred() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(numberCalc(i));
		}
	}
	
	public String numberCalc(int number) {
		
		if (number<numNames.length) {
			return numNames[number];
		} else if (number < 100) {
			return tensNames[number/10] + toWord(number%10);
		} else {
			return numNames[number/100] + " Hundred and " + toWord(number%100);
		}
		
	}
}

