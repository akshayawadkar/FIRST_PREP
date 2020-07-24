
public class DispenseProduct implements State {

	
	private VendingMachine vendingMachine;
	
	
	
	public DispenseProduct(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public void collectCash(int cash) {
		
		 throw new RuntimeException("Dispensing Product. Cannot cancel the Tranaction");
	}

	@Override
	public void dispenseChange(String productCode) {

		 throw new RuntimeException("Dispensing Product. Cannot cancel the Tranaction");
		 
	}

	@Override
	public void dispenseProduct(String productCode) {
		
		vendingMachine.removeProduct(productCode);
		System.out.println("Dispensing item "+ productCode);
		vendingMachine.setState(new Ready(this.vendingMachine));
	}

	@Override
	public void cancelTransaction() {
		
		 throw new RuntimeException("Dispensing Product. Cannot cancel the Tranaction");
		 
	}

}
