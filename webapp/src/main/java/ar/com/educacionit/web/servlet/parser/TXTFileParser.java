package ar.com.educacionit.web.servlet.parser;

import java.io.IOException;

import ar.com.educacionit.domain.Producto;

public class TXTFileParser extends FileParser<Producto> {

	public TXTFileParser(String nombreArchivo) {
		super(nombreArchivo);
	}

	@Override
	public Producto parsearArchivo() throws IOException {

		
		return null;
	}

}
