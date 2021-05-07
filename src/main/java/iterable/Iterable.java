package iterable;

public class Iterable {
	
	private String[] numberArray = {"Zero", "One", "Two", "Three",
			"Four", "Five", "Six", "Seven", "Eight", "Nine"};
	
	private String[] teenArray = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", 
			"Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	
	private String[] tensArray = {"Zero", "Ten", "Twenty", "Thirty", "Fourty", 
			"Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	
	private String[] zeros = {"Hundred", "Thousand"};
	
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
		int firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));
		
		switch(Integer.toString(number).length()) {
		case 1:
			return numberArray[number];
		case 2:
			if (number < 20) {
				return teenArray[(number % 10)];
			} else if (number % 10 == 0) {
				return tensArray[firstDigit];
			} else {
				return (tensArray[firstDigit]+numberArray[(number % 10)]);
			}
		case 3:
			if (number % 100 == 0) {
				return (numberArray[firstDigit]+" "+zeros[0]);
			} else {
				return (numberArray[firstDigit]+" "+zeros[0]+" And "+numberCalc(number % 100));
			}
		case 4:
			if (number % 1000 == 0) {
				return (numberArray[firstDigit]+" "+zeros[1]);
			} else {
				return (numberArray[firstDigit]+" "+zeros[1]+" "+numberCalc(number % 1000));
			}
		case 5:
			int firstTwoNums = Integer.parseInt(Integer.toString(number).substring(0, 2));
			if (number % 10000 == 0) {
				return (numberCalc(firstTwoNums)+" "+zeros[1]);
			} else {
				return (numberCalc(firstTwoNums)+" "+zeros[1]+" "+numberCalc((number % 10000) % 1000));
			}
		default:
			return "Number not recognised";
		}
	}
}

