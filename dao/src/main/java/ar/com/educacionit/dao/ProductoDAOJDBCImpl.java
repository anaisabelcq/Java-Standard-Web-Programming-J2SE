package ar.com.educacionit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import ar.com.educacionit.dao.exceptions.DuplicatedException;
import ar.com.educacionit.dao.exceptions.GenericException;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.domain.jdbc.AdministradorDeConexiones;

public class ProductoDAOJDBCImpl implements ProductoDAO {

	public Collection<Producto> findProductos() throws GenericException {

		Collection<Producto> productos = new ArrayList<Producto>();
		
		try {
			Connection conection = AdministradorDeConexiones.obtenerConexion();
			
			Statement st = conection.createStatement();
						
			//volver a consultar pero ahora todos los productos
			ResultSet rs = st.executeQuery("SELECT * FROM producto");
			
			Producto producto = null;
			
			while(rs.next()) {
				//obtener los datos desde el rs
				Long id = rs.getLong(1);
				String descripcion = rs.getString(2);
				Float precio = rs.getFloat(3);
				String codigo =  rs.getString(4);
				Long tipoProducto = rs.getLong(5);//tipo_producto
				
				producto = new Producto(id, descripcion, precio, codigo);
				producto.setTipoProducto(tipoProducto);
				productos.add(producto);
			}
			conection.close();
			return productos;
		} catch (Exception e) {			
			e.printStackTrace();
			throw new GenericException(e.getMessage());
		}
	}

	public void deleteProducto(Long id) throws GenericException{
		
		Connection connection = null;
		Statement st = null;
		try {
			
			connection = AdministradorDeConexiones.obtenerConexion();
			
			connection.setAutoCommit(false);
			
			st = connection.createStatement();
			
			int rows = st.executeUpdate("DELETE FROM producto where id = " + id);
			
			if(rows > 0) {
			
				connection.commit();
			} else {
				throw new GenericException("No existe el producto con id= " + id);
			}
		} catch (Exception e) {	
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				throw new GenericException(e1.getMessage(), e1);
			}
		} finally {
			//siempre, try, catch
			try {
				st.close();
				connection.close();
			} catch (SQLException e) {
				throw new GenericException(e.getMessage(), e);
			}
		}
	}

	//CTRL +SPACE
	@Override
	public Producto insertProducto(Producto producto) throws DuplicatedException, GenericException {
		
		Connection connection = null;
		Statement st = null;
		try {
			
			connection = AdministradorDeConexiones.obtenerConexion();
			
			connection.setAutoCommit(false);
			
			st = connection.createStatement();
			
			st.executeUpdate
	("INSERT INTO producto (DESCRIPCION, PRECIO, CODIGO, TIPO_PRODUCTO) VALUES('"+producto.getDescripcion()+"', "+producto.getPrecio()+", '"+ producto.getCodigo()+"', "+producto.getTipoProducto()+")", Statement.RETURN_GENERATED_KEYS);
			
			ResultSet rs=st.getGeneratedKeys();
			
			int id;
			
			if(rs.next()){
				id = rs.getInt(1);
				producto.setId(new Long(id));
			}
			
			connection.commit();
			
		}catch(SQLIntegrityConstraintViolationException sicve) {
			throw new DuplicatedException(sicve.getMessage(), sicve);
		} catch (Exception e) {	
			
			try {
				connection.rollback();
				throw new GenericException(e.getMessage(), e);
			} catch (SQLException e1) {
				throw new GenericException(e1.getMessage(), e1);
			}
		} finally {
			//siempre, try, catch
			try {
				st.close();
				connection.close();
			} catch (SQLException e) {
				throw new GenericException(e.getMessage(), e);
			}
		}
		return producto;
	}

	@Override
	public Producto updateProducto(Producto producto) throws DuplicatedException, GenericException {
		Connection connection = null;
		Statement st = null;
		try {
			
			connection = AdministradorDeConexiones.obtenerConexion();
			
			connection.setAutoCommit(false);
			
			st = connection.createStatement();
			
			int rows = st.executeUpdate("UPDATE producto SET precio="+producto.getPrecio()+" , desripcion='"+producto.getDescripcion()+"'  WHERE id="+producto.getId()+"" );
			
			connection.commit();
			
		}catch(SQLIntegrityConstraintViolationException sicve) {
			throw new DuplicatedException(sicve.getMessage(), sicve);
		} catch (Exception e) {	
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				throw new GenericException(e1.getMessage(), e1);
			}
		} finally {
			//siempre, try, catch
			try {
				st.close();
				connection.close();
			} catch (SQLException e) {
				throw new GenericException(e.getMessage(), e);
			}
		}
		return producto;
	}

	public Producto getProducto(Long id) throws GenericException {
		
		Producto producto = null;
		
		Connection connection = null;
		Statement st = null;
		try {
			connection = AdministradorDeConexiones.obtenerConexion();
			
			st = connection.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM producto where id = " + id);
			
			if(rs.next()) {
				//obtener los datos desde el rs
				Long idAux = rs.getLong(1);
				String descripcion = rs.getString(2);
				Float precio = rs.getFloat(3);
				String codigo =  rs.getString(4);
				
				producto = new Producto(idAux, descripcion, precio, codigo);
			}
			return producto;
		} catch (Exception e) {	
			
			try {
				connection.rollback();
				throw new GenericException(e.getMessage(),e);
			} catch (SQLException e1) {
				throw new GenericException(e1.getMessage(), e1);
			}
		} finally {
			//siempre, try, catch
			try {
				st.close();
				connection.close();
			} catch (SQLException e) {
				throw new GenericException(e.getMessage(), e);
			}
		}
	}
}
