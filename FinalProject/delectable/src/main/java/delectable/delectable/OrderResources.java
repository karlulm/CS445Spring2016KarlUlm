package delectable.delectable;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import delectable.menu.Menu;
import delectable.order.Order;
import delectable.order.OrderServices;


@Path("order")
public class OrderResources {
	
	OrderServices orderServe = new OrderServices();
	
	public OrderResources(){
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Order> getOrder(){
		return orderServe.getAllOrders();
	}
	
	@GET
	@Path("{orderId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Order getOneOrder(@PathParam("orderId") long id){
		return orderServe.getOrder(id);		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)
	public Order addOrder(Order order){
		return orderServe.addOrder(order);
	}
	

}
