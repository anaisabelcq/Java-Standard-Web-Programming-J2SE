package ar.com.educacionit.services.main;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;
import ar.com.educacionit.services.exceptions.ServiceException;

public class DeleteMain {

	public static void main(String[] args) throws ServiceException {
		
		ProductoServices service = new ProductoServicesImpl();

		Producto[] productos = service.findProductos();
		
		if(productos.length > 0) {
			
			Producto p = productos[0];
			
			service.eliminarProducto(p.getId());
		}
		
		// service.eliminarProducto(1L);
	}
}
