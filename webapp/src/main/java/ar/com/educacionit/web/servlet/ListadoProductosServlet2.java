package ar.com.educacionit.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet(urlPatterns = "/listado2")
public class ListadoProductosServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// guardar informacion en el request
		// para mostrarlo en una jsp
		ProductoServices ps = new ProductoServicesImpl();
		try {
			
			Collection<Producto> productos = ps.findProductos();
			
			//for each
			productos.forEach(producto -> System.out.println(producto.getCodigo()));
			
			//map
			List<Float> totalList = productos.stream()
					.map(x -> x.getPrecio())
					.collect(Collectors.toList());
			
			//reduce
			Float precioTotal = totalList.stream().reduce(0f, Float::sum );
			
			List<Producto> productosFiltrados = productos.stream()
				.peek(x -> System.out.print("ids sin filtrar" + x.getId()))
				.filter(x-> x.getPrecio() > 1500F)
				.peek(x -> System.out.print("ids luego filtrar" + x.getId()))
				.collect(Collectors.toList());
			
			req.getSession().setAttribute("productos", ps.findProductos());
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		//redireccion req + resp
		req.getRequestDispatcher("listado.jsp").forward(req, resp);
	}
}
