package ar.com.educacionit.web.servlet.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Producto;

@WebServlet(urlPatterns = "/generarArchivoErrorServlet")
public class GenerarArchivoErrorServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//bajar el listado de la sesion
		
		Object listadoObject = req.getSession().getAttribute("listadoFail");
		
		List<Producto> listadoFail = (List<Producto>)listadoObject;
		
		//url del file 
		
		String filePathOutput = "c:" + File.separator + "desarrollo" + File.separator + "listado-producto.error.csv";
		
		File outputFile= new File(filePathOutput);
		
		if(!outputFile.exists()) {
			Files.createFile(outputFile.toPath());
		}
		
		//abre el stream de escritura
		FileWriter fileWritter = new FileWriter(outputFile);
		
		StringBuffer linea = new StringBuffer("id;codigo;descripcion;precio;tipo_producto");
		fileWritter.write(linea.toString());
		
		for(Producto producto : listadoFail) {
			
			String lineaCSV = getStringFromProducto(producto);
			
			fileWritter.write(lineaCSV);
		}
		
		fileWritter.close();
		
		resp.setContentType("text/csv");
	    resp.setHeader("Content-Disposition", "attachment; filename=\"listado-producto.error.csv\"");
	    try
	    {
	        OutputStream outputStream = resp.getOutputStream();
	        outputStream.write(Files.readAllBytes(outputFile.toPath()));
	        outputStream.flush();
	        outputStream.close();
	    }
	    catch(Exception e)
	    {
	        System.out.println(e.toString());
	    }
	}
	
	private String getStringFromProducto(Producto producto) {
		StringBuffer linea = new StringBuffer("");
		linea.append(producto.getId() != null ? producto.getCodigo() : "");
		linea.append(";");
		linea.append(producto.getCodigo()).append(";");
		linea.append(producto.getDescripcion()).append(";");
		linea.append(producto.getPrecio()).append(";");
		linea.append(producto.getTipoProducto()).append("\n");
		return linea.toString();
	}
}
