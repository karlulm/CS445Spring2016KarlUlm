package delectable.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomerServices {
	
	private Map<Long, Customer> customer = CustomerStorge.getCustomer();
	
	
	public List<Customer> getAllCustomers(){
		return new ArrayList<Customer>(customer.values());
	}
	
	public Customer getCustomer(long id){
		return customer.get(id);
	}
	
}
