package ar.com.educacionit.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.dtos.LoginDTO;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.web.model.LoginModel;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	/**
	 * Recibe los datos enviados por login.jsp
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//obtener los parametros que viene en el request
		String user = req.getParameter("user");
		
		String password = req.getParameter("password");
		
		//LoginModel
		LoginModel model = new LoginModel(user, password);
		
		//llamar capa de servicio
		LoginService ls = new LoginServiceImpl();
		
		LoginDTO loginDto = new LoginDTO(model.getUserName(), model.getPassword());
		
		RequestDispatcher rd;
		
		try {
			boolean existeUsuario = ls.login(loginDto);
			
			if(existeUsuario) {
				//GUADAR EN LA SESION un dato
				req.getSession(true).setAttribute("userLogueado", Boolean.TRUE);
				
				rd = req.getRequestDispatcher("login-success.jsp");
			}else {
				rd = req.getRequestDispatcher("login-fail.jsp"); 
			}
		} catch (ServiceException e) {
			rd = req.getRequestDispatcher("login-error.jsp");
		}
		
		rd.forward(req, resp);
	}
}
