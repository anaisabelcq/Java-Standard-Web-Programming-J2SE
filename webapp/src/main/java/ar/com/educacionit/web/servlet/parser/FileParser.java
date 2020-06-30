package ar.com.educacionit.web.servlet.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.domain.Producto;

public class FileParser {

	private String nombre;
	
	public FileParser(String nombreArchivo) {
		this.nombre = nombreArchivo;
	}
	
	public List<Producto> parseArchivo() throws IOException {

		List<Producto> listado = new ArrayList<Producto>();
	
		File file = new File(this.nombre);
		
		FileReader fileReader = new FileReader(file);
		
		//Buffer!!! lectura/ escritura mas optima
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String lineaLeida = null;
		
		//logica de lectura
		
		boolean primerLinea = true;
		
		while( (lineaLeida = bufferedReader.readLine()) != null ) {
			
			if(!primerLinea) {
				String[] array = lineaLeida.split(";");
				/*
				 * 	[0]=a002
					[1]=motog7
					[2]=15500
					[3]=1
				 */
				Producto producto = new Producto(array[1], Float.parseFloat(array[2]), array[0]);
				producto.setTipoProducto(Long.parseLong(array[3]));
				
				listado.add(producto);
			}else {
				//codigo;descripcion;precio;tipo_producto
				primerLinea = false;
			}
		}
		
		bufferedReader.close();
		
		return listado;
	}
}
