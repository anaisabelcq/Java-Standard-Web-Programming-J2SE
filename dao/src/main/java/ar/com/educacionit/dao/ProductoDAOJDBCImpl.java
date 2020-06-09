package ar.com.educacionit.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import ar.com.educacionit.dao.exceptions.DuplicatedException;
import ar.com.educacionit.dao.exceptions.GenericException;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.domain.jdbc.AdministradorDeConexiones;

public class ProductoDAOJDBCImpl implements ProductoDAO {

	public Producto[] findProductos() {
		try {
			Connection conection = AdministradorDeConexiones.obtenerConexion();
			
			Statement st = conection.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT count(*) FROM producto");
			
			Producto[] productos = null;
			
			if(rs.next()) {
				Long size = rs.getLong(1);//cuantos son los productos
				System.out.println("hay " + size + " productos");
				productos = new Producto[size.intValue()];
			}
			
			//volver a consultar pero ahora todos los productos
			rs = st.executeQuery("SELECT * FROM producto");
			
			Producto producto = null;
			
			int i = 0;
			while(rs.next()) {
				//obtener los datos desde el rs
				Long id = rs.getLong(1);
				String descripcion = rs.getString(2);
				Float precio = rs.getFloat(3);
				String codigo =  rs.getString(4);
				
				producto = new Producto(id, descripcion, precio, codigo);
				productos[i] = producto;
				i++;
			}
			conection.close();
			return productos;
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
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
			
			st.executeUpdate("INSERT INTO producto (DESRIPCION, PRECIO, CODIGO) VALUES('"+producto.getDescripcion()+"', "+producto.getPrecio()+", "+producto.getCodigo()+")", Statement.RETURN_GENERATED_KEYS);
			
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
