package ar.com.educacionit.web.servlet;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Producto;
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
			
			Collection<Producto> productos = ps.findProductos();
			
			req.getSession().setAttribute("productos", productos);
			
			//necesito el total
			Float precioTotal =
					productos.stream()
					.map(p->p.getPrecio())
					.reduce(0f, Float::sum );
			
			req.setAttribute("total", precioTotal);
			
			//lista de producros con precio >= 25500
			// pipile de operaciones
			List<Producto> pf = productos.stream()
					.filter(p-> p.getPrecio() >= 25500)
					.collect(Collectors.toList());
			
			req.getSession().setAttribute("productosFiltrados", pf);
			
			//necesito el total
			Float precioTotalFiltrados =
					pf.stream()
					.map(p->p.getPrecio())
					.reduce(0f, Float::sum );
			
			req.getSession().setAttribute("totalProductosFiltrados", precioTotalFiltrados);
		}catch (Exception e) {
		}
		
		//redireccion req + resp
		req.getRequestDispatcher("listado.jsp").forward(req, resp);
	}
}
