package ar.com.educacionit.services.queue.main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		
		//creacion
		Queue<String> filaParaCajero = new LinkedList<String>();
		
		filaParaCajero.add("juan");
		
		filaParaCajero.add("carlos");
		
		filaParaCajero.add("pedro");
		
		filaParaCajero.add("alex");
		
		Iterator<String> it = filaParaCajero.iterator();
		
		boolean agregar = true;
		while(it.hasNext()) {
			
			String persona = filaParaCajero.poll();
			
			System.out.println("Quitando a " + persona + " de la lista");

			System.out.println("QUEDAN: " +filaParaCajero.toString());
			
			if(filaParaCajero.size() == 2 && agregar) {
				System.out.println("LLEGO: MARTIN.. AGREGADO A LA LISTA");
				filaParaCajero.add("martin");
				agregar = !agregar;
			}
		}
	}
}
