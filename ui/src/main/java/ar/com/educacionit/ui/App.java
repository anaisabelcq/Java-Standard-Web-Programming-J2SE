package ar.com.educacionit.ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;

/**
 * Hello world!
 *
 */
public class App  {
	
	private static ProductoServices ps = new ProductoServicesImpl();
	
	public static void main( String[] args )
    {
        System.out.println("AMB / Producto");
        
        //CRUD 
        //1 - CREATE (CODIGO, DESCRIPCION, PRECIO)
        //2 - READ (POR CODIGO, POR ID, POR DESCRIPCION)
        //3 - UPDATE (DESCRIPCION, PRECIO
        //4 - DELETE (ID, CODIGO)
        //5- FIN
        Scanner teclado = new Scanner(System.in);
        
        //mapa de menu
        Map<String, String> opciones = new HashMap<String, String>();
        
        //cargar valores
        opciones.put("1","Alta");
        opciones.put("2","Lectura");
        opciones.put("3","Update");
        opciones.put("4","Delete");
        opciones.put("5","FINALIZAR");
        
        //mapa de acciones
        Map<String, Ejecutable> mapaEjecutables = new HashMap<>();
        // cargar las acciones
        mapaEjecutables.put("1", new Alta());
        mapaEjecutables.put("2", new Lectura());
        mapaEjecutables.put("3", new Update());
        mapaEjecutables.put("4", new Delete());
        mapaEjecutables.put("5", new Default());
        
        Integer opcion;
        do {
        	
        	//recorrer un mapa
        	Set<Map.Entry<String, String>> mapa = opciones.entrySet();
        	
        	//recorrer un set
        	Iterator<Map.Entry<String, String>> it = mapa.iterator();
        	
        	while(it.hasNext()) {
        		Map.Entry<String, String> entry = it.next();
        		System.out.println(entry.getKey() + " - " + entry.getValue());
        	}
        	
        	opcion = teclado.nextInt();
        }while(opcion < 1 || opcion > 5);
        
        // key - value
        if(opcion != 5) {
        	
        	if(mapaEjecutables.containsKey("" + opcion)) {
	        	Ejecutable ej  = mapaEjecutables.get("" + opcion);
				ej.ejecutar(teclado);
			}else {
				System.out.println("No existe la accion solictada");
			}
        }
    }
}
