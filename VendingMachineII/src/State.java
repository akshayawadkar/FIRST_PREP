
public interface State {
	public void collectCash(int cash);
	public void dispenseChange(String productCode);
	public void dispenseProduct(String productCode);
	public void cancelTransaction();
	
}
