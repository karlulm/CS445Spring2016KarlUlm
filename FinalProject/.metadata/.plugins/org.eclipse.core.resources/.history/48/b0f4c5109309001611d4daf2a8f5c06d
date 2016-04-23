package delectable.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class OrderServices {
	
	private Map<Long, Order> order = OrderStorge.getOrder();
	
	public OrderServices(){
		order.put(1L, new Order(24601, "Sun 2004.07.18 at 04:14:09 PM" , "Sun 2004.07.18 at 04:14:09 PM", 69.69, 0, "open", "stig" ));
		
	}
	
	public List<Order> getAllOrders(){	
		return new ArrayList<Order>(order.values());
	}

	public Order getOrder(long id) {
		return order.get(id);
	}
	

}
