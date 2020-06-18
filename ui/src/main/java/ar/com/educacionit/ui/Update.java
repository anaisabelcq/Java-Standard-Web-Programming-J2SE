package ar.com.educacionit.ui;

import java.util.Scanner;

import ar.com.educacionit.domain.Producto;

public class Update extends EjecutableBase implements Ejecutable {

	@Override
	public void ejecutar(Scanner teclado) {

		System.out.println("Ingreso código de producto a actualizar");

		Long id = teclado.nextLong();

		try {
			Producto aux = ps.obtenerProducto(id);

			if (aux != null) {
				System.out.println("Producto encontrado: " + aux);

				// udpate del objeto
				System.out.println("Ingrese los datos a actualizar");

				System.out.print("Precio: ");
				Float precio = teclado.nextFloat();
				aux.setPrecio(precio);

				System.out.print("Descripcion : ");
				String descripcion = teclado.next();
				aux.setDescripcion(descripcion);

				ps.actualizarProducto(aux);

				System.out.println("Producto actualizado");
			} else {
				System.out.println("El id indicado no exite en la db");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
