import java.util.List;

public class Order {

	private int order_id;
	private OrderPriority orderPriority;
	private Client client;
	private Location src;
	private Location dest;
	private int fees;
	private List<Item> items;
	private int totalWeight;
	private PaymentStatus payementStatus; 
	
	
	
}
