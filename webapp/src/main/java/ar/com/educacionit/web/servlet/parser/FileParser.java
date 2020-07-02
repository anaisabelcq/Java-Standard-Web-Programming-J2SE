package ar.com.educacionit.web.servlet.parser;

import java.io.IOException;

public abstract class FileParser<T> {

	protected String nombre;
	
	public FileParser(String nombreArchivo) {
		this.nombre = nombreArchivo;
	}
	
	public abstract T parsearArchivo() throws IOException;

	public String getNombre() {
		return nombre;
	}
	
}
