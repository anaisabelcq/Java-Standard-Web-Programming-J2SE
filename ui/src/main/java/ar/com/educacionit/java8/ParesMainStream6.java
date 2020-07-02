package ar.com.educacionit.java8;

import java.util.Arrays;
import java.util.List;

public class ParesMainStream6 {

	public static void main(String[] args) {
		
		List<Integer> valores = Arrays.asList(new Integer[] {0,1,2,3,4,5,6,7,8,9});

		Integer suma = valores.stream().reduce(100,  Integer::sum );
		
		System.out.println(suma);
	}

}
