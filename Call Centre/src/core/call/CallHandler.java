package core.call;

import java.util.*;

import core.emp.Director;
import core.emp.Employee;
import core.emp.Manager;
import core.emp.Respondent;

public class CallHandler {
	
	private final int LEVELS = 3;
	
	private final int NUM_OF_RESPONDENTS = 10;
	private final int NUM_OF_MANAGERS = 4;
	private final int NUM_OF_DIRECTORS = 2;
	
	List<List<Employee>> employeeLevels;
	List<List<Call>> callQueues;
	
	public CallHandler() {
		employeeLevels = new  ArrayList<List<Employee>>(LEVELS);
		callQueues = new ArrayList<List<Call>>(LEVELS);
		
		ArrayList<Employee> respondents = new ArrayList<>(NUM_OF_RESPONDENTS);
		for(int k = 0; k < NUM_OF_RESPONDENTS - 1; k++) {
			respondents.add(new Respondent(this));
		}
		employeeLevels.add(respondents);
		
		ArrayList<Employee> managers = new ArrayList<>(NUM_OF_MANAGERS);
		for(int k = 0; k < NUM_OF_MANAGERS - 1; k++) {
			managers.add(new Manager(this));
		}
		employeeLevels.add(managers);
		
		ArrayList<Employee> directors = new ArrayList<>(NUM_OF_DIRECTORS);
		for(int k = 0; k < NUM_OF_DIRECTORS - 1; k++) {
			managers.add(new Director(this));
		}
		employeeLevels.add(managers);
	}
	
	
	public Employee getHandlerForCall(Call call) {
		System.out.println("getHandlerForCall");
		for(int level = call.getRank().getValue(); level < LEVELS - 1; level++) {
			for(Employee emp : employeeLevels.get(level)) {
				if(emp.isFree()) {
					return emp;
				}
			}
		}
		return null;
	}
	
	
	public void dispatchCall(Caller caller) {
		System.out.println("dispatchCall 1 ");
		Call call = new Call(caller);
		dispatchCall(call);
	}
	
	public void dispatchCall(Call call) {
		System.out.println("dispatchCall 2");
		
		Employee emp = getHandlerForCall(call);
		if(emp != null) {
			emp.recieveCall(call);
			call.setEmployee(emp);
			
			 
		}else {
			call.reply("Please Wait");
			callQueues.get(call.getRank().getValue()).add(call);
		}
		 
	}
	
	public boolean assignCall(Employee emp) {
		System.out.println("assignCall");
		for(int rank = emp.getRank().getValue(); rank >= 0; rank--) {
			List<Call> que = callQueues.get(rank);
			if(!que.isEmpty()) {
				Call call = que.remove(0);
				if(call != null) {
					emp.recieveCall(call);
					return true;
				}
			}
		}
		return false;
	}
	

}
