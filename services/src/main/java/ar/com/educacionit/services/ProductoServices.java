package ar.com.educacionit.services;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.exceptions.ServiceException;

/**
 * CRUD
 * @author CX PC
 *
 */
public interface ProductoServices {

	public Producto nuevoProducto(Producto producto) throws ServiceException;

	public Producto obtenerProducto(Long id) throws ServiceException;

	public Producto[] findProductos();
	
	public void actualizarProducto(Producto aux) throws ServiceException;

	public void eliminarProducto(Long id) throws ServiceException;
}
