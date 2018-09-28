package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {
	public final String helloWorldText = "Hello, ";
	public final String additionalHelloWorldText = "!";
    public String hello(String friendName) {
        return helloWorldText+friendName+"!";
    }
}
