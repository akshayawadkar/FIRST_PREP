package org.shipment;

import java.util.Date;
import java.util.List;

public class Shippment {

	private String shipmentNumber;
	private Date shipmentDate;
	private Date estimatedDate;
	private String shipmentMethod;
	private List<ShipmentLog> shipmentLogs;
	
	public boolean addShipmentLog(ShipmentLog log) {
		return false;
	}
}
