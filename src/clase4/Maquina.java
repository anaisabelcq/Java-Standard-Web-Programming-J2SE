package clase4;

import clase4.volador.Aterrizable;
import clase4.volador.Volador;

public abstract class Maquina extends Volador implements Aterrizable {

	protected static Integer contador = 0; 
	
	protected boolean tieneTurbinas;
	
	public Maquina(String nombre, boolean turbinas) {
		super(nombre);
		this.tieneTurbinas = turbinas;
		contador++;
	}

	public boolean isTieneTurbinas() {
		return tieneTurbinas;
	}

	public void setTieneTurbinas(boolean tieneTurbinas) {
		this.tieneTurbinas = tieneTurbinas;
	}

}
