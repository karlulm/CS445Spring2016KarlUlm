package delectable.delectable;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import delectable.menu.Menu;
import delectable.menu.MenuServices;

@Path("admin")
public class AdminResources {
	
	
//	MenuServices menuServies = new MenuServices();
	Admin thisAdmin = new Admin();

	@GET
	@Path("surcharge")
	@Produces(MediaType.APPLICATION_JSON)
	public int Admin(){
		thisAdmin.setSurcharge(89);
		return thisAdmin.getSurcharge();
	}
	
	@PUT
	@Path("menu")
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)
	public Menu addMenuItem(Menu menu){
		MenuServices thisThing = new MenuServices();
		return thisThing.addMenuItem(menu);		
	}
	
	@GET
	@Path("menu")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Menu> getMenu(){
		
		MenuServices thisThing = new MenuServices();
		return thisThing.getAllMenu();
	}

}
