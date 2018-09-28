package befaster.solutions.HLO;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloSolutionTest {
	private HelloSolution helloSolution = new HelloSolution();
	private final String nameToTestFor = "Danny";
	@Test
	public void testHello() {
		assertEquals(helloSolution.hello(nameToTestFor), helloSolution.helloText+nameToTestFor);
	}

}
