package ar.com.educacionit.services.queue.main;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMain {

	/**
	 * es neceario indicar la prioridad o sea implementar interface Comparable
	 * @param args
	 */
	public static void main(String[] args) {
		// creacion
		Queue<String> filaParaCajero = new PriorityQueue<String>();

		//offer es analogo a add
		filaParaCajero.add("juan");

		filaParaCajero.offer("carlos");

		filaParaCajero.offer("pedro");

		filaParaCajero.offer("alex");

		Iterator<String> it = filaParaCajero.iterator();

		//recorrido
		while (it.hasNext()) {

			//visualizara el primero de la cola, sin remover
			String persona = filaParaCajero .peek();
			
			System.out.println("primero de la lista es: " + persona);
			
			//extraccion
			persona = filaParaCajero.poll();
			
			System.out.println("Atendiendo a "+ persona);
			
			System.out.println("Queda: " + filaParaCajero.toString());
		}
	}
}
