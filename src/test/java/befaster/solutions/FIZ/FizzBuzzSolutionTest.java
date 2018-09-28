package befaster.solutions.FIZ;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzSolutionTest {
	FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();
	@Test
	public void testSolutionForFizz() {
		assertEquals(fizzBuzzSolution.FIZZ, fizzBuzzSolution.fizzBuzz(3));
	}
	@Test
	public void testSolutionForBuzz(){
		assertEquals(fizzBuzzSolution.BUZZ,fizzBuzzSolution.fizzBuzz(5));
	}

}
