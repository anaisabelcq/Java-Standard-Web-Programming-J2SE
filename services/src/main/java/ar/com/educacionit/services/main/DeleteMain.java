package ar.com.educacionit.services.main;

import java.util.Collection;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;
import ar.com.educacionit.services.exceptions.ServiceException;

public class DeleteMain {

	public static void main(String[] args) throws ServiceException {
		
		ProductoServices service = new ProductoServicesImpl();

		Collection<Producto> productos = service.findProductos();
		
		if(!productos.isEmpty()) {
			
			Producto p = productos.iterator().next();
			
			service.eliminarProducto(p.getId());
		}
		
		// service.eliminarProducto(1L);
	}
}
