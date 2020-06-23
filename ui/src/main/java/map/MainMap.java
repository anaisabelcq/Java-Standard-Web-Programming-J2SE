package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainMap {

	public static void main(String[] args) {
		//crea un  mapa
		Map<String,String> map = new HashMap<String, String>();

		//carga 
		map.put("nombre", "carlos");
		map.put("edad", "34");
		
		Collection<String> valores = map.values();// -> valores
		Set<String> claves = map.keySet();//--> claves
		
		//obtener
		String nombre = map.get("nombre");
		
		//recorrer un map
		Set<Map.Entry<String, String>> entry = map.entrySet();
		
		Iterator<Map.Entry<String, String>> it = entry.iterator();
		
		for(Map.Entry<String, String> entryAux : entry) {
			
			String clave = entryAux.getKey();
			
			String valor = entryAux.getValue();
		}
		
	}

}
