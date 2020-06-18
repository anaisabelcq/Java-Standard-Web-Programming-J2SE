package ar.com.educacionit.ui;

import java.util.Scanner;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.exceptions.ServiceException;

public class Alta extends EjecutableBase implements Ejecutable {

	@Override
	public void ejecutar(Scanner teclado) {
		System.out.print("Descripcion : ");
		String descripcion = teclado.next();
		
		teclado.next();
		
		System.out.print("Codigo: ");
		String  codigo = teclado.next();
		
		System.out.print("Precio: ");
		Float precio = teclado.nextFloat();
		
		//creo nuevo producto, solo acá!!! no existe en db
		Producto nuevoProducto = new Producto(descripcion, precio, codigo);
		
		try {
			ps.nuevoProducto(nuevoProducto);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

	}

}
