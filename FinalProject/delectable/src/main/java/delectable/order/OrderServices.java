package delectable.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class OrderServices {
	
	private Map<Long, Order> order = OrderStorge.getOrder();
	
	public OrderServices(){
		
	}
	
	public List<Order> getAllOrders(){	
		return new ArrayList<Order>(order.values());
	}

	public Order getOrder(long id) {
		return order.get(id);
	}
	
	public Order addOrder(Order order1){
		return(order.put(order1.getId(), order1));
	}
	

}
