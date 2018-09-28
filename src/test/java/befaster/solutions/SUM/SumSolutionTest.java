package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;

    @Before
    public void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void compute_sum() {
        assertThat(sum.compute(1, 1), equalTo(2));
        assertThat(sum.compute(2, 2), equalTo(4));
        assertThat(sum.compute(3, 4), equalTo(7));
    }
    @Test
    public void testAllComputeBetweenZeroAndOneHundred(){
    	for(int i=0;i<100; i++){
    		assertThat(sum.compute(1, i), equalTo(1 + i));
    		assertThat(sum.compute(3, i), equalTo(3 + i));
    		assertThat(sum.compute(7, i), equalTo(7 + i));
    	}
    }
}
