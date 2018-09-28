package befaster.solutions.FIZ;

public class FizzBuzzSolution {
	public final String FIZZ = "fizz";
	public final String BUZZ = "buzz";
	public final String FIZZBUZZ = FIZZ +" " + BUZZ;

	public String fizzBuzz(Integer number) {
		return doFizzBuzzLogic(number);
	}

	private String doFizzBuzzLogic(Integer number) {
		if (number % 3 == 0) {
			if (number % 15 == 0) {
				//if divisible by 3 and 5 return FIZZBUZZ
				return FIZZBUZZ;
			} else {
				//if divisible 3 only return FIZZ
				return FIZZ;
			}
		} else if (number % 5 == 0) {
			//if divisible 5 only return BUZZ
			return BUZZ;
		}
		return String.valueOf(number);
	}
}
