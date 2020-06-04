package ar.com.educacionit.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.domain.jdbc.AdministradorDeConexiones;

public class ProductoDAOJDBCImpl implements ProductoDAO {

	public Producto getProducto() {
		try {
			Connection conection = AdministradorDeConexiones.obtenerConexion();
			
			Statement st = conection.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM producto");
			
			Producto producto = null;
			
			if(rs.next()) {
				//obtener los datos desde el rs
				Long id = rs.getLong(1);
				String descripcion = rs.getString(2);
				Float precio = rs.getFloat(3);
				String codigo =  rs.getString(4);
				
				producto = new Producto(id, descripcion, precio, codigo);
				System.out.println(producto);
			}
			conection.close();
			return producto;
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

}
