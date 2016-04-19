package delectable.menu;

import java.util.HashMap;
import java.util.Map;

public class MenuStorge {
	
	public static Map<Long, Menu> menu = new HashMap<>();
	
	
	public static Map<Long, Menu> getMenu(){
		return menu;
	}


}

