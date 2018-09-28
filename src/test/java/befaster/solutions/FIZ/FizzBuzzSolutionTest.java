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
	public void testSolutionForBuzz() {
		assertEquals(fizzBuzzSolution.BUZZ, fizzBuzzSolution.fizzBuzz(5));
	}

	@Test
	public void testSolutionForFizzBuzz() {
		assertEquals(fizzBuzzSolution.FIZZ + fizzBuzzSolution.BUZZ, fizzBuzzSolution.fizzBuzz(15));
	}

	@Test
	public void testSolutionForNOTFizzBuzz() {
		// Numbers 1,2,4,7,8,11 are not divisible by 3 or 5.. This test that the
		// number passed in is returned as a String
		assertEquals(Integer.toString(1), fizzBuzzSolution.fizzBuzz(1));
		assertEquals(Integer.toString(2), fizzBuzzSolution.fizzBuzz(2));
		assertEquals(Integer.toString(4), fizzBuzzSolution.fizzBuzz(4));
		assertEquals(Integer.toString(7), fizzBuzzSolution.fizzBuzz(7));
		assertEquals(Integer.toString(8), fizzBuzzSolution.fizzBuzz(8));
		assertEquals(Integer.toString(11), fizzBuzzSolution.fizzBuzz(11));
		assertEquals(Integer.toString(13), fizzBuzzSolution.fizzBuzz(13));
		assertEquals(Integer.toString(14), fizzBuzzSolution.fizzBuzz(14));
		assertEquals(Integer.toString(16), fizzBuzzSolution.fizzBuzz(16));
		assertEquals(Integer.toString(17), fizzBuzzSolution.fizzBuzz(17));
		assertEquals(Integer.toString(19), fizzBuzzSolution.fizzBuzz(19));
		assertEquals(Integer.toString(22), fizzBuzzSolution.fizzBuzz(22));
		assertEquals(Integer.toString(23), fizzBuzzSolution.fizzBuzz(23));
	}
}
