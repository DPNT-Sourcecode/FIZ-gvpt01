package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {
	public final String FIZZ = "Fizz";
	public final String BUZZ = "Buzz";

	public String fizzBuzz(Integer number) {
		return doFizzBuzzLogic(number);
	}

	private String doFizzBuzzLogic(Integer number){
    	if(number % 3 ==0){
    		if(number % 15 ==0){
    			return FIZZ + BUZZ;
    		}else{
    			return FIZZ;
    		}
    		else if(number % 5 ==0){
    			return BUZZ;
    		}
    	}
    }
}
