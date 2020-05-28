package clase4;

import clase4.volador.Aterrizable;
import clase4.volador.Estado;

public class SuperMan extends SuperHeroe implements Aterrizable {

	public SuperMan(String nombre) {
		super(nombre, Boolean.TRUE);
	}

	//con redefinicion
	@Override
	public Estado aterrizar() {
		
		System.out.println(this.nombre + " aterrizando");
		
		return new Estado(false, "No hay criptonita, todo en orden");
	}
	
	
}
