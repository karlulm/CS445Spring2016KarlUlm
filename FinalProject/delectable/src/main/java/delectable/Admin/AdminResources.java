package delectable.Admin;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import delectable.menu.Menu;
import delectable.menu.MenuServices;

@Path("admin")
public class AdminResources {
	
	MenuServices menuServies = new MenuServices();
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)
	public Menu addMenuItem(Menu menu){
		return menuServies.addMenuItem(menu);
	}

}
