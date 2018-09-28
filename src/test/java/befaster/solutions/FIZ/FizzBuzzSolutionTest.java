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
		assertEquals(fizzBuzzSolution.FIZZBUZZ, fizzBuzzSolution.fizzBuzz(15));
		assertEquals(fizzBuzzSolution.FIZZBUZZ, fizzBuzzSolution.fizzBuzz(30));
		assertEquals(fizzBuzzSolution.FIZZBUZZ, fizzBuzzSolution.fizzBuzz(45));
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
		
		assertEquals(Integer.toString(101), fizzBuzzSolution.fizzBuzz(101));
		assertEquals(Integer.toString(532), fizzBuzzSolution.fizzBuzz(532));
		assertEquals(Integer.toString(997), fizzBuzzSolution.fizzBuzz(997));
	}
	@Test
	public void testFizzBuzzWith3NumberCheckContaining3(){
		assertEquals(fizzBuzzSolution.FIZZ,fizzBuzzSolution.doFizzBuzzWith3or5NumberCheck(3));
		assertEquals(fizzBuzzSolution.FIZZ,fizzBuzzSolution.doFizzBuzzWith3or5NumberCheck(13));
		assertEquals(fizzBuzzSolution.FIZZ,fizzBuzzSolution.doFizzBuzzWith3or5NumberCheck(23));
		assertEquals(fizzBuzzSolution.FIZZ,fizzBuzzSolution.doFizzBuzzWith3or5NumberCheck(33));
		assertEquals(fizzBuzzSolution.FIZZ,fizzBuzzSolution.doFizzBuzzWith3or5NumberCheck(43));
	}
	@Test
	public void testFizzBuzzWith5NumberCheckContaining5(){
		assertEquals(fizzBuzzSolution.BUZZ,fizzBuzzSolution.doFizzBuzzWith3or5NumberCheck(5));
		assertEquals(fizzBuzzSolution.BUZZ,fizzBuzzSolution.doFizzBuzzWith3or5NumberCheck(15));
		assertEquals(fizzBuzzSolution.BUZZ,fizzBuzzSolution.doFizzBuzzWith3or5NumberCheck(25));
		assertEquals(fizzBuzzSolution.BUZZ,fizzBuzzSolution.doFizzBuzzWith3or5NumberCheck(35));
		assertEquals(fizzBuzzSolution.BUZZ,fizzBuzzSolution.doFizzBuzzWith3or5NumberCheck(45));
	}
}
