import core.call.CallHandler;
import core.call.Caller;

public class Test {

	public static void main(String[] args) {
		
		CallHandler ch = new CallHandler();
		ch.dispatchCall(new Caller("Akshay", 1));
		System.out.println("here");
	}
	
}
