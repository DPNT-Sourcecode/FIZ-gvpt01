package befaster.solutions.FIZ;

public class FizzBuzzSolution {
	public String FIZZ = "Fizz";
	public String BUZZ = "Buzz";

	public String fizzBuzz(Integer number) {
		return doFizzBuzzLogic(number);
	}

	private String doFizzBuzzLogic(Integer number) {
		if (number % 3 == 0) {
			if (number % 15 == 0) {
				return FIZZ + BUZZ;
			} else {
				return FIZZ;
			}
		} else if (number % 5 == 0) {
			return BUZZ;
		}
		return String.valueOf(number);

	}
}
