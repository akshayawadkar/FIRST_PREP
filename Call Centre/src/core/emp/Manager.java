package core.emp;

import core.call.CallHandler;

public class Manager extends Employee{

	public Manager(CallHandler callHandler) {
		super(callHandler);
		rank = Rank.MANAGER;
	}
}
