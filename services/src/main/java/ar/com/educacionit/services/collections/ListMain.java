package ar.com.educacionit.services.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ListMain {

	public static void main(String[] args) {

		//COLECCIONES
		//interfaz i = new clase()
		
		//"tipar" parametrizar una coleccion
		Collection<Integer> lista2 = new HashSet<>();
		
		//carga una lista
		lista2.add(10);
		lista2.add(20);
		
		lista2.add(30);
		lista2.add(30);
		
		lista2.add(40);
		
		//recorro una lista
		Iterator<Integer> listaEnteros =  lista2.iterator();
		
		// ()
		//while
		while(listaEnteros.hasNext()) {
			
			Integer valor = listaEnteros.next();
			
			//System.out.println(valor);
		}
		
		//elimino un elmento de una coleccion
		
		listaEnteros = lista2.iterator();
		
		System.out.println("Recorrido de lista");
		while(listaEnteros.hasNext()) {
			Integer valor = listaEnteros.next();
			
			if(valor == 20) {
				listaEnteros.remove();
			}
			
			System.out.println(valor);
		}
		
		System.out.println("Antes de ordenar");
		// "[10,20,30,]"
		System.out.println( lista2 );
		
		//1) usando Collections.sort(List)
		/*lista2 = new ArrayList<Integer>(lista2);
		Collections.sort( (List)lista2);
		
		System.out.println("Despues de ordenar");
		System.out.println( lista2 );*/
		
		//2) forma 
		/*lista2 = new ArrayList<Integer>(lista2);
		Collections.sort( (List)lista2,
				
				new Comparator<Integer> (){
					public int compare(Integer o1, Integer o2) {
						return o1 - o2;
					}
				}
		);
		System.out.println("Despues de ordenar");
		System.out.println(lista2);
		*/
		//3 forma
		
		TreeSet<Integer> treeEnteros = new TreeSet<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		//addAll
		treeEnteros.addAll(lista2);
		
		System.out.println(treeEnteros);
	}

}
