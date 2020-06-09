package ar.com.educacionit.dao;

import ar.com.educacionit.dao.exceptions.DuplicatedException;
import ar.com.educacionit.dao.exceptions.GenericException;
import ar.com.educacionit.domain.Producto;

public interface ProductoDAO {

	public Producto[] findProductos();
	
	/**
	 * Elimina un producto,dado su PK
	 * @throws GenericException 
	 */
	public void deleteProducto(Long id) throws GenericException;
	
	public Producto insertProducto(Producto producto) throws DuplicatedException, GenericException;
	
	/**
	 * Descripcion, Precio
	 * @param producto
	 * @return
	 * @throws DuplicatedException
	 * @throws GenericException
	 */
	public Producto updateProducto(Producto producto) throws DuplicatedException, GenericException;

	public Producto getProducto(Long id) throws GenericException;
}
