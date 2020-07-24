package core.emp;

import core.call.CallHandler;

public class Respondent extends Employee {
	
	public Respondent(CallHandler callHandler) {
		super(callHandler);
		rank = Rank.RESPONDENT;
	}
	
}
