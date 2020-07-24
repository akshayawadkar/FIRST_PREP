package core.call;

import core.emp.Employee;
import core.emp.Rank;

public class Call {

	private Rank rank;
	
	private Caller caller;
	
	private Employee employee;

	
	Call(Caller c){
		caller = c;
		rank = rank.RESPONDENT;
	}
	
	public void reply(String message) {
		System.out.println(message);
	}
	
	public void disconnect() {
		reply("Thank  You");
	}
	
	public Rank incrementRank() {
		
		if(rank ==  Rank.RESPONDENT) {
			rank = Rank.MANAGER;
		}else if(rank == Rank.MANAGER) {
			rank = Rank.DIRECTOR;
		}
		
		return rank;
	}
	
	
	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Caller getCaller() {
		return caller;
	}

	public void setCaller(Caller caller) {
		this.caller = caller;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee handler) {
		this.employee = handler;
	}
	
	
	
}
