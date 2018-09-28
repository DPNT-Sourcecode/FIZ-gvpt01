package befaster.solutions.FIZ;

import org.apache.commons.lang3.StringUtils;

public class RunMe {

	public static void main(String[] args) {
		RunMe runMe = new RunMe();
		System.out.println(runMe.contains3MatchingDigits("3333533", "3"));
	}
	private boolean contains3MatchingDigits(String fullNumber, String firstDigitInNumber){
		boolean response = false;
		if (StringUtils.countMatches(fullNumber, firstDigitInNumber)==fullNumber.length()){
			response = true;
		}
		return response;
	}

}
