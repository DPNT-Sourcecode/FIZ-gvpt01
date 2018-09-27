package befaster.solutions.FIZ;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzSolutionTest {
	private FizzBuzzSolution fizzBuzzSolution = new FizzBuzzSolution();

	@Test
	public void testFizzBuzzforFizz() {

		assertEquals(fizzBuzzSolution.FIZZ, fizzBuzzSolution.fizzBuzz(3));
	}

	@Test
	public void testFizzBuzzforBuzz() {

		assertEquals(fizzBuzzSolution.BUZZ, fizzBuzzSolution.fizzBuzz(5));
	}

	@Test
	public void testFizzBuzzforFizzBuzz() {
		assertEquals(fizzBuzzSolution.FIZZ + fizzBuzzSolution.BUZZ, fizzBuzzSolution.fizzBuzz(15));
	}

	@Test
	public void testForNotFizzOrBuzz() {
		// Numbers 1, 2, 4, 7, 8, 11 are divisible by 3 or 5, This tests how that the number is returned and not FIZZ or BUZZ
		assertEquals(Integer.toString(1), fizzBuzzSolution.fizzBuzz(1));
		assertEquals(Integer.toString(2), fizzBuzzSolution.fizzBuzz(2));
		assertEquals(Integer.toString(4), fizzBuzzSolution.fizzBuzz(4));
		assertEquals(Integer.toString(7), fizzBuzzSolution.fizzBuzz(7));
		assertEquals(Integer.toString(8), fizzBuzzSolution.fizzBuzz(8));
		assertEquals(Integer.toString(11), fizzBuzzSolution.fizzBuzz(11));
	}

}
