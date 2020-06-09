package ar.com.educacionit.services.main;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;

public class MainConection {

	public static void main(String[] args) {
		
		//interfaz i = new Clase()
		
		ProductoServices pdao = new ProductoServicesImpl();

		Producto[] productos = pdao.findProductos();
		
		for(Producto producto : productos) {
			System.out.println(producto);
		}
	}

}
