package ar.com.educacionit.ui.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;
import ar.com.educacionit.services.exceptions.ServiceException;

public class ConsultarEncolarMain {

	private static ProductoServices ps = new ProductoServicesImpl();
	
	public static void main(String[] args) throws ServiceException {
		
		Collection<Producto> productos = ps.findProductos();

		Queue<Producto> productosConPrioridad = new PriorityQueue<Producto>(productos);
		
		System.out.println("Lista original" + productos);
		System.out.println("------");
		System.out.println("Lista con prioridad " + productosConPrioridad);
		
		Collection<Integer> lista = new PriorityQueue<Integer>();
		lista.add(1500);
		lista.add(2500);
		lista.add(10);
		lista.add(50);
		lista.add(5);
		
		Iterator<Integer> it = lista.iterator();
		while(it.hasNext()) {
			Integer valor = ((Queue<Integer>)lista).poll();
			System.out.println(valor);
		}
		
		System.out.println(lista);
		
	}

}
