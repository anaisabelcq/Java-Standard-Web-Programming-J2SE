package ar.com.educacionit.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.services.ProductoServices;
import ar.com.educacionit.services.ProductoServicesImpl;

/**
 * READ -> GET
 * @author CX PC
 *
 */
@WebServlet(urlPatterns = "/listado")
public class ListadoProductosServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// guardar informacion en el request
		// para mostrarlo en una jsp
		ProductoServices ps = new ProductoServicesImpl();
		try {
			req.getSession().setAttribute("productos", ps.findProductos());
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		//redireccion req + resp
		req.getRequestDispatcher("listado.jsp").forward(req, resp);
	}
}
