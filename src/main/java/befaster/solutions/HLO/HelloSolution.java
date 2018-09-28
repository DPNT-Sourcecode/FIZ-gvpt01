package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {
	public String helloWorldText = "Hello, ";
    public String hello(String friendName) {
        return helloWorldText+friendName+"!";
    }
}
