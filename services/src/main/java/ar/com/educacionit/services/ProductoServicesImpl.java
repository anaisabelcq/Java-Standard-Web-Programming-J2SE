package ar.com.educacionit.services;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.ProductoDAOJDBCImpl;
import ar.com.educacionit.dao.exceptions.DuplicatedException;
import ar.com.educacionit.dao.exceptions.GenericException;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.services.exceptions.ServiceException;

public class ProductoServicesImpl implements ProductoServices {

	//interfaz
	private ProductoDAO productoDao;
	
	//ctrl + space
	public ProductoServicesImpl() {
		this.productoDao = new ProductoDAOJDBCImpl();
	}
	
	//alt+shift+s
	public Producto[] findProductos() {
		//CTRL +SHIFT + O
		return this.productoDao.findProductos();
	}

	@Override
	public void eliminarProducto(Long id) throws ServiceException {
		
		try {
			this.productoDao.deleteProducto(id);
		} catch (GenericException e) {
			e.printStackTrace();
			//CTRL + D
			throw new ServiceException(e.getMessage(), e);
		}
	}

	//ctrl +space
	//alt + <-     ->
	@Override
	public Producto nuevoProducto(Producto producto) throws ServiceException {
		
		try {
			//ctr+t
			return this.productoDao.insertProducto(producto);
		} catch (DuplicatedException | GenericException e) {
			e.printStackTrace();
			throw new ServiceException(e.getMessage(), e);
		}
	}
	
	@Override
	public void actualizarProducto(Producto producto) throws ServiceException {
		try {
			//ctr+t
			this.productoDao.updateProducto(producto);
		} catch (DuplicatedException | GenericException e) {
			e.printStackTrace();
			throw new ServiceException(e.getMessage(), e);
		}
	}

	@Override
	public Producto obtenerProducto(Long id) throws ServiceException {
		try {
			//ctr+t
			return this.productoDao.getProducto(id);
		} catch (GenericException e) {
			e.printStackTrace();
			throw new ServiceException(e.getMessage(), e);
		}
	}
}
