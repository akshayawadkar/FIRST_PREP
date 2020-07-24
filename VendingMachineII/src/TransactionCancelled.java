
public class TransactionCancelled implements State {

	private VendingMachine vendingMachine;
	
	
	
	public TransactionCancelled(VendingMachine vendingMachine) {
		super();
		this.vendingMachine = vendingMachine;
	}

	
	@Override
	public void collectCash(int cash) {
		 
		throw new RuntimeException("Unable to collect cash in a canceled transaction");

	}

	@Override
	public void dispenseChange(String productCode) {
		
		throw new RuntimeException("Unable to dispense change in a canceled transaction");

	}

	@Override
	public void dispenseProduct(String productCode) {
		
		throw new RuntimeException("Unable to dispense product in a canceled transaction");

	}

	@Override
	public void cancelTransaction() {
		
		System.out.println("Returning the colleccted cash " +vendingMachine.getCollectedCash());
		vendingMachine.setCollectedCash(0);
		vendingMachine.setState(new Ready(vendingMachine));

	}

}
