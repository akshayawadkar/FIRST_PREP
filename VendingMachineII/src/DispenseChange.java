
public class DispenseChange implements State{

	private VendingMachine vendingMachine;
	
	public DispenseChange(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
	
	@Override
	public void collectCash(int cash) {
		 throw new RuntimeException("Dispensing Change. Unable to collect cash");
	}

	@Override
	public void dispenseChange(String productCode) {
		 
		int change = this.vendingMachine.calculateChange(productCode);
		System.out.println("Change of "+ change + " returned");
		this.vendingMachine.setState(new DispenseProduct(this.vendingMachine));
		this.vendingMachine.dispenseProduct(productCode);
		
	}

	@Override
	public void dispenseProduct(String productCode) {
		throw new RuntimeException("Dispensing Change. Unable to dispense item");
	}

	@Override
	public void cancelTransaction() {
		 
		throw new RuntimeException("Dispensing Change. Unable to cancel the transaction");
	}

}
