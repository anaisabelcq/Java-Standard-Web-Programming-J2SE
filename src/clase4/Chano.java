package clase4;

import clase4.volador.Aterrizable;
import clase4.volador.Estado;
import clase4.volador.Volador;

public class Chano extends Volador implements Aterrizable{

	public Chano(String nombre) {
		super(nombre);
	}

	@Override
	public Estado aterrizar() {
		
		return new Estado(true, "Chano aterrizó un poco duro");
	}

	@Override
	public String toString() {
		return "Chano [nombre=" + nombre + "]";
	}
	
}
