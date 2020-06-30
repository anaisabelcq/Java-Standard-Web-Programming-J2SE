package ar.com.educacionit.web.servlet.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/loadArchivoServlet")
public class LoadArchivoServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Object file = req.getParameter("file");
		//ctrl + shift +i 
		String filePath = getServletContext().getRealPath("nuevos-productos.csv");
		
		//File para refrenciar al archivo dentro de la aplicacion
		File inputFile = new File(filePath);

		//reader para leer la el contenido
		FileReader lectorDeArchivo = new FileReader(inputFile);
		
		//logica de lectura
		int unCaracter;
		
		System.out.println("Leyendo archivo nuevos-productos.csv" );
		
		//mientras exista algo, seguir leyendo
		while( (unCaracter = lectorDeArchivo.read()) != -1) {
			//
			System.out.print((char)unCaracter);
		}
		
		//cerramos el lector para no bloquear el file
		lectorDeArchivo.close();
	}
}
