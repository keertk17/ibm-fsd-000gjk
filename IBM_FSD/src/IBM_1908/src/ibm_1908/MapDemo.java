package ibm_1908;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	private Map<String,String>map;
	public MapDemo()
	{
		super();
		//map=new HashMap<String,String>();
		map=new TreeMap<>();
	}
	public void createMap()
	{
		map.put("Name","Keerthana");
		map.put("Address", "Chennai");
		
	}
	public Set<String> getMapKeys()
	{
		return map.keySet();
	}

}
