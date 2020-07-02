package ar.com.educacionit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParesMainStream3 {

	public static void main(String[] args) {
		
		List<Integer> valores = Arrays.asList(new Integer[] {0,1,2,3,4,5,6,7,8,9});

		//map
		List<String> paresTexto = valores.stream()
				.filter(y -> y %2 ==  0)
				.map( z-> "Valor" + z)
				.collect(Collectors.toList());
		
	}

}
