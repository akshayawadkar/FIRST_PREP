package core.emp;

import core.call.CallHandler;

public class Director extends Employee{

	public Director(CallHandler callHandler) {
		super(callHandler);
		rank = Rank.DIRECTOR;
	}
}
