package befaster.solutions.FIZ;

public class FizzBuzzSolution {
	public final String FIZZ = "fizz";
	public final String BUZZ = "buzz";
	public final String FIZZBUZZ = FIZZ + " " + BUZZ;

	public String fizzBuzz(Integer number) {
		return doFizzBuzzLogic(number);
	}

	public String doFizzBuzzWith3or5NumberCheck(Integer number) {
		return doFizzBuzzLogicWith3or5NumberCheck(number);
	}

	private String doFizzBuzzLogic(Integer number) {
		if (number % 3 == 0) {
			if (number % 15 == 0) {
				// if divisible by 3 and 5 return FIZZBUZZ
				return FIZZBUZZ;
			} else {
				// if divisible 3 only return FIZZ
				return FIZZ;
			}
		} else if (number % 5 == 0) {
			// if divisible 5 only return BUZZ
			return BUZZ;
		}
		return String.valueOf(number);
	}

	private String doFizzBuzzLogicWith3or5NumberCheck(Integer number) {
		boolean conditionsNotMet = false;
		String response = "";
		String numberToCheckAsString = String.valueOf(number);
		String number3 = String.valueOf(3);
		String number5 = String.valueOf(5);
		if(number % 15 == 0 && numberToCheckAsString.toString().contains(number3)){
			response = FIZZ;
			conditionsNotMet = true;
		}
		if(number % 15 == 0 && numberToCheckAsString.toString().contains(number5)){
			response = BUZZ;
			conditionsNotMet = true;
		}
		
		//if number divisible by 3 or contains 3 return FIZZ
		if (number % 3 == 0 || numberToCheckAsString.toString().contains(number3)) {
			response = FIZZ;
			conditionsNotMet = true;
		}
		//if number divisible by 5 or contains 5 return BUZZ
		if (number % 5 == 0 || numberToCheckAsString.toString().contains(number5)) {
			response = response + BUZZ;
			conditionsNotMet = true;
		}
		//Conditions not meet so return number as string
		if (!conditionsNotMet) {
			return String.valueOf(number);
		}
		return response;
	}
}
