package delectable.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerStorge {
	
	public static Map<Long, Customer> customer = new HashMap<>();
	
	
	public static Map<Long, Customer> getCustomer(){
		return customer;
	}
	

}