package ar.com.educacionit.web.servlet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import ar.com.educacionit.dao.exceptions.GenericException;
import ar.com.educacionit.domain.jdbc.AdministradorDeConexiones;
import ar.com.educacionit.dtos.LoginDTO;

public class LoginDaoJDBCImpl implements LoginDAO {

	@Override
	public boolean loguear(LoginDTO loginDto) throws GenericException {
		
		//select * from users where username='' and password = ''
		
		boolean existeUsuario;
		
		try {
			Connection conection = AdministradorDeConexiones.obtenerConexion();
			
			Statement st = conection.createStatement();
						
			//volver a consultar pero ahora todos los productos
			ResultSet rs = 
					st.executeQuery("select * from users where upper(username)='"+loginDto.getUserName().toUpperCase()+"' and upper(password )= '"+loginDto.getPassword().toUpperCase()+"'");
			
			existeUsuario = rs.next();
			
			conection.close();
			
			st.close();
			
			rs.close();
		}catch (Exception e) {
			throw new GenericException(e.getMessage(), e);
		}
		
		return existeUsuario;
	}

}
