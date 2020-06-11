package ar.com.educacionit.services.main;

import java.util.Collection;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;
import ar.com.educacionit.services.exceptions.ServiceException;

public class MainConection {

	public static void main(String[] args) throws ServiceException {
		
		//interfaz i = new Clase()
		
		ProductoServices pdao = new ProductoServicesImpl();

		Collection<Producto> productos = pdao.findProductos();
		
		for(Producto producto : productos) {
			System.out.println(producto);
		}
	}

}
