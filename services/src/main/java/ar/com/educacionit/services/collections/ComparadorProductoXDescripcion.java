package ar.com.educacionit.services.collections;

import java.util.Comparator;

import ar.com.educacionit.domain.Producto;

public class ComparadorProductoXDescripcion implements Comparator<Producto> {

	@Override
	public int compare(Producto p1, Producto p2) {
		
		//logica de comparacion
		
		return p1.getDescripcion().compareTo(p2.getDescripcion());	
	}

}
