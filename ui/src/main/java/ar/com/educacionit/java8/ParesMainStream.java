package ar.com.educacionit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParesMainStream {

	public static void main(String[] args) {
		
		List<Integer> valores = Arrays.asList(new Integer[] {0,1,2,3,4,5,6,7,8,9});

		//java8+
		Stream<Integer> paresStream  = valores.stream();
		
		//funcion intermeda filter
		Stream<Integer> paresFiltrados = paresStream.filter( valor -> valor %  2 == 0);
		
		//funcion terminal collector
		List<Integer> pares = paresFiltrados.collect(Collectors.toList());
		
		pares.forEach(x -> System.out.println(x));
	}

}
