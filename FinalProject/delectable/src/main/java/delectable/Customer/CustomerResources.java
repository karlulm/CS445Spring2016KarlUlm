package delectable.Customer;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public class CustomerResources {
	
	CustomerServices customerServices = new CustomerServices();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustomer(){
		return customerServices.getAllCustomers();
	}

}
