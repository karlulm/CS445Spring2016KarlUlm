package delectable.delectable;

import java.util.List;
import java.util.Map;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import delectable.menu.Menu;
import delectable.menu.MenuServices;


@Path("menu")
public class MenuResources {
	
	MenuServices menuServies = new MenuServices();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Menu> getMenu(){
		return menuServies.getAllMenu();
	}
	
	@GET
	@Path("{MenuId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Menu getOneMenu(@PathParam("MenuId") long id){
		
		return menuServies.getMenu(id);
		
	}

}
