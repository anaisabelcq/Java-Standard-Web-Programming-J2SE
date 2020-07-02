package ar.com.educacionit.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParesMain {

	public static void main(String[] args) {
		
		List<Integer> valores = Arrays.asList(new Integer[] {0,1,2,3,4,5,6,7,8,9});
	
		List<Integer> valoresPares = new ArrayList<Integer>(valores.size());
		
		//imperativa
		for(Integer valor : valores) {
			if(valor % 2 == 0) {
				valoresPares.add(valor);
			}
		}
		
		List<String> valoresParesTexto = new ArrayList<String>(valoresPares.size());
		
		for(Integer valor : valoresPares) {
			if(valor % 2 == 0) {
				valoresParesTexto.add("Valor " + valor);
			}
		}
		
		for(String par : valoresParesTexto) {
			System.out.println("Valor: " + par);
		}
	}

}
