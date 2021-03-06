package delectable.menu;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuServices {
	
	private Map<Long, Menu> menu = MenuStorge.getMenu();
	
	
	public List<Menu> getAllMenu(){
		
		return new ArrayList<Menu>(menu.values());
	}
	
	public Menu getMenu(long id){
		return menu.get(id);
	}
	
	public Menu addMenuItem(Menu menu1){

		menu1.setId(menu.size()+1);
		menu.put(menu1.getId(), menu1);
		
		Date today = new Date();
		menu1.setCreate_Day(today);
		menu1.setLast_modified_date(today);

		return menu1;
	}
	
	public Menu updateMenu(Menu menu1){		
		if( menu1.getId() <= 0){
			return null;
		}
		
		menu.put(menu1.getId(),menu1);
		return menu1;
	}

}
