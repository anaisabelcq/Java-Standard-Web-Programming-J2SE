package clase3.archivo;

public class TXT extends Archivo {

	public TXT() {
		this.tipo = "TXT";
	}
	
	public TXT(String nombre, Long tamanio) {
		/*
		setNombre(nombre);
		
		setTamanio(tamanio);
		*/
		this.tipo = "TXT";
		
		this.nombre = nombre;
		
		this.tamanio = tamanio;
	}
}
