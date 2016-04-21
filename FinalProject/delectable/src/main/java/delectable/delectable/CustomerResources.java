package delectable.delectable;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import delectable.Customer.Customer;
import delectable.Customer.CustomerServices;


@Path("customer")
public class CustomerResources {
	
	CustomerServices customerServices = new CustomerServices();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustomer(@QueryParam("name") String name){
		
		if (name != null){
			String newName = name.toString();
			return customerServices.getCustomerByName(newName);
		}
		
		return customerServices.getAllCustomers();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)
	public Customer addCustomer(Customer cust){
		return customerServices.addCustomer(cust);		
	}
	
	@GET
	@Path("{custID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomer(@PathParam("custID") long id){
		return customerServices.getCustomer(id);
		
	}
	

}
