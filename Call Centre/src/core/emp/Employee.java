package core.emp;

import core.call.Call;
import core.call.CallHandler;

public class Employee {

	private Call currentCall = null;
	protected Rank rank;
	private CallHandler callHandler;
	
	public Employee(CallHandler callHandler) {
		 this.callHandler = callHandler;
	}


	public void recieveCall(Call call) {
		 currentCall = call;
	}

	public boolean isFree() {
		return currentCall == null;
	}
	
	public void callCompleted() {
		if(currentCall != null) {
			currentCall.disconnect();
			currentCall = null;
		}
		assignNewCall();
	}
	
	public boolean assignNewCall() {
		if(!isFree()) {
			return false;
		}
		return callHandler.assignCall(this);
	}
	
	public void escalatedAndReassign() {
		if(currentCall != null) {
			currentCall.incrementRank();
			callHandler.dispatchCall(currentCall);
			currentCall = null;
		}
		assignNewCall();
	}
	
	

	public Call getCurrentCall() {
		return currentCall;
	}

	public void setCurrentCall(Call currentCall) {
		this.currentCall = currentCall;
	}

	public Rank getRank() {
		return rank;
	}

	 

	public CallHandler getCallHandler() {
		return callHandler;
	}

	public void setCallHandler(CallHandler callHandler) {
		this.callHandler = callHandler;
	}
	
	
	
	
}
