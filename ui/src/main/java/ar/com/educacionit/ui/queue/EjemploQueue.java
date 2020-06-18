package ar.com.educacionit.ui.queue;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class EjemploQueue {

	public static void main(String[] args) {
		
		//Map
		Map<String,Integer> equipo = new HashMap<String, Integer>();
		equipo.put("romero", 25);
		equipo.put("carlos", 34);
		equipo.put("emmanuel", 52);
		equipo.put("fede", 30);
		
		Queue<String> nombresQueue = new PriorityQueue<String>(); 
		Set<String> nombres = equipo.keySet();
		for(String nombre : nombres) {
			//System.out.println(nombre);
			nombresQueue.offer(nombre);
		}
		
		Iterator<String> nombresIt =  nombresQueue.iterator();
		while(nombresIt.hasNext()) {
			System.out.println(nombresQueue.poll());
		}
		
		/*
		System.out.println("--");
		
		Collection<Integer> edades = equipo.values();
		for(Integer edad : edades) {
			System.out.println(edad);
		}
		
		Integer edad = equipo.get("carlos");
		System.out.println("para carlos, la edad es " + edad);
		
		System.out.println("--");
		
		//recorrer claves y valores
		Set<Map.Entry<String, Integer>> par = equipo.entrySet();
		Iterator<Map.Entry<String, Integer>> parIT = par.iterator();
		while(parIT.hasNext()) {
			Map.Entry<String, Integer> aux = parIT.next();
			System.out.println(aux.getKey() + " " + aux.getValue());
		}*/
	}
}
