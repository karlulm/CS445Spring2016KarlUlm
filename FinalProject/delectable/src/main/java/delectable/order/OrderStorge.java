package delectable.order;

import java.util.HashMap;
import java.util.Map;


public class OrderStorge {
	
	public static Map<Long, Order> order = new HashMap<>();
	
	
	public static Map<Long, Order> getOrder(){
		return order;
	}

	

}
