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
	
	
	
	public Customer addCustomer(Customer customer1){
		customer1.setCustomerId(customer.size()+1);
		customer.put(customer1.getCustomerId(), customer1);
		return customer1;
	}	
	
	
	public List<Customer> getCustomerByName(String name){
		List<Customer> customerForThisName = new ArrayList();
		for (Customer customer : customer.values()){
			
			name = name.replace("\"" , "");
			String RealName = customer.getName().toString();
		
			if (name.equals(RealName)){
				customerForThisName.add(customer);
			}
		}
		return customerForThisName;
	}
	

	
}
