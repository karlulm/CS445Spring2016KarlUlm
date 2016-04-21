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
	
	public MenuResources(){
		
	}
	
//	public MenuServices getMenuServices(){
//		return this.menuServies;
//	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Menu> getMenu(){
		return menuServies.getAllMenu();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)
//  I added this Method because I could not get the Admin PUT function working. 
	public Menu addMenuItem(Menu menu){
		return menuServies.addMenuItem(menu);		
	}
	
	@GET
	@Path("{MenuId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Menu getOneMenu(@PathParam("MenuId") long id){
		
		return menuServies.getMenu(id);
		
	}

}
