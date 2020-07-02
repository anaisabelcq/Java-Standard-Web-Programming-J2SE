package ar.com.educacionit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParesMainStream2 {

	public static void main(String[] args) {
		
		List<Integer> valores = Arrays.asList(new Integer[] {0,1,2,3,4,5,6,7,8,9});

		List<Integer> pares = valores.stream()
				.filter(x-> x %2 ==0)
				.collect(Collectors.toList());
		
		pares.forEach(x -> System.err.println());
	}

}
