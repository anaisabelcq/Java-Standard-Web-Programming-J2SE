package ar.com.educacionit.services;

import java.util.Collection;

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

	public Collection<Producto> findProductos() throws ServiceException;
	
	public void actualizarProducto(Producto aux) throws ServiceException;

	public void eliminarProducto(Long id) throws ServiceException;
}
