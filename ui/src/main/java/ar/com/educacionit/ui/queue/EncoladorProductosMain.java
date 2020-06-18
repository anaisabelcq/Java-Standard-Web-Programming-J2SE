package ar.com.educacionit.ui.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;
import ar.com.educacionit.services.exceptions.ServiceException;

public class EncoladorProductosMain {

	private static ProductoServices ps = new ProductoServicesImpl();
	
	public static void main(String[] args) throws ServiceException {
		
		//creacion de la queue
		Queue<Producto> colaDeProductos = new LinkedList<>();

		//carga
		
		Scanner teclado  = new Scanner(System.in);
		for(int i=0;i<3; i++) {
			System.out.print("Codigo: ");
			String  codigo = teclado.next();
			
			System.out.print("Precio: ");
			Float precio = teclado.nextFloat();

			System.out.print("Descripcion : ");
			String descripcion = teclado.next();
			
			//creo nuevo producto, solo acá!!! no existe en db
			Producto nuevoProducto = new Producto(descripcion, precio, codigo);
			colaDeProductos.offer(nuevoProducto);
		}
		
		//recorrer la cola para
		Iterator<Producto> it = colaDeProductos.iterator();
		while(it.hasNext()) {
			//desencolar
			System.out.println("El siguiente es:" + colaDeProductos.peek());
			
			Producto ste =  colaDeProductos.poll();
			
			ps.nuevoProducto(ste);
			
			System.out.println("producto insertado...");
			System.out.println("Quedan : " + colaDeProductos.toString());
		}
	}

}
