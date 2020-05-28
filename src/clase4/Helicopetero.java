package clase4;

import clase4.volador.Estado;

public class Helicopetero extends Maquina {

	public Helicopetero(String nombre) {
		super(nombre, Boolean.FALSE);
	}

	@Override
	public Estado aterrizar() {
		
		System.out.println(this.nombre + " aterrizando");
		
		// verifando alerones
		// calculando altitud
		boolean error = Maquina.contador % 2 != 0;
		return new Estado(error, "TODO EN O RDEN");
	}

	@Override
	public String toString() {
		return "Helicopetero [tieneTurbinas=" + tieneTurbinas + ", nombre=" + nombre + "]";
	}

}
