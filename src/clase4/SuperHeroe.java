package clase4;

import clase4.volador.Volador;

public class SuperHeroe extends Volador {

	protected Boolean tieneCapa;
	
	public SuperHeroe(String nombre, Boolean tieneCapa) {
		super(nombre);
		this.tieneCapa = tieneCapa;
	}

	public Boolean getTieneCapa() {
		return tieneCapa;
	}

	public void setTieneCapa(Boolean tieneCapa) {
		this.tieneCapa = tieneCapa;
	}

}
