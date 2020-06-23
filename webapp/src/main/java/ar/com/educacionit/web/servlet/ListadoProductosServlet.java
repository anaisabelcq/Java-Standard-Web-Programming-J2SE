package ar.com.educacionit.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

		List<String> nombres = new ArrayList<String>();
		nombres.add("alejandro");
		nombres.add("ana isabel");
		nombres.add("ariel");
		
		req.setAttribute("nombres", nombres);
		
		//redireccion req + resp
		req.getRequestDispatcher("listado.jsp").forward(req, resp);
	}
}
