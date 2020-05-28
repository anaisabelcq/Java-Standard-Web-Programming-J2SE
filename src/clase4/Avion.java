package clase4;

import clase4.volador.Estado;

public class Avion extends Maquina {

	public Avion(String nombre) {
		super(nombre, Boolean.TRUE);
	}

	@Override
	public Estado aterrizar() {
		
		System.out.println(this.nombre + " aterrizando");
		
		// verifando alerones
		// calculando altitud
		boolean error = Maquina.contador % 2 == 0;
		return new Estado(error, "TODO EN O RDEN");
	}

	@Override
	public String toString() {
		return "Avion [tieneTurbinas=" + tieneTurbinas + ", nombre=" + nombre + "]";
	}

}
