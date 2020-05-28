package clase4.volador;

public abstract class Volador {

	protected String nombre;
	
	public Volador(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//get/set
}
